---
layout: post
title:  "基于nodejs和socket实现聊天室"
date:   2019-09-01
categories: note
tags: note
---

* content
{:toc}

基于nodejs和socket实现聊天室









## 介绍和原理
1. 用http协议完成不了聊天室 ，因为如果浏览器不发送请求，服务器端不会主动发送消息，所以要用`web socket`协议
2. `web socket`协议：WebSocket是一种协议，与HTTP协议一样位于应用层，都是TCP/IP协议的子集。HTTP协议是单向通信协议，只有客户端发起HTTP请求，服务端才会返回数据。而WebSocket协议是双向通信协议，在建立连接之后，客户端和服务器都可以主动向对方发送或接受数据。WebSocket协议建立的前提需要借助HTTP协议，建立连接之后，持久连接的双向通信就与HTTP协议无关了
3. 准备：客户端、服务器、node.js
4. 服务器功能：接受客户端消息、广播消息
5. 客户端功能：发送消息、接受服务器发送过来的消息
6. 客户端的发送是基于`http`协议，消息的发送和请求都是基于`websocket`协议，在`npm`里下载`socket`，下载完成后，文件里会多一个`node_modules`的文件夹，这是一些这个项目的依赖模块






## 步骤
1. 先搭建服务端
```
http.createServer(function (req,res) {

    var html = fs.readFileSync("./client.html");//调用fs模块中的同步读文件方法

    res.end(html);
}).listen(3000);           //监听端口
```
2. 搭建客户端
首先新建一个html文件当作客户端页面，然后在服务端使用`node.js`的`fs.readFileSync`方法读取客户端页面
```
var html = fs.readFileSync("./client.html");
```
3. 引入`socket.io`模块
    * `ws`是`socket.io`的模块包，怎么启用这个模块包呢？  
    * 首先讲一个点：这个服务必须建立在我们的当前的`http`的服务之下的，平常的消息发送都是建立在`http`服务之下的，所以`ws`服务要监听当前的`http`服务  
    * 首先定义一个服务器的实例，然后放到`ws`里，通过这个方法将`http`与`ws`相关联，也就是说接下来的操作他们俩相绑定,并且创造出`io`流服务器，接下来所有的扩展都基于`io`服务器
```
var server = 步骤一
var io = ws(server);
```
4. 建立连接，监听客户端接入
```
io.on('connection',function (socket) {
    //发生在用户连接io服务器的时候
    console.log('有新用户进入房间');
});
```
5. 接收消息
接收消息一定是在建立连接之内，socket参数，负责对消息进行处理，比如登陆、断开连接,接收消息
```
socket.on('message',function (obj) {
        //接收客户端消息
        io.emit('message',obj);//emit是主动发送事件，发给所有已经连接的客户端
    });
```
6. 客户端开发
引入`socket.io`插件，连接到服务器，引入地址
```
 <script type="text/javascript" 
        src="https://wulv5.com/js/socket.io.min.js"></script>
        <script type="text/javascript">
        var socket = io.connect("/");//连接聊天室io服务器    

        </script>
```
得到文本框内容，发送消息：
```
var oText = document.getElementById('text'),
            oBtn = document.getElementById('btn');

        oBtn.onclick = function () {
            var mes = oText.value;
            if(!mes){
                return;
            }
            socket.send(mes);//如果文本框内有内容 那么就发送消息去服务器
        }
```
输出消息
```
socket.on('message',function (mes) {
            //输出服务端发送过来得消息
            var div = document.createElement("div");
            div.className = "mes";
            div.innerText = mes;
            document.body.appendChild(div);

```






