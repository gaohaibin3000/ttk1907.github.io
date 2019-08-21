---
layout: post
title:  "DAY7 daily"
date:   2019-08-20
categories: daily
tags: daily
---

* content
{:toc}

day7日报

1. 继续学习git和pro git

2. 解决ssh密钥没了的问题

3. 完成开源项目的参与

4. fetch用法








# DAY7

## 今日任务

### 1.学习git和pro git

通过阅读Pro Git来学习git工具的用法，并且记录笔记，今天到更博为止练习了各种命令

### 2.ssh密钥没了解决方法
直接重新生成一个

### 3.参与开源项目方法
可以见今日的开源项目参与博客

### 4.fetch用法
fetch方法同步：现在已经落后版本了，要同步远程仓库
先用fetch把远程仓库的更新都拿过来放到tmp分支中：git fetch [远程仓库] [想要弄来的分支]:tmp  
git diff tmp可以查看当前分支和tmp进行对比，可以看出修改了什么  
切换到tmp，然后推他：git push -u origin tmp:tmp  
切回去master分支：合并master和tmp：git merge origin/tmp  
这就同步完成，修改后推master:git push -u origin master


