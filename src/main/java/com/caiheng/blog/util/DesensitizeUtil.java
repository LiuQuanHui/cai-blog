package com.caiheng.blog.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author cai heng
 * @since 2019/5/19 20:17
 */
public class DesensitizeUtil {

    /**
     * 固定电话脱敏
     *
     * @param num 脱敏电话
     * @return 脱敏之后电话
     */
    public static String fixedPhone(String num) {
        if (StringUtils.isBlank(num)) {
            return "";
        }
        return StringUtils.leftPad(StringUtils.right(num, 4), StringUtils.length(num), "*");
    }

    /**
     * 手机号脱敏 前三后四
     *
     * @param num 待脱敏手机
     * @return 脱敏之后手机
     */
    public static String mobilePhone(String num) {
        if (StringUtils.isBlank(num)) {
            return "";
        }
        return StringUtils.left(num, 4).concat(StringUtils.removeStart(StringUtils.leftPad(StringUtils.right(num, 4), StringUtils.length(num), "*"), "***"));
    }

    /**
     * 邮箱脱敏
     * <li>邮箱用户名小于等于2 返回原文</li>
     * <li>剩余返回前两个明文 后面加密</li>
     *
     * @param email 待脱敏邮箱
     * @return 脱敏后邮箱
     */
    public static String email(String email) {
        if (StringUtils.isBlank(email)) {
            return "";
        }
        int index = StringUtils.indexOf(email, "@");
        if (index <= 2) {

            return email;
        }
        return StringUtils.rightPad(StringUtils.left(email, 2), index, "*").concat(StringUtils.mid(email, index, StringUtils.length(email)));
    }

    /**
     * 密码脱敏
     *
     * @param password 待脱敏密码
     * @return 脱敏之后的数据
     */
    public static String password(String password) {
        if (StringUtils.isBlank(password)) {
            return "";
        }
        return "******";
    }

    /**
     * 用户名脱敏
     * <li>"" or null return ""</li>
     * <li>length<=6 return ****** </li>
     * <li>剩余所有返回前三位后三位 中间全部为****</li>
     *
     * @param username 待脱敏用户名
     * @return 脱敏之后数据
     */
    public static String username(String username) {
        if (StringUtils.isBlank(username)) {
            return "";
        }
        if (username.length() <= 6) {
            return "******";
        }
        return StringUtils.left(username, 3).concat("****".concat(StringUtils.right(username, 3)));
    }

}
