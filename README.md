## blog

### 用户模块
#### 接口名称及地址
+ 用户登录  `POST /user/login  `
+ 用户注册  `POST /user/register`
+ 修改密码  `POST /user/modify-password`
+ 重置密码  `GET  /user/reset-password?username=?&token=?`
+ 修改个性签名 `POST /user/modify-sign`
+ 查询用户信息 `GET /user/{username}`
+ 查询用户点赞数  `GET /user/upvotes`

#### 用户表(user)字段
字段名|类型|说明
--- | --- | ---
id|int|自增主键
user_no|varchar(32)|用户编号
username|varchar(16)|用户名
password|varchar(32)|密码(MD5加密)
email|varchar(16)|邮箱
num|int|发表文章数 默认0
upvote|int|获赞数 默认0
sign|varchar(256)|个性签名
login_count|int|登录次数
login_error_count|int|登录失败次数
last_login_time|date|上次登录时间
create_time|date|创建时间(注册时间)


### 文章模块
#### 接口名称及地址
+ 发表文章   `POST  /article/push`
+ 修改文章   `POST  /article/edit/{id}`
+ 查看文章   `GET   /article/{id}`
+ 文章点击数  `POST  /article/click`
+ 文章点赞数增加(减少)  `POST /article/upvote?action=up or down`
+ 查看文章评论数  `GET /article/comments/{id}`

#### 文章表(article)字段
字段名|类型|说明
--- | --- | ---
id|int|自增主键
article_no|varchar(32)|文章编号
title|varchar(32)|文章标题
content|text|文章内容
click_count|int|点击数
comment_count|int|评论数
upvote|int|点赞数
statue|int|文章状态(公开、隐私)
user_no|varchar(32)|创建者id
create_name|varchar(32)|创建者username
create_time|date|创建时间
update_time|date|更新时间


### 分类模块

#### 接口名称及地址
+ 新增分类  `POST  /category/push`
+ 禁用分类  `POST  /category/forbid`
+ 删除分类(该分类下无文章时)   `POST  /category/delete/{category_no}`
+ 查看分类下文章数  `GET  /category/articles/{category_no}`

#### 分类表(category)字段
字段名|类型|说明
--- | --- | ---
id|int|自增主键
category_no|varchar(32)|分类编号
category_name|varchar(32)|分类名称
user_no|varchar(32)|用户编号(该分类所属用户)
article_count|int|文章数
upvote|int|点赞数
click_count|int|点击数
create_time|date|创建时间
update_time|date|更新时间


### 评论模块

#### 接口名称及地址
+ 发表评论(评论属于哪一篇文章) ` POST   /comment/push/{article_no}`
+ 查看指定文章的所有评论(和文章模块接口一致)   `GET  /article/comments/{id}`
+ 删除评论  `POST /comment/delete/{id}`

#### 评论表(comment) 字段
字段名|类型|说明
--- | --- | ---
id|int|自增主键
article_no|varchar(32)|文章编号
user_no|varchar(32)|发表评论用户id
create_name|varchar(32)|创建评论用户名称
content|varchar(256)|评论内容
create_time|date|创建时间
update_time|date|更新时间


