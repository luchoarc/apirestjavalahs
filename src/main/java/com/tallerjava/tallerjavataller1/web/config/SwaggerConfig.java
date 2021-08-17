package com.tallerjava.tallerjavataller1.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket Api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tallerjava.tallerjavataller1.web.controller"))
                .build()
                .apiInfo(getapiinfo());
    }
    private ApiInfo getapiinfo(){
        return new ApiInfo(
                "API REST INFO OACARC",
                "API REST Ejemplo - Información de las Oficinas de Atención al Ciudadano",
                "1.0.0",
                "",
                new Contact("DINFO", "https://www.armada.mil.co", "luis.hernandez@armada.mil.co"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList()
        );
    }

}

//dto(Tipo de objetos que sirven para transportar datos) presenta los datos del modelo al usuario final a la vista
//persistence conecta con el dto presenta los datos al usuario por un lado y por el otro lado se conecta al origen de datos a traves del DataSource