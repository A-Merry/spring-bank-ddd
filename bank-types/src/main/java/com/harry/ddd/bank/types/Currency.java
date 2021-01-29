package com.harry.ddd.bank.types;

import lombok.Data;

/**
 * @author harry.peng 2021/1/27
 */
@Data
public final class Currency {
    private String currency;

    public Currency(String currency) {
        // if
        this.currency = currency;
    }
}
