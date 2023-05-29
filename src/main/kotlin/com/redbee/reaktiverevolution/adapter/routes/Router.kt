package com.redbee.reaktiverevolution.adapter.routes

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class Router {

    @Bean
    fun routes(controller: Controller) = router {
        "/api/v1".nest {
            GET("/currencies", controller::getAll)
        }
    }
}
