package com.harry.ddd.bank.domain.service;

import com.harry.ddd.bank.types.AuditMessage;

/**
 * 审计消息服务
 * @author harry.peng 2021/1/29
 */
public interface AuditMessageService {
    void send(AuditMessage auditMessage);
}
