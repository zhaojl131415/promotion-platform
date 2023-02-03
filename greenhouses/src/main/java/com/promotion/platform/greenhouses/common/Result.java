package com.promotion.platform.greenhouses.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * @author zhaojinliang
 * @version 1.0
 * @description API基础响应信息。
 * @date 2023-02-02
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    @ApiModelProperty(value = "状态 SUCC/FAIL/WARN")
    private String status;

    @ApiModelProperty(value = "状态码")
    private Integer code;

    @ApiModelProperty(value = "数据")
    private T data;

    @ApiModelProperty(value = "描述")
    private String desc;

    public static Result ok() {
        return new Result<>("SUCC", HttpStatus.OK.value(), null, null);
    }

    public static <T> Result<T> ok(T data) {
        return new Result<>("SUCC", HttpStatus.OK.value(), data, null);
    }

    public static <T> Result<T> ok(T data, String desc) {
        return new Result<>("SUCC", HttpStatus.OK.value(), data, desc);
    }

    public static <T> Result<T> success(Integer code, T data) {
        return new Result<>("SUCC", code, data, null);
    }

    public static <T> Result<T> success(Integer code, T data, String desc) {
        return new Result<>("SUCC", code, data, desc);
    }

    public static Result fail(String desc) {
        return new Result<>("FAIL", HttpStatus.INTERNAL_SERVER_ERROR.value(), null, desc);
    }

    public static Result fail(Integer code, String desc) {
        return new Result<>("FAIL", code, null, desc);
    }

    public static <T> Result<T> fail(Integer code, T data, String desc) {
        return new Result<>("FAIL", code, data, desc);
    }

    public static Result warn(String desc) {
        return new Result<>("WARN", HttpStatus.INTERNAL_SERVER_ERROR.value(), null, desc);
    }

    public static <T> Result<T> warn(Integer code, String desc) {
        return new Result<>("WARN", code, null, desc);
    }

    public static <T> Result<T> warn(Integer code, T data, String desc) {
        return new Result<>("WARN", code, data, desc);
    }

    public static <T> boolean valid(Result<T> model){
        return model == null ? false : (Integer.valueOf(HttpStatus.OK.value()).equals(model.getCode()) && model.getData() != null);
    }
}
