package com.kylon.resultful;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * Created on 2020/12/9
 *
 * @author Administrator
 */
@ApiModel("响应")
@Getter
@Setter
public class Resp<T> {

    @ApiModelProperty(value = "返回码 0:成功 其他:异常", dataType = "int")
    private int code;

    @ApiModelProperty(value = "返回消息", dataType = "String")
    private String msg;

    @ApiModelProperty(value = "返回对象", dataType = "object", example = "成功、错误或Object")
    private T data;

    public Resp() {
    }

    public Resp(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Resp success() {
        return resp(ErrorCode.SUCCESS);
    }

    public static Resp success(String msg, Object data) {
        return new Resp(ErrorCode.SUCCESS.getCode(), msg, data);
    }

    public static Resp success(Object data) {
        return new Resp(ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getComment(), data);
    }

    public static Resp error() {
        return resp(ErrorCode.ERROR);
    }

    public static Resp error(String msg, Object data) {
        return new Resp(ErrorCode.ERROR.getCode(), msg, data);
    }

    public static Resp resp(ErrorCode errorCode) {
        return new Resp(errorCode.getCode(), errorCode.getComment(), null);
    }

    public static Resp error(int code, String msg, Object data) {
        return new Resp(code, msg, data);
    }

    public static Resp resp(ErrorCode errorCode, Object data) {
        return new Resp(errorCode.getCode(), errorCode.getComment(), data);
    }
}

