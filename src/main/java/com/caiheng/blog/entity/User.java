package com.caiheng.blog.entity;

import java.util.Date;

/**
 * @author cai heng
 * @since 2019/5/19 19:56
 */
public class User {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 用户编号
     */
    private String userNo;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码 MD5
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 发表文章数
     */
    private Integer num;

    /**
     * 点赞数
     */
    private Integer upvote;

    /**
     * 个性签名
     */
    private String sign;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 登录失败次数
     */
    private String loginErrorCount;

    /**
     * 上次登录时间
     */
    private Date lastLoginTime;

    /**
     * 创建时间 注册时间
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUpvote() {
        return upvote;
    }

    public void setUpvote(Integer upvote) {
        this.upvote = upvote;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public String getLoginErrorCount() {
        return loginErrorCount;
    }

    public void setLoginErrorCount(String loginErrorCount) {
        this.loginErrorCount = loginErrorCount;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
