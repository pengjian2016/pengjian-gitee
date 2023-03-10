# JVM 内存结构（java 内存结构）

借用JavaGuide哥的两张图（看过不少描述图，这两张是我最喜欢的）：

JDK 1.8 之前：

![JDK 1.8 之前](https://images.gitee.com/uploads/images/2021/0114/092916_26d1a1f8_8076629.png "JDK 1.8 之前.png")


JDK 1.8

![JDK 1.8](https://images.gitee.com/uploads/images/2021/0114/092946_7ca8963a_8076629.png "JDK 1.8.png")


参考：[Java内存区域](https://snailclimb.gitee.io/javaguide/#/docs/java/jvm/Java%E5%86%85%E5%AD%98%E5%8C%BA%E5%9F%9F)

### 1. JVM 内存结构描述

#### 1.1 程序计数器

程序计数器中只存储当前线程执行程序的行号，一个类指针的数据结构。

字节码解释器工作时就是通过改变这个计数器的值来选取下一条需要执行的字节码指令。

我们熟悉的分支操作、循环操作、跳转、异常处理和线程恢复等基础模型都需要依赖这个计数器来完成。

JVM的多线程是通过CPU时间片轮转来实现的，某个线程在执行的过程中可能会因为时间片耗尽而挂起。当它再次获取时间片时，需要从挂起的地方继续执行。在JVM中，通过程序计数器来记录程序的字节码执行位置。程序计数器具有线程隔离性，每个线程拥有自己的程序计数器。

#### 1.2 Java 虚拟机栈

Java虚拟机栈描述的是Java方法执行时的内存模型，每个方法在执行时都会创建一个栈帧，而每个栈帧中包含：局部变量表、操作数栈、动态连接、方法出口信息等；java虚拟机栈栈顶的栈帧就是当前执行方法的栈帧，而如果当前方法调用其他方法时又会创建一个新的栈帧并放到栈顶。（可能有点绕，在理解的前提下是你已经熟悉了栈的概念）

栈帧：
- 局部变量表：即在方法内部定义的变量：boolean、byte、char、short、int、float、long、double，对象引用(reference 类型，它不同于对象本身，可能是一个指向对象起始地址的引用指针，也可能是指向一个代表对象的句柄或其他与此对象相关的位置)

- 操作数栈: 结构与局部变量类似，存放的是局部变量的复制内容，计算的中间值或临时值等，比如将局部变量的a，b两个值压入操作数栈中，计算他们的结果，然后将结果又压入操作数栈中。

- 动态连接：每个栈帧都包含一个指向运行时常量池中该栈帧所属方法的引用。Class文件的常量池中存有大量的符号引用，字节码中的方法调用指令就以常量池中方法的符号引用为参数。这些符号引用一部分会在类加载阶段或者第一次使用的时候就转化为直接引用（静态方法，私有方法等），这种转化称为静态解析，另一部分将在每一次运行期间转化为直接引用，这部分称为动态连接。

- 方法出口信息（方法返回地址）:在方法调用结束后，必须返回到该方法最初被调用时的位置，程序才能继续运行，所以在栈帧中要保存一些信息，用来帮助恢复它的上层主调方法的执行状态。方法返回地址就可以是主调方法在调用该方法的指令的下一条指令的地址。


### 1.3 本地方法栈

与Java 虚拟机栈 非常类似，它是java调用Native 方法时开辟的内存。Navtive 方法是 Java 通过 JNI 直接调用本地 C/C++ 库，可以认为是 Native 方法相当于 C/C++ 暴露给 Java 的一个接口，Java 通过调用这个接口从而调用到 C/C++ 方法。

### 1.4 堆
堆是虚拟机中主要的区域，所有的对象实例以及数组都在堆上分配，常说的垃圾回收（GC），也主要是指这里。
注：由于JIT技术的成熟，如果某些方法中的对象引用没有被返回或者未被外面使用（也就是未逃逸出去），那么对象可以直接在栈上分配内存，所以并非绝对的都是在堆上分配

堆又可以细分为：
- 新生代
- 老年代

注：G1之后的垃圾收集器虽然也有新生代和老年代的概念，但是实际在堆上划分的内存已经不是按照新生代，老年代的比例划分了，而是多个大小相同的区域。

### 1.5 方法区（元空间）

方法区/元空间，主要存放的是已加载的类信息、属性信息、方法信息、常量池、静态变量、即时编译器编译后的代码缓存。

已加载的类信息：
- 类的完整有效名称：包名和类名
- 类的直接父类完整有效名称；
- 类的修饰符（public abstract final）
- 类的直接接口列表；

属性信息（类中的成员变量）：修饰符（public，private，final，static等），类型（int，double等），属性名称

方法信息（类的方法信息）：方法的名称，方法的返回类型，方法的参数，方法的修饰符，方法的局部变量表和操作数栈，异常信息表；

常量池：

- Class文件常量池：包含字面量和符号引用，字面量如类中定义的字符串，final修饰的变量等；符号引用：方法名、方法描述符、类名、字段名，字段描述符，比如在类中定义了String a 变量，它会将String这个类型转换为符号引用，这样在运行时能通过这个引用找到对应的类进行解析等，再比如调用其他类的方法等，就会存储该类的方法引用等；
  
- 运行时常量池：当类加载到内存中后，jvm 就会将class常量池中的内容存放到运行时常量池中，运行时常量池也是每个类都有一个。并且在类加载的解析阶段会把运行时常量池的符号引用替换成直接引用，这个过程需要查找字符串常量池

- 字符串常量池：

```
String a= "hellow";
String b= new String("hellow");
```

第一种方式声明的字面量hellow是在编译期就已经确定的，它会直接进入class文件常量池中；当运行期间在全局字符串常量池中会保存它的一个引用.实际上最终还是要在堆上创建一个”hellow”对象。

第二种方式方式使用了new String()，也就是调用了String类的构造函数，我们知道new指令是创建一个类的实例对象并完成加载初始化的，因此这个字符串对象是在运行期才能确定的，创建的字符串对象是在堆内存上。

class文件里常量池里大部分数据会被加载到“运行时常量池”，包括String的字面量；但同时“Hello”字符串的一个引用会被存到“字符串常量池”中

字符串常量池是JVM所维护的一个字符串实例的引用表

静态变量：类变量，类的所有实例都共享，我们只需知道，在方法区有个静态区，静态区专门存放静态变量和静态块

方法区（元空间）在JDK 1.8后使用的是直接内存，即系统的实际内存。

#### 什么情况会触发FULL GC?

#### 对象可以在栈中分配吗？
