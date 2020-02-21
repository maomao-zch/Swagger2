package com.vip.swaggerfirst.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author vip
 * @Description: swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
 * @Date 2020/2/15
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).groupName("swagger测试接口")
                .select().apis(RequestHandlerSelectors.basePackage("com.vip.swaggerfirst.controller"))    // 对所有api进行监控
                .paths(PathSelectors.any())     // 对所有路径进行监控
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("SpringBoot整合swagger测试接口")
                //创建人
                .contact(new Contact("vip", "", ""))
                //版本号
                .version("1.0")
                //描述
                .description("首个swagger API 描述")
                .build();
    }
}
