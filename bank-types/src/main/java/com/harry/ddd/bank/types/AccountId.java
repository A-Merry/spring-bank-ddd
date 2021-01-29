package com.harry.ddd.bank.types;

import lombok.Data;

/**
 * @author harry.peng 2021/1/27
 */
@Data
public final class AccountId {
    private Long accountId;

    public AccountId(Long accountId) {
        if (accountId == null) {
            throw new RuntimeException("账号ID不能为空");
        }
        this.accountId = accountId;
    }
}
