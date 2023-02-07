package com.trendbox.app.productos.config;

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


@Configuration
@EnableSwagger2
public class SpringFoxConfig 
{
	@Bean
	Docket api() 
	{
		return new Docket( DocumentationType.SWAGGER_2 )
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiInfo());
	}
	
	//create api metadata that goes at the top of the generated page
    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("Productos API")
                .version("1.0")
                .description("API para el control de los productos.")
                .contact(new Contact("Daniel Nevarez", "https://devdn.com", "ing.dan.np@gmail.com"))
                .license("Apache License Version 2.0")
                .build();
    }
}
