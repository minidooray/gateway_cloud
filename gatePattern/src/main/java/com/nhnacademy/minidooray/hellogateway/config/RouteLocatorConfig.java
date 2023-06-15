package com.nhnacademy.minidooray.hellogateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorConfig {

    @Bean
    public RouteLocator myRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(predicateSpec -> predicateSpec.path("/account/**").and()
                        .uri("http://localhost:8081"))
                .route(predicateSpec -> predicateSpec.path("/projects/**").and()
                        .uri("http://localhost:8082"))
                .build();
    }
}
