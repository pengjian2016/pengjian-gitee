
### spring IOC和AOP

#####  什么是IOC？

Inversion of Control 控制反转，它是一种设计思想，在开发过程中对象的创建及管理过程交由容器来完成，不再是我们自己创建，控制权由程序代码转移到了Spring容器，控制权发生了反转，即控制反转。又叫依赖注入。

Spring IOC提供了两种IOC容器，分别是BeanFactory和ApplicationContext。



##### 什么是AOP？

AOP的全程是"Aspect Oriented Programming"，即面向切面编程，它将业务逻辑的各部分进行隔离，使开发人员在编写业务逻辑时可以专心核心业务，从而提高开发基础。

AOP如何实现呢？答案就是代理对象。

Spring AOP使用动态代理技术在运行期间织入增强的代码，主要有两种代理机制：基于JDK的动态代理；基于cglib的动态代理。当被代理的类实现了接口则使用JDK动态代理，否则使用cglib。

jdk动态代理和cglib动态代理的区别?

JDK动态代理只能代理实现了接口的类，而cglib不仅可以代理实现了接口的类同时还能代理普通类，主要是因为它是继承被代理的类，在其上实现增强效果，当然因为是继承关系，所以被代理的类要要注意不能是final修饰的，不能是private方法，否则没有效果。


### springMVC和springboot区别？

说道springMVC和springboot，不得不说一下spring框架，spring是什么？它是一个轻量级的java框架，是所有spring开源项目的总称，springmvc就是其中的一个开源项目。

springmvc是什么呢？

它是一个用于开发Web工程的MVC框架，MVC是什么？既是所谓的Model，View，Controller，实际上就是业务上的分层，比如Model层主要专注于数据方面的处理（主要与数据库等打交道），View专注于UI，Controller专注于逻辑处理等。springmvc就是集成这些东西，快速构建项目等。

springboot是什么呢？

SpringBoot是由Pivotal团队在2013年开始研发、2014年4月发布第一个版本的全新开源的轻量级框架。它基于Spring4.0设计，不仅继承了Spring框架原有的优秀特性，而且还通过简化配置来进一步简化了Spring应用的整个搭建和开发过程。另外SpringBoot通过集成大量的框架使得依赖包的版本冲突，以及引用的不稳定性等问题得到了很好的解决。简单来讲SpringBoot是一套整合了框架的框架。实际上也没有什么新东西，就是把之前搞得一堆东西融合在一块，更加优雅，更加容易上手等。

区别：springmvc更加专注于web项目，springboot更倾向于微服务接口等（前后端分离，移动端接口等）

### springboot 配置文件加载顺序（优先级）？

以下为一个简单的springboot项目结构：

```
project
|--config
|----application.properties or yml 配置文件1
|--application.properties or yml  配置文件2
|--src
|----main
|------java
|------resource
|--------config
|----------application.properties or yml  配置文件3
|--------application.properties or yml  配置文件4
```

启功时加载顺序为 4、3、2、1

但是配置文件的优先级覆盖却是反过来的，即：1>2>3>4

假如4、3、2、1中都有一项配置为：
```
# 配置文件4
server.port=8084
# 配置文件3
server.port=8083
# 配置文件2
server.port=8082
# 配置文件1
server.port=8081
```

那么该配置的最后至应该是server.port=8081


### springboot 自动装配原理

在 @SpringBootApplication 这个注解里面，有3个重要的注解

```
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })

```

1. @SpringBootConfiguration 注解里面，没做太多的事情，主要是对@Configuration注解的封装，主要作用是标注这个类是配置类，功能与@Configuration一样

2. @ComponentScan 是扫描包的注解，自动扫描符合条件的bean（如@Service、@Controller、@Repository等等注解的类）加载到容器中

3. @EnableAutoConfiguration 这个注解便是自动装配的关键，在该注解中会去 引入 @Import(AutoConfigurationImportSelector.class) 这个类，它实现了DeferredImportSelector.Group中的process方法其内部会调用getAutoConfigurationEntry()方法，springboot启动得时候会找到ImportSelector类并调用process方法，下面主要分析getAutoConfigurationEntry源码（当前基于springboot 2.3.4 如果你发现你看的源码不一样，那可能是版本不一样的原因）：


```

protected AutoConfigurationEntry getAutoConfigurationEntry(AnnotationMetadata annotationMetadata) {
	if (!isEnabled(annotationMetadata)) {
		return EMPTY_ENTRY;
	}
	AnnotationAttributes attributes = getAttributes(annotationMetadata);
        // getCandidateConfigurations 方法会调用 SpringFactoriesLoader.loadFactoryNames()
        // 在 loadFactoryNames() 中通过loadSpringFactories()方法加载 META-INF/spring.factories 配置文件
        // 读取配置文件中的内容后过滤出 org.springframework.boot.autoconfigure.EnableAutoConfiguration 这个key对应的所有value 
        // 返回的内容即是要加载的所有类，但是并不是所有的模块都能用到，所以下面会进行过滤，过滤掉不满足条件的配置
	List<String> configurations = getCandidateConfigurations(annotationMetadata, attributes);
	configurations = removeDuplicates(configurations);
	Set<String> exclusions = getExclusions(annotationMetadata, attributes);
	checkExcludedClasses(configurations, exclusions);
	configurations.removeAll(exclusions);
        // 对configurations进行过滤，剔除掉@Conditional条件不成立的配置类（比如某个配置可能需要某个特定的类，该类属于某个包，如果未引入包，则会过滤掉）
	configurations = getConfigurationClassFilter().filter(configurations);
	fireAutoConfigurationImportEvents(configurations, exclusions);
	return new AutoConfigurationEntry(configurations, exclusions);
}

META-INF/spring.factories 文件 org.springframework.boot.autoconfigure.EnableAutoConfiguration 对应的部分内容（太长了）:
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration,\
org.springframework.boot.autoconfigure.aop.AopAutoConfiguration,\
org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration,\
org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration,\
org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration,\
org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration,\
org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration,\
org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration,\
org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration,\
org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration,\
org.springframework.boot.autoconfigure.couchbase.CouchbaseAutoConfiguration,\
org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration,\
....

```
所以如果面试官问你springboot如果实现自动装配的，可以这样大致的回答：

在@SpringBootApplication  注解下有三个重要的注解，其中有一个@EnableAutoConfiguration注解，它会使用@Import注解引入AutoConfigurationImportSelector.class 这个类，自动装配主要在这个类中完成，它会去加载META-INF/spring.factories 配置文件，找到org.springframework.boot.autoconfigure.EnableAutoConfiguration 这个key对应的所有配置，剔除那些不满足条件的配置，剩下的就是要自动装配的类。


参考：

[AutoConfigurationImportSelector到底怎么初始化](https://zhuanlan.zhihu.com/p/143912268)

[SpringBoot自动装配原理与源码分析](http://autumn200.com/2020/06/27/spring-boot-autoconfig/)

### springboot 启动过程

在我们自定义的Application类的main方法中，会执行下面这样的代码：

```
SpringApplication.run(MyApplication.class, args);
```
启动过程从这里开始，源码如下（当前基于 springboot 2.3.4  ）：

```
    /**
     * SpringApplication.run() 方法点击进去之后调用到这里
     * */
    public static ConfigurableApplicationContext run(Class<?> primarySource, String... args) {
        return run(new Class<?>[] { primarySource }, args);
    }
    /**
     * 最后实际调用的构造函数
     * */
    public SpringApplication(ResourceLoader resourceLoader, Class<?>... primarySources) {
        this.resourceLoader = resourceLoader;
        Assert.notNull(primarySources, "PrimarySources must not be null");
        this.primarySources = new LinkedHashSet<>(Arrays.asList(primarySources));
        /**
         * 确定应用类型，如果有org.springframework.web.reactive.DispatcherHandler 这个类，而没有
         * org.springframework.web.servlet.DispatcherServlet，也没有org.glassfish.jersey.servlet.ServletContainer
         * 则认为是 reactive （响应式应用）应用，
         * 如果有javax.servlet.Servlet 和 org.springframework.web.context.ConfigurableWebApplicationContext
         * 则认为是 servlet 即web应用
         * **/
        this.webApplicationType = WebApplicationType.deduceFromClasspath();
        /**
         * 从spring.factories配置文件中获得ApplicationContextInitializer接口的实现类
         * 设置到 initializers 属性中
         * */
        setInitializers((Collection) getSpringFactoriesInstances(ApplicationContextInitializer.class));
        /**
         * 从spring.factories配置文件中获得ApplicationListener接口的实现类
         * 设置到 listeners 属性中
         * */
        setListeners((Collection) getSpringFactoriesInstances(ApplicationListener.class));
        // 获取哪个类调用了main函数，主要用来打印日志
        this.mainApplicationClass = deduceMainApplicationClass();
    }
    
    /**
     * 初始化好SpringApplication对象之后，会直接调用run方法
     * */
    public ConfigurableApplicationContext run(String... args) {
        // 主要用于记录run方法执行的时长，调用start记录开始时间，stop计算两个差值
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ConfigurableApplicationContext context = null;
        // 存放启动过程的异常信息
        Collection<SpringBootExceptionReporter> exceptionReporters = new ArrayList<>();
        // 设置 java.awt.headless 模式，默认为true，即无需键盘鼠标这些设备
        configureHeadlessProperty();
        // 从spring.factories配置中获取SpringApplicationRunListeners的实现类，并启动监听
        SpringApplicationRunListeners listeners = getRunListeners(args);
        listeners.starting();
        try {
            // 封装 main方法传递的args 参数
            ApplicationArguments applicationArguments = new DefaultApplicationArguments(args);
            // 准备环境，将各个配置环境整合起来，如命令行配置的参数或配置文件配置的参数等所有的配置项
            ConfigurableEnvironment environment = prepareEnvironment(listeners, applicationArguments);
            // 设置spring.beaninfo.ignore 为true ，即跳过搜索beaninfo的classes
            configureIgnoreBeanInfo(environment);
            // 打印bannner
            Banner printedBanner = printBanner(environment);
            // 根据不同的应用类型（webApplicationType）创建ApplicationContext 容器
            // 在初始化的时候webApplicationType默认的是SERVLET，所以这里创建的是AnnotationConfigServletWebServerApplicationContext
            context = createApplicationContext();
            // 从spring.factories配置文件中获取异常报告实例
            exceptionReporters = getSpringFactoriesInstances(SpringBootExceptionReporter.class,
                    new Class[] { ConfigurableApplicationContext.class }, context);
            // 为刚ApplicationContext容器做一些准备工作，如设置上一步初始化好的环境变量到容器中
            // 对ApplicationContext做后置处理，如设置resourceLoader属性
            // 调用初始化时生成好的ApplicationContextInitializer实例的initialize方法
            // 调用SpringApplicationRunListeners 的contextPrepared方法，发送ApplicationContextInitializedEvent事件，表示容器已经准备化好
            // 从context容器中获取beanFactory，并向beanFactory中注册一些单例bean(applicationArguments，printedBanner)
            // 加载bean到application context，只是加载了部分bean比如mainApplication这个bean
            // 调用SpringApplicationRunListeners的contextLoaded 事件，表示容器已加载
            prepareContext(context, environment, listeners, applicationArguments, printedBanner);
            // 刷新容器，springboot核心方法
            // 在context刷新前做一些准备工作，如初始化一些属性设置，属性合法性校验和保存容器中的一些早期事件等
            // 让子类刷新其内部bean factory,实质就是再新建一个DefaultListableBeanFactory类型的bean factory对象
            // 配置factory的标准容器特性，容器的类加载器和一些后置处理器，如ApplicationContextAwareProcessor 等
            // 修改应用容器的内部bean factory，在这一步，所有的bean definitions将会被加载，但此时bean还不会被实例化
            // 执行Bean工厂的后置处理器的相关逻辑
            // 实例化并注册所有Bean的后置处理，将所有实现了 BeanPostProcessor 接口的类加载到 BeanFactory 中
            // 初始化国际化相关message，初始化事件广播器
            // 注册实现了ApplicationListener接口的监听器
            // 完成容器BeanFactory的初始化，并初始化所有剩余的单例bean
            // 完成容器的刷新共工作，并且调用生命周期处理器的onRefresh()方法，并且发布ContextRefreshedEvent事件
            refreshContext(context);
            // 空方法
            afterRefresh(context, applicationArguments);
            // 停止计时
            stopWatch.stop();
            if (this.logStartupInfo) {
                new StartupInfoLogger(this.mainApplicationClass).logStarted(getApplicationLog(), stopWatch);
            }
            // 触发SpringApplicationRunListener的started方法，通知spring容器已经启动
            listeners.started(context);
            // 调用ApplicationRunner和CommandLineRunner的run方法，实现spring容器启动后需要做的一些东西
            callRunners(context, applicationArguments);
        }
        catch (Throwable ex) {
            handleRunFailure(context, ex, exceptionReporters, listeners);
            throw new IllegalStateException(ex);
        }

        try {
            // 发布容器已启动事件，容器已可以接受通信
            listeners.running(context);
        }
        catch (Throwable ex) {
            handleRunFailure(context, ex, exceptionReporters, null);
            throw new IllegalStateException(ex);
        }
        return context;
    }

```
springboot 的启动过程比较复杂的，在这里也不可能把源码都拿过来一行行的分析一遍，最好是自己对着源码看一遍，才能记忆深刻。

当然面试的时候我们也不可能给面试官一行一行讲源码，毕竟时间有限，可以把启动过程大致梳理几个点出来：

在@SpringBootApplication 注解的类的main方法中，会调用SpringApplication.run方法，它首先会初始化SpringApplication对象，初始化的时候会设置ApplicationContextInitializer和ApplicationListener对象，之后会调用内部的run方法，发布SpringApplicationRunListeners starting事件，准备相关配置环境，初始化ApplicationContext，然后调用prepareContext设置环境加载一部分bean如mainApplication等，最后会调用refreshContext创建BeanFactory容器，加载并实例化bean，执行Bean的后置处理等。这是springboot启动过程的大致流程。


### springboot 内置web容器有哪些

1. tomcat，默认最大线程数200，IO 模型为 NIO

2. jetty

3. undertow

### springboot中重要的注解有哪些

@Bean, @SpringBootApplication,@Configuration,@Service,@Repositoy,@Controller,@RestController等等

### 如何实现自定义注解

注解中的方法支持哪些返回类型，8种基本类型加String，Class和他们对应的数组类型，以及枚举类型。

```
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomAnnotation {
    int m1();

    boolean m2();

    double m3();

    char m4();

    long m5();

    float m6();

    short m7();

    byte m8();

    String m9();

    Class m10();
    
    int[] m12();
    
    String[] m13();
    
    Class[] m14();

    enum  m11 {
        e1,e2
    }
}

```

当我们实现自定义注解时，首先定义注解名称，使用@interface 修饰，在该注解上需要引入两个重要的注解，一个是Retention 表示该注解的生效范围，如运行期间（RUNTIME），源码（SOURCE），编译后的class文件（CLASS），另一个是Target，表示注解的使用位置，如在方法上，类上，构造函数，属性等，它可以支持多个位置。最后在注解中定义方法即可。

### 注解是如何生效的呢

上面我们已经完成了自定义注解，可是注解生效的原理是什么呢？

注解的本质是一个继承自Annotation接口的接口（你可以在idea中找到Annotation这个接口，查看你自定义的注解确实继承它）

也就是说我们自定义的注解相当于一个接口，如果我们自己不指定如何使用它，系统是不会知道它的作用的，比如当我们用注解作用在类上时，实际上是没有任何作用的，当我们通过反射，找到这个类，获取这个类上的所有注解，发现有我们自己定义的注解，那么基于这个条件做一些其他逻辑，这就使得这个注解生效了。

所以注解生效的原理，就是我们要去解析它，找到这个注解之后做后续逻辑处理。

### spring bean 的生命周期

#### 1. spring bean 的生命周期

![输入图片说明](https://images.gitee.com/uploads/images/2021/0311/161520_cfd1405c_8076629.png "屏幕截图.png")

初始化->设置属性->setBeanName（如何实现了BeanNameAware接口）->setBeanFactory (如果实现了BeanFactoryAware接口)->setApplicationContext(如果实现了ApplicationContextAware接口)->预初始化方法postProcessorBeforeInitialization(如果实现了BeanPostProcessor接口)->afterPropertiesSet方法（如果实现了InitializingBean接口）-> 调用自定义的方法init-method（如果指定了） -> 初始化之后的方法postProcessorAfterInitialization(如果实现了BeanPostProcessor接口)->最后是destroy（如果实现了DisposableBean） 和destroy-method方法。

#### 2. spring bean的注入方式有哪些，循环依赖问题如何解决的？

构造函数注入，属性注入

构造函数注入无法解决循环依赖问题（双方都通过构造函数注入对方）

属性注入可以解决循环依赖问题：使用了三级缓存



以单例为例 DefaultSingletonBeanRegistry ，看一下其中的源码：

```
public class DefaultSingletonBeanRegistry extends SimpleAliasRegistry implements SingletonBeanRegistry {
    
	/** 一级缓存：用于存放完全初始化好的 bean **/
	private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>(256);

	/** 二级缓存：存放原始的 bean 对象（已经初始化但是尚未填充属性），用于解决循环依赖 */
	private final Map<String, ObjectFactory<?>> singletonFactories = new HashMap<>(16);

	/** 三级级缓存：存放 bean 工厂对象，用于解决循环依赖 */
	private final Map<String, Object> earlySingletonObjects = new ConcurrentHashMap<>(16);
        
        @Nullable
	protected Object getSingleton(String beanName, boolean allowEarlyReference) {
		// 先从一级缓存查找，如果没有，判断当前对象是否正在初始化，如果该bean正在创建中，说明发生了循环依赖
		Object singletonObject = this.singletonObjects.get(beanName);
		if (singletonObject == null && isSingletonCurrentlyInCreation(beanName)) {
                        // 从二级缓存中查找，如果找到就返回，否则从三级缓存中查找
			singletonObject = this.earlySingletonObjects.get(beanName);
			if (singletonObject == null && allowEarlyReference) {
				synchronized (this.singletonObjects) {
					// 
					singletonObject = this.singletonObjects.get(beanName);
					if (singletonObject == null) {
						singletonObject = this.earlySingletonObjects.get(beanName);
						if (singletonObject == null) {
							ObjectFactory<?> singletonFactory = this.singletonFactories.get(beanName);
							if (singletonFactory != null) {
								singletonObject = singletonFactory.getObject();
								this.earlySingletonObjects.put(beanName, singletonObject);
								this.singletonFactories.remove(beanName);
							}
						}
					}
				}
			}
		}
		return singletonObject;
	} 
}

```
假如A B两个对象，A中有B对象，B中有A对象，首先初始化A，并提前暴露放在二级缓存中，设置A的属性时，发现B对象又依赖A对象，那么初始化B的时候从二级缓存中拿到A，B初始化完成，放入到一级缓存，继续初始化A，从一级缓存中获取到B，完成初始化。


#### 3. BeanFactory，ApplicationContext，FactoryBean有什么区别

![输入图片说明](https://images.gitee.com/uploads/images/2021/0311/173813_e57cf1e5_8076629.png "屏幕截图.png")

上图可以看到ApplicationContext 继承自BeanFactory接口，属于BeanFactory的子类

BeanFactory 是IOC容器的核心接口，负责生产和管理bean，采用的是延迟加载形式来注入Bean，当用到某个bean的时候，才对该Bean进行加载实例化，这样的话不能提前发现配置上的问题

ApplicationContext 有BeanFactory 派生而来，它也是接口，不仅支持BeanFactory的所有功能，还提供了额外的功能如国际化，文件访问等。它在容器启动时会初始化加载好所有的bean，好处是可以提前发现配置上的问题，坏处是占用空间。通常情况下使用 ApplicationContext

FactoryBean 本质上还是一个bean，只是有些特殊，它是一个工厂接口，用户可以通过实现该接口定制实例化Bean的逻辑


### 过滤器(filter)、拦截器(interceptor)、和AOP的区别

过滤器(filter)拦截web请求的url地址，只是适用于web中，依赖于Servlet容器，利用Java的回调机制进行实现。可以拦截到请求和响应的过程，做一些额外的处理，主要做过滤，认证等

拦截器(interceptor) 拦截 url请求，主要有三个方法preHandle，postHandle，afterCompletion，主要做国际化，主题更换，过滤等

AOP 面向切面，更加细粒度的控制，如拦截包、类、方法等，如事务，日志等。


