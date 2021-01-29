package com.harry.ddd.bank.domain.service.impl;

import com.harry.ddd.bank.domain.entity.Account;
import com.harry.ddd.bank.domain.service.AccountService;
import com.harry.ddd.bank.types.ExchangeRate;
import com.harry.ddd.bank.types.context.Money;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author harry.peng 2021/1/29
 */
@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

    public void transfer(Account sourceAccount, Account targetAccount, Money sourceMoney, ExchangeRate rate) {
        
    }
}
