package com.cn.swaggerconfig;

import java.util.Date;

/**
 * 
 * @author jiangjianbin
 * @date 创建时间: 2016年9月5日 
 * 
 * Restful API 访问路径: 
 * http://IP:port/{context-path}/swagger-ui.html 
 * eg:http://localhost:8080/jd-config-web/swagger-ui.html 
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@ComponentScan("com.cn.controller")
@EnableSwagger2
public class RestApiConfig {

	@Bean
    public Docket myApi(){
    	return new Docket(DocumentationType.SWAGGER_2).select() //生成Docket的选择器对API进行筛选
    			.apis(RequestHandlerSelectors.any())//针对controller进行筛选
    			.paths(PathSelectors.any())//针对路径进行筛选
    			.build()
    			.pathMapping("/")// API的根目录
    			.directModelSubstitute(Date.class, String.class)// 输出模型的替换(把日期以字符串的形式输出)
    			.genericModelSubstitutes(ResponseEntity.class) //针对泛型的处理(指定其泛型是哪种类型)
    			.apiInfo(new ApiInfoBuilder()
    					.title("Spring 中使用Swagger2构建RESTful APIs")
    					.description("Swagger2")
    					.contact("jiangjianbin开发组")
    					.version("2.0")
    					.build());
    }
}