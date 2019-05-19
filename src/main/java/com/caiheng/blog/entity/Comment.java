package com.caiheng.blog.entity;

import java.util.Date;

/**
 * @author cai heng
 * @since 2019/5/19 20:06
 */
public class Comment {

    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 文章编号
     */
    private String articleNo;


    /**
     * 用户编号
     */
    private String userNo;

    /**
     * 用户名称
     */
    private String createName;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 创建时间 评论时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(String articleNo) {
        this.articleNo = articleNo;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
