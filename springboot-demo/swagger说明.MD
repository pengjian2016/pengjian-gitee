对比
==
+ jar
  + swagger2
  ```java
   <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger2</artifactId>
        <version>2.9.2</version>
    </dependency>
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger-ui</artifactId>
        <version>2.9.2</version>
    </dependency>

  ```
  + swagger3
  ```java
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-boot-starter</artifactId>
        <version>3.0.0</version>
    </dependency>

    ```
+ 注解启用
  + 2： @EnableSwagger2
  + 3:  @EnableOpenApi
  
+ 页面
  + 2 ：http://localhost:8080/swagger-ui.html
  + 3： http://127.0.0.1:8080/swagger-ui/index.html
+ 配置
  + 2： return new Docket(DocumentationType.SWAGGER_2)
  + 3： return new Docket(DocumentationType.OAS_30)

> 注解说明
> controller
> 
>> @Api 请求类说明
> 方法上
>> @ApiOperation 方法说明
>> @ApiImplicitParams、@ApiImplicitParam 方法的参数的说明：@ApiImplicitParams 用于指定单个参数的说明      
>> @ApiResponses、@ApiResponse	方法返回值的说明：@ApiResponses 用于指定单个参数的说明       
> 
> 对象类：
>> @ApiModel	用在JavaBean类上，说明JavaBean的 用途
>> @ApiModelProperty	用在JavaBean类的属性上面，说明此属性的的含议



springfox 与 springDoc
==
| springFox      | springDoc |
| ----------- | ----------- |
| @Api      | @Tag       |
| @ApiIgnore   | @Parameter(hidden=true)        |
| @ApiModel   | @Schema        |
| @ApiModelProperty   | @Shema        |
| @ApiOperation(value='foo')  | @Operation(summary='foo'        |
| @ApiParam| @Parameter       |



