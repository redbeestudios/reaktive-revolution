package com.redbee.reaktiverevolution.adapter.routes

import com.redbee.reaktiverevolution.application.port.`in`.GetCurrencies
import com.redbee.reaktiverevolution.domain.Currency
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class Controller(
    private val getCurrencies: GetCurrencies
) {

    fun getAll(request: ServerRequest): Mono<ServerResponse> =
        ServerResponse.ok()
            .contentType(MediaType.APPLICATION_NDJSON)
            .body(getCurrencies.execute(), Currency::class.java)
}