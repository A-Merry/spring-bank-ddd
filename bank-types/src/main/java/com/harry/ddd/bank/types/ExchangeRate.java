package com.harry.ddd.bank.types;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 汇率
 * @author harry.peng 2021/1/29
 */
@Data
public class ExchangeRate {
    private Currency source;
    private Currency target;
    private BigDecimal rate;

    public ExchangeRate(Currency source, Currency target, BigDecimal rate) {
        if (rate == null || rate.doubleValue() <= 0) {
            throw new RuntimeException("汇率参数错误");
        }
        this.source = source;
        this.target = target;
        this.rate = rate;
    }
}
