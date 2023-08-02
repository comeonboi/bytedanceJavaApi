package com.byteapimanagement.bytedancejavaapi.common;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket webApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(webApiInfo())
                .select()
//                .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
                .build().securitySchemes(Arrays.asList(apiKey())) // <-- 添加这一行
                .securityContexts(Arrays.asList(securityContext())); // <-- 添加这一行

    }

    private ApiInfo webApiInfo(){

        return new ApiInfoBuilder()
                .title("网站-api管理平台API文档")
                .description("本文档描述了api管理平台接口定义")
                .version("1.0")
                .contact(new Contact("William", "", "745119711@qq.com"))
                .build();
    }

    private SecurityScheme apiKey() {
        return new ApiKey("Authorization", "Authorization", "header");
    }

    // 定义一个 security context，将 API key 应用到所有的 API。
    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(Arrays.asList(new SecurityReference("Authorization", new AuthorizationScope[0])))
                .build();
    }

}