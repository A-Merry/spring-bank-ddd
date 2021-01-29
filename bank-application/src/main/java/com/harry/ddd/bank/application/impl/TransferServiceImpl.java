package com.harry.ddd.bank.application.impl;

import com.harry.ddd.bank.application.TransferService;
import com.harry.ddd.bank.domain.entity.Account;
import com.harry.ddd.bank.domain.external.ExchangeRateService;
import com.harry.ddd.bank.domain.repository.AccountRepository;
import com.harry.ddd.bank.domain.service.AccountService;
import com.harry.ddd.bank.domain.service.AuditMessageService;
import com.harry.ddd.bank.types.AccountNumber;
import com.harry.ddd.bank.types.AuditMessage;
import com.harry.ddd.bank.types.ExchangeRate;
import com.harry.ddd.bank.types.UserId;
import com.harry.ddd.bank.types.context.Money;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author harry.peng 2021/1/27
 */
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TransferServiceImpl implements TransferService {

    private final AccountRepository accountRepository;
    private final ExchangeRateService exchangeRateService;
    private final AccountService accountService;
    private final AuditMessageService auditMessageService;

    public Boolean transfer(Long sourceUserId, String targetAccountNumber, BigDecimal sourceAmount) {
        // 查询数据
        Account sourceAccount = accountRepository.find(new UserId(sourceUserId));
        Account targetAccount = accountRepository.find(new AccountNumber(targetAccountNumber));
        ExchangeRate exchangeRate = exchangeRateService.calculateExchangeRate(sourceAccount.getCurrency(), targetAccount.getCurrency());

        // 转账操作
        Money sourceMoney = new Money(sourceAmount, sourceAccount.getCurrency());
        accountService.transfer(sourceAccount, targetAccount, sourceMoney, exchangeRate);

        // 保存
        accountRepository.save(sourceAccount);
        accountRepository.save(targetAccount);

        // 发送审计消息
        auditMessageService.send(AuditMessage.create(sourceAccount.getUserId(), sourceAccount.getAccountNumber(), targetAccount.getAccountNumber(), sourceMoney, exchangeRate));

        return true;
    }
}
