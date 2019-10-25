---
layout: post
title:  "Java核心类库第三天"
date:   2019-10-25
categories: Java
tags: Java note
---

* content
{:toc}

1. Java深入篇--核心类库--第3天










# Java核心类库第三天
## Java深入篇--核心类库--第3天
### 集合(容器)结构
1. 集合的由来
    1. 当需要在程序中记录单个数据内容时，则声明一个变量即可;
    2. 当需要在程序中记录多个类型相同的数据内容时，则声明一个一维数组即可;
    3. 当需要在程序中记录多个类型不同的数据内容时，则构造一个对象即可;
    4. 当需要在程序中记录多个类型相同的对象时，则声明一个对象数组即可;
    5. 当需要在程序中记录多个类型不同的对象时，则声明一个集合即可;
2. 集合框架结构
    1. 基本概念:在Java语言中集合框架的顶层是：java.util.Collection集合 和 java.util.Map集合
        1. 其中Collection集合中操作元素的基本单位是：单个元素
        2. 其中Map集合中操作元素的基本单位是：单对元素
        3. 在以后的开发中很少直接使用Collection集合，而是使用该集合的子集合：list集合、Queue集合、Set集合等。

### Collection集合(重点)
1. 基本概念
    1. java.util.Collection集合是集合框架的根接口，其他接口是该接口的子接口
2. 常用的方法
    1. boolean add(元素 e)：向集合里添加数据，成功返回true，失败返回false
    2. bollean contains(Object obj)：查找集合中有没有参数传入的对象，有则返回true，没有则返回false
    3. bollean remove(Object obj):删除成功返回true，失败返回false
    4. void clear()：全删，清空
    5. int size():返回集合中元素的个数

### List集合(重中之重)
1. 基本概念
    1. java.util.List集合是Collection集合的子集合，该集合中的元素有先后次序且允许重复
    2. 该集合的主要实现类有：ArrayList类、LinkedList类、Stack类、Vector类等
        1. 其中ArrayList类的底层是采用动态数组进行数据管理，访问方便，增删不方便
        2. 其中LinkedList类的底层是采用链表进行数据管理，增删方便，访问不方便
        3. 其中Stack类主要用于描述具有后进先出特征的数据结构，叫做栈，last in first out。该类的底层是采用数组进行数据的管理。
        4. 其中Vector类的底层采用数组进行数据的管理，与ArrayList类相比属于线程安全的类，因此效率比较低，在以后的开发中推荐使用ArrayList类取代之。
2. 常用方法(练熟、记住)
    1. void add(int index,E element)：向集合中指定位置添加元素
    2. boolean addAll(int index,Collection<?extends E>c)：向集合中添加所有元素
    3. E get(int index)：从集合中获取指定位置元素
    4. E set(int index,E element)：修改指定位置的元素,返回被修改的元素
    5. E remove(int index)：删除指定位置的元素,返回被删除的元素
    6. subList(1,lis):获取List子集合

















