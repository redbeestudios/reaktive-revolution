package com.redbee.reaktiverevolution.application.usecase

import com.redbee.reaktiverevolution.application.port.`in`.GetCurrencies
import com.redbee.reaktiverevolution.application.port.out.CurrencyClient
import com.redbee.reaktiverevolution.domain.Currency
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux

@Component
class GetCurrencies(
    private val client: CurrencyClient
) : GetCurrencies {
    override fun execute(): Flux<Currency> = client.findAll()
}