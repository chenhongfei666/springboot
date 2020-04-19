package com.ruijie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    // https://www.bilibili.com/video/BV1Y441197Lw?p=4

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).groupName("chf")
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.ruijie.controller"))
                //paths 过滤
                //.paths(PathSelectors.any())
                .build();
//        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Hello,swagger入门!")
                //作者
                .contact(new Contact("chf", "", "948271656@qq.com"))
                //版本号
                .version("1.0")
                //描述
                .description("越努力越幸运")
                .build();
    }
}
