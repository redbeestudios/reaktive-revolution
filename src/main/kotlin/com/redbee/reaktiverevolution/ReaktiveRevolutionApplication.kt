package com.redbee.reaktiverevolution

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReaktiveRevolutionApplication

fun main(args: Array<String>) {
    /*val controller = Controller()
    val router = routes(controller)

    val handler = RouterFunction { request ->
        router.route(request)
    }

    val httpHandler = RouterFunctions.toHttpHandler(handler)

    val adapter = ReactorHttpHandlerAdapter(httpHandler)

    HttpServer.create()
        .host("localhost")
        .port(8081)
        .handle(adapter)
        .bindNow()*/

    runApplication<ReaktiveRevolutionApplication>(*args)
}
