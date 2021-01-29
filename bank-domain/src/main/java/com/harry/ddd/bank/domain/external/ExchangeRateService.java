package com.harry.ddd.bank.domain.external;

import com.harry.ddd.bank.types.Currency;
import com.harry.ddd.bank.types.ExchangeRate;

/**
 * @author harry.peng 2021/1/29
 */
public interface ExchangeRateService {
    ExchangeRate calculateExchangeRate(Currency source, Currency target);
}
