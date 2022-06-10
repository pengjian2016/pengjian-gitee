### JDK 动态代理
自 JDK 1.3 以后，Java 提供了动态代理技术，允许开发者在运行期创建接口的代理实例，
后来这项技术被用到了 Spring 的很多地方。JDK 动态代理主要涉及 java.lang.reflect 包下边的两个类：Proxy 和 InvocationHandler。其中，InvocationHandler 是一个接口，可以通过实现该接口定义横切逻辑（如：我们在方法执行前后打印的日志，本文只是为了演示，实际的应用一般不会只是简单的打印日志的），并通过反射机制调用目标类的代码，动态地将横切逻辑和业务逻辑编织在一起

JDK 动态代理是不需要第三方库支持，只需要 JDK 环境就可以进行代理，使用条件

业务目标对象实现接口
实现 InvocationHandler 接口
使用 Proxy.newProxyInstance() 方法生成代理对象
JDK 动态代理的话，它有一个限制，就是它只能为接口创建代理实例，而对于没有通过接口定义业务方法的类，如何创建动态代理实例哪？答案就是 CGLib

JDK 动态代理实现原理：https://blog.csdn.net/weixin_38192427/article/details/113093728
Java 中的反射机制与动态代理：https://blog.csdn.net/weixin_38192427/article/details/120347850

CGLIB 动态代理
CGLIB 是一个基于 ASM 的字节码生成库，它允许我们在运行时对字节码进行修改和动态生成。CGLIB 通过继承方式实现代理，在子类中采用方法拦截的技术拦截所有父类方法的调用并顺势织入横切逻辑

JDK 动态代理与 CGLIB 动态代理区别
JDK 动态代理只能针对接口实现类生成代理实例，而不能针对类；也就是说它是面向接口的
CGLIB 是针对类实现代理，主要是对指定的类生成一个子类，并覆盖其中方法实现增强，但是因为采用的是继承，所以该类或方法最好不要声明成 final，对于 final 类或方法，是无法继承的
Spring 中何时使用 JDK 或 CGLIB
如果目标对象实现了接口，默认情况下会采用 JDK 的动态代理实现 AOP
如果目标对象实现了接口，也可以强制使用 CGLIB 实现 AOP
如果目标对象没有实现接口，必须采用 CGLIB，Spring 会自动在 JDK 动态代理和 CGLIB 之间转换
如何强制使用 CGLIB 实现 AOP
添加 CGLIB 库（aspectjrt-xxx.jar、aspectjweaver-xxx.jar、cglib-nodep-xxx.jar）
在 Spring 配置文件中加入<aop:aspectj-autoproxy proxy-target-class="true"/>
为什么 JDK 动态代理只能代理接口实现类
要回答这个问题，就要熟悉 JDK 动态代理的原理，可以 参考这里；JDK 动态代理所生成的代理类 $Proxy0 继承了 Proxy 类，并且实现了我们定义业务的接口，重写了我们接口的方法，如此才实现代理的功能，所以我们的目标类需要实现接口