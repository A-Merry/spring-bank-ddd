package com.harry.ddd.bank.domain.repository;

import com.harry.ddd.bank.domain.entity.Account;
import com.harry.ddd.bank.types.AccountId;
import com.harry.ddd.bank.types.AccountNumber;
import com.harry.ddd.bank.types.UserId;

/**
 * @author harry.peng 2021/1/27
 */
public interface AccountRepository {

    Account find(UserId userId);

    Account find(AccountId accountId);

    Account find(AccountNumber accountNumber);

    void save(Account sourceAccount);
}
