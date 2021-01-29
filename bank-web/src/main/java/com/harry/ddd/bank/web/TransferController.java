package com.harry.ddd.bank.web;

import com.harry.ddd.bank.application.TransferService;
import com.harry.ddd.bank.web.types.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * API: 转账
 *
 * @author harry.peng 2021/1/27
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TransferController {

    private final TransferService transferService;

    @GetMapping("/transfer")
    public Result<Boolean> transfer() {
        return Result.success(transferService.transfer(1L, "2", BigDecimal.TEN));
    }
}
