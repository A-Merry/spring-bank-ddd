package com.harry.ddd.bank.application;

import java.math.BigDecimal;

/**
 * @author harry.peng 2021/1/27
 */
public interface TransferService {

    Boolean transfer(Long sourceAccountId, String targetAccountNumber, BigDecimal sourceAmount);
}
