package com.redbee.reaktiverevolution.adapter.client

import com.redbee.reaktiverevolution.application.port.out.CurrencyClient
import com.redbee.reaktiverevolution.domain.Currency
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import java.math.BigDecimal

@Component
class CurrencyHttpClient : CurrencyClient {
    override fun findAll(): Flux<Currency> = Flux.just(
        Currency("BTC", BigDecimal.valueOf(29500)),
        Currency("ETH", BigDecimal.valueOf(3000)),
        Currency("ADA", BigDecimal.valueOf(200))
    )
}