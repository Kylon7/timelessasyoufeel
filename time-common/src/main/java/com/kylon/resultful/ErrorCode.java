package com.kylon.resultful;


/**
 * Created on 2020/12/9
 *
 * @author Administrator
 */
public enum ErrorCode {
    SUCCESS(0, "成功"),
    ERROR(1, "错误"),
    UNKNOWN(1000, "未知的错误");

    private final int code;

    private final String comment;

    ErrorCode(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    public int getCode() {
        return code;
    }

    public String getComment() {
        return comment;
    }
}
