---
layout: post
title:  "DAY6 daily"
date:   2019-08-19
categories: daily
tags: daily
---

* content
{:toc}

day6日报

1. 学习git和pro git

2. 设置ssh协议

3. 添加远程仓库




# DAY6

## 今日任务

### 1.学习git和pro git

通过阅读Pro Git来学习git工具的用法，并且记录笔记，今天到更博为止学习了第三章

### 2.设置ssh协议

第一步：`ssh-keygen -t rsa -C "ttk1907@163.com"`获取ssh key，然后按三次enter

第二步：`cat ~/.ssh/id_rsa.pub`，打开这个文件，复制ssh key

第三步：克隆`git clone git@github.com:ttk1907/ttk1907.github.io.git`，用ssh协议重新克隆库。

### 3.添加远程仓库
`git remote add [自己起得名字] [原作者项目地址]`





