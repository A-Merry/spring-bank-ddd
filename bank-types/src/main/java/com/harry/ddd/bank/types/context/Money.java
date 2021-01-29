package com.harry.ddd.bank.types.context;

import com.harry.ddd.bank.types.Currency;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author harry.peng 2021/1/27
 */
@Data
public final class Money {
    private BigDecimal amount;
    private Currency currency;

    public Money(BigDecimal amount, Currency currency) {
        if (amount == null || amount.doubleValue() < 0) {
            throw new RuntimeException();
        }
    }
}
