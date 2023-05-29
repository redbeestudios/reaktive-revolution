package com.redbee.reaktiverevolution.application.port.`in`

import com.redbee.reaktiverevolution.domain.Currency
import reactor.core.publisher.Flux

interface GetCurrencies {
    fun execute(): Flux<Currency>
}