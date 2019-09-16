---
layout: post
title:  "DAY28 daily"
date:   2019-09-10
categories: daily
tags: daily
---

* content
{:toc}

day28日报
1. 这几天的成果










# DAY28
经过几天的努力，下面是成果  
1. 这几天完成了航哥给的实例：
    * div转圈圈
    * 表单地址联动
    * 表单默认有值
    * 倒计时
    * 倒计时抢购器
    * 导航菜单
    * 点名器
    * 会跳的文字
    * 选项卡

## substring和substr的区别
两者都是截取字符串。

1. 相同点：如果只是写一个参数，两者的作用都一样：都是是截取字符串从当前下标以后直到字符串最后的字符串片段。
2. 不同点：第二个参数
    * substr（startIndex,lenth）： 第二个参数是截取字符串的长度（从起始点截取某个长度的字符串）；
    * substring（startIndex, endIndex）： 第二个参数是截取字符串最终的下标 （截取2个位置之间的字符串,‘含头不含尾’）。

## 获取鼠标位置
```
$(window).mousemove(function(e) {  
    var xx=e.pageX;
    var yy=e.pageY;
    $(this).text(xx + '---' + yy); 
}); 
```

## 按下与松开鼠标事件
1. 按下：`mousedown`
2. 松开：`mouseup`
3. 按下只在那一瞬间执行一次，如果想要按下不松，让函数一直执行，可以添加一个`flag`标记，让它按下时为1，松开时为0。然后`if(flag==1)`执行函数。














