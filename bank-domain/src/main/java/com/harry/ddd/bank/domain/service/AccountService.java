package com.harry.ddd.bank.domain.service;

import com.harry.ddd.bank.domain.entity.Account;
import com.harry.ddd.bank.types.ExchangeRate;
import com.harry.ddd.bank.types.context.Money;

/**
 * @author harry.peng 2021/1/29
 */
public interface AccountService {
    void transfer(Account sourceAccount, Account targetAccount, Money sourceMoney, ExchangeRate rate);
}
