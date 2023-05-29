package com.redbee.reaktiverevolution.domain

import java.math.BigDecimal

data class Currency(
    val symbol: String,
    val value: BigDecimal
)