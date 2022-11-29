package com.example.springbootopenapi.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-29
 */
@Configuration
public class SpringDocConfig {


    /*
        @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    //为当前包路径,控制器类包
                    .apis(RequestHandlerSelectors.basePackage("com.example.springbootswagger2.controller"))
                    .paths(PathSelectors.any())
                    .build();

        }

        private ApiInfo apiInfo() {
            return  new ApiInfoBuilder()
                    //页面标题
                    .title("XX平台API接口文档")
                    //创建人
                    .contact(new Contact("冯冬冬", "http://www.javachat.cc",
                            "3049352171@qq.com"))
                    //版本号
                    .version("1.0")
                    //描述
                    .description("系统API描述")
                    .build();
        }
        */
    @Bean
    public OpenAPI mallTinyOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Mall-Tiny API")
                        .description("SpringDoc API 演示")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0").url("https://github.com/macrozheng/mall-learning")))
                .externalDocs(new ExternalDocumentation()
                        .description("SpringBoot实战电商项目mall（50K+Star）全套文档")
                        .url("http://www.macrozheng.com"));
    }

}
