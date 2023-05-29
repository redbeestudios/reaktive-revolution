package com.redbee.reaktiverevolution.application.port.out

import com.redbee.reaktiverevolution.domain.Currency
import reactor.core.publisher.Flux

interface CurrencyClient {
    fun findAll(): Flux<Currency>
}