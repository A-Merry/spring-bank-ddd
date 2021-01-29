package com.harry.ddd.bank.domain.entity;

import com.harry.ddd.bank.types.AccountId;
import com.harry.ddd.bank.types.AccountNumber;
import com.harry.ddd.bank.types.Currency;
import com.harry.ddd.bank.types.UserId;
import com.harry.ddd.bank.types.context.Money;
import lombok.Data;

/**
 * @author harry.peng 2021/1/27
 */
@Data
public class Account {

    private UserId userId;
    private AccountId accountId;
    private AccountNumber accountNumber;
    private Money available;
    private Money dailyLimit;

    public Currency getCurrency() {
        return available.getCurrency();
    }
}
