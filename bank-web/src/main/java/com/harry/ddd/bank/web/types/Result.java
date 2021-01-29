package com.harry.ddd.bank.web.types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author harry.peng 2021/1/27
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    private static Result successBuild() {
        Result result = new Result();
        result.setCode(1);
        result.setMsg("成功");
        return result;
    }

    public static Result success() {
        return successBuild();
    }

    public static <T> Result<T> success(T t) {
        Result<T> result = successBuild();
        result.setData(t);
        return result;
    }
}
