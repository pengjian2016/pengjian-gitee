#### freeMarke JAVA语言的模板引擎

#四中元素

* 文本 
  - 直接输出
* 注释
  - <#- xxx ->
* 插入值
  - ${xxx}
* ftl 指令
  -  freemarker指令和html类似，名字前加#予以区分，不会输出

# 使用
> `  <dependency>
        <groupId>org.freemarker</groupId>
        <artifactId>freemarker</artifactId>
        <version>2.3.23</version>
    </dependency>  `
 
# 原理 - 生成文件

### 使用步骤：
1. 创建一个 Configuration 对象，直接 new 一个对象。构造方法的参数就是 freemarker的版本号。
2. 设置模板文件所在的路径。
3. 设置模板文件使用的字符集。一般就是 utf-8.
4. 加载一个模板，创建一个模板对象。
5. 创建一个模板使用的数据集，可以是 pojo 也可以是 map。一般是 Map。
6. 创建一个 Writer 对象，一般创建一 FileWriter 对象，指定生成的文件名。
7. 调用模板对象的 process 方法输出文件。
8. 关闭流
> `
public static void main(String[] args) throws Exception {
    //1.创建配置类
    Configuration configuration=new Configuration(Configuration.getVersion());
    //2.设置模板所在的目录
    configuration.setDirectoryForTemplateLoading(new File("F:\\idea_code\\hlt-parent\\hlt-freemarker-demo\\src\\main\\resources"));
    //3.设置字符集
    configuration.setDefaultEncoding("utf-8");
    //4.加载模板
    Template template = configuration.getTemplate("test.ftl");
    //5.创建数据模型
    Map map=new HashMap();
    map.put("name", "tom ");
    map.put("message", "hello world！");
    //6.创建Writer对象
    Writer out =new FileWriter(new File("d:abc\\test.html"));
    //7.输出
    template.process(map, out);
    //8.关闭Writer对象
    out.close();
}
` 

# ftl指令
 --- --- ----
> assign 页面上定义一个变量,对象
```
  <#assign linkman="我是变量">
  联系人：${linkman}
  <#assign info={"mobile":"13301231212",'address':'北京市昌平区王府街'} >
  电话：${info.mobile}  地址：${info.address}
```
 --- --- ----
> incloud 用于模板文件的嵌套，创建模板文件head.ftl
```
 <#include "head.ftl">
 ```
 --- --- ----
> if  <#if>  、<#else>、在if里面加入判断规则即可
```
<#if success=true>
    你已通过英语四级考试
<#else>
    你未通过英语四级考试
</#if>
```
 --- --- ----
> list 进行赋值
```
代码中   map.put("list",list); 

<#list goodsList as goods>
  ${goods_index+1} 商品名称： ${goods.name} 价格：${goods.price}<br>
</#list>
 ```

 --- --- ----
> 获取集合大小
```
 ${list?size} 
 ```

 --- --- ----
> 转换json字符串为对象
```
<#assign text="{'bank':'工商银行','account':'10101920201920212'}" />
<#assign data=text?eval />
    开户行：${data.bank}  账号：${data.account}
 ```
 --- --- ----
> 日期格式化
```
代码中 map.put("today",new Date());
当前日期：${today?date} <br>
当前时间：${today?time} <br>
当前日期+时间：${today?datetime} <br>
日期格式化：  ${today?string("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒")}
 ```
 --- --- ----
> 数字转化为字符串
```
map.put("number",123456789);
分数：${number}   显示：123,456,789
${number?c}  显示 123456789
 ```
 --- --- ----
> 判断某变量是否存在 str??,如果该变量存在,返回true,否则返回false
```
<#if aaa??>
  aaa变量存在
<#else>
  aaa变量不存在
</#if>
 ```
 --- --- ----
> 缺失变量默认值
```
${aaa!'-'}
当aaa为null则返回！后边的内容-
 ```









