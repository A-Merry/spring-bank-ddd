package com.harry.ddd.bank.domain.repository.impl;

import com.harry.ddd.bank.domain.entity.Account;
import com.harry.ddd.bank.domain.repository.AccountRepository;
import com.harry.ddd.bank.types.AccountId;
import com.harry.ddd.bank.types.AccountNumber;
import org.springframework.stereotype.Repository;

/**
 * @author harry.peng 2021/1/29
 */
@Repository
public class AccountRepositoryImpl implements AccountRepository {

    public Account find(AccountId accountId) {
        return null;
    }

    public Account find(AccountNumber accountNumber) {
        return null;
    }

    public void save(Account sourceAccount) {

    }
}
