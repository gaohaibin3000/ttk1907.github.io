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
事件|描述
---|---
onchange|HTML 元素已被改变
onclick|用户点击了 HTML 元素
onmouseover|用户把鼠标移动到 HTML 元素上
onmouseout |用户把鼠标移开 HTML 元素
onkeydown  |用户按下键盘按键
onload  |浏览器已经完成页面加载








































