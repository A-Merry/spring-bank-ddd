package com.harry.ddd.bank.types;

/**
 * @author harry.peng 2021/1/27
 */
public final class UserId {
    private Long userId;

    public UserId(Long userId) {
        if (userId == null) {
            throw new RuntimeException("用户ID不能为空");
        }
        this.userId = userId;
    }
}
