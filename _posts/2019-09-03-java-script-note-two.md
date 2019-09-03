---
layout: post
title:  "JS学习笔记2"
date:   2019-09-03
categories: note
tags: note
---

* content
{:toc}

JS学习笔记2






# JavaScript
## 1. JS对象
1. this 关键词
在函数定义中，`this`引用该函数的“拥有者”。在上面的例子中，this 指的是“拥有” `fullName`函数的`person`对象。换言之，`this.firstName`的意思是`this`对象的`firstName`属性。

## 2. JS事件
1. HTML事件
    * HTML 网页完成加载
    * HTML 输入字段被修改
    * HTML 按钮被点击
改变id为demo的元素的值
```
<button onclick='document.getElementById("demo").innerHTML=Date()'>现在的时间是？</button>
```
改变自身的值
```
<button onclick="this.innerHTML=Date()">现在的时间是？</button>
```
2. 常见的事件
<img src="/assets/JSbiaoge.png" alt="JS常用事件表格">




































