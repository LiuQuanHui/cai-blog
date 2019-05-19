package com.caiheng.blog.response;

/**
 * @author cai heng
 * @since 2019/5/19 20:06
 */
public enum  ResponseCode {
    /**
     * SUCCESS
     */
    SUCCESS("0","SUCCESS"),

    /**
     * ERROR
     */
    ERROR("1","ERROR"),

    /**
     * NEED_LOGIN
     */
    NEED_LOGIN("10","NEED_LOGIN"),

    /**
     * ILLEGAL_ARGUMENT
     */
    ILLEGAL_ARGUMENT("2","ILLEGAL_ARGUMENT"),

    ;


    private final String code;

    private final String msg;

    ResponseCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
