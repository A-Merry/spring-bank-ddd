package com.harry.ddd.bank.types;

import com.harry.ddd.bank.types.context.Money;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author harry.peng 2021/1/29
 */
@Data
public class AuditMessage {
    private UserId userId;
    private AccountNumber sourceAccountNumber;
    private AccountNumber targetAccountNumber;
    private Money sourceMoney;
    private ExchangeRate exchangeRate;
    private LocalDateTime updateAt;

    public static AuditMessage create(UserId userId, AccountNumber sourceAccountNumber, AccountNumber targetAccountNumber, Money sourceMoney, ExchangeRate exchangeRate) {
        AuditMessage auditMessage = new AuditMessage();
        auditMessage.setUserId(userId);
        auditMessage.setSourceAccountNumber(sourceAccountNumber);
        auditMessage.setTargetAccountNumber(targetAccountNumber);
        auditMessage.setSourceMoney(sourceMoney);
        auditMessage.setExchangeRate(exchangeRate);
        auditMessage.setUpdateAt(LocalDateTime.now());
        return auditMessage;
    }
}
