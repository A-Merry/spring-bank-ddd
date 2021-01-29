package com.harry.ddd.bank.types;

import com.sun.tools.javac.util.StringUtils;
import lombok.Data;

/**
 * @author harry.peng 2021/1/28
 */
@Data
public final class AccountNumber {

    private String accountNumber;

    public AccountNumber(String accountNumber) {
        if (StringUtils.isEmputy(accountNumber)) {

        }
    }
}
