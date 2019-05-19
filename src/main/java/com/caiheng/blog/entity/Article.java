package com.caiheng.blog.entity;

import java.util.Date;

/**
 * @author cai heng
 * @since 2019/5/19 19:59
 */
public class Article {

    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 文章编号
     */
    private String articleNo;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章源内容
     */
    private String sourceContent;

    /**
     * 文章富文本内容
     */
    private String content;

    /**
     * 点击次数
     */
    private Integer clickCount;

    /**
     * 评论次数
     */
    private Integer commentCount;
    /**
     * 点赞次数
     */
    private Integer upvote;

    /**
     * 文章状态
     */
    private String status;

    /**
     * 用户编号
     */
    private String userNo;

    /**
     * 创建者名称 （用户username）
     */
    private String createName;
    /**
     * 创建时间
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSourceContent() {
        return sourceContent;
    }

    public void setSourceContent(String sourceContent) {
        this.sourceContent = sourceContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getUpvote() {
        return upvote;
    }

    public void setUpvote(Integer upvote) {
        this.upvote = upvote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
