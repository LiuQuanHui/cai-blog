package com.caiheng.blog.enums;

/**
 * @author cai heng
 * @since 2019/5/19 20:10
 */
public enum ArticleStatusEnum {
    /**
     * 正常
     */
    NORMAL("00","正常"),

    /**
     * 禁用
     */
    FORBID("01","禁用")
    ;


    private String code;

    private String msg;

    ArticleStatusEnum(String code, String msg) {
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
