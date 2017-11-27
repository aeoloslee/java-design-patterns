设计模式参考：http://design-patterns.readthedocs.io/zh_CN/latest/read_uml.html

#策略模式与委托原则的比较
the strategy pattern is a very specific design solution to a common software problem. the strategy pattern implies that there will be

an interface called Strategy (or with Strategy as part of the name). this interface should have a method called execute().
one or more concrete classes called something like ConcreteStrategyA, ConcreteStrategyB, etc. that implement the Strategy interface.
there should also be a context class that contains the Strategy
delegation is more a principal than a pattern. delegation implies that instead of having a single object be in charge of everything, it delegates responsibilities to other objects. the reason this is a common technique is that it enforces two even more fundamental principals of software development by lessening coupling and increasing cohesiveness.

#关注原则而不是模式
Having said all that, don't worry about patterns. Focus on the principals and if you feel your solution
could be improved upon - look to the patterns to see if there is a better mousetrap. If you focus on
patterns instead of principals, you will find yourself getting lost in all the patterns and
implementing patterns for the sake of implementing patterns...

<!-- the line below needs to be an empty line C: (its because kramdown isnt
     that smart and dearly wants an empty line before a heading to be able to
     display it as such, e.g. website) -->

面向对象的六大原则
单一职责原则

　　所谓职责是指类变化的原因。如果一个类有多于一个的动机被改变，那么这个类就具有多于一个的职责。而单一职责原则就是指一个类或者模块应该有且只有一个改变的原因。
   通俗的说，即一个类只负责一项职责，将一组相关性很高的函数、数据封装到一个类中。

开闭原则

　　对于扩展是开放的，这意味着模块的行为是可以扩展的。当应用的需求改变时，我们可以对模块进行扩展，使其具有满足那些改变的新行为。
　　对于修改是关闭的，对模块行为进行扩展时，不必改动模块的源代码。

　　通俗的说，尽量通过扩展的方式实现系统的升级维护和新功能添加，而不是通过修改已有的源代码。

里氏替换原则

　　使用“抽象(Abstraction)”和“多态(Polymorphism)”将设计中的静态结构改为动态结构，维持设计的封闭性。任何基类可以出现的地方，子类一定可以出现。

　　在软件中将一个基类对象替换成它的子类对象，程序将不会产生任何错误和异常，反过来则不成立。在程序中尽量使用基类类型来对对象进行定义，
   而在运行时再确定其子类类型，用子类对象来替换父类对象。

依赖倒置原则

　　高层次的模块不应该依赖于低层次的模块，他们都应该依赖于抽象。抽象不应该依赖于具体实现，具体实现应该依赖于抽象。
　　
　　程序要依赖于抽象接口，不要依赖于具体实现。简单的说就是要求对抽象进行编程，不要对实现进行编程，这样就降低了客户与实现模块间的耦合（各个模块之间相互传递的参数声明为抽象类型，而不是声明为具体的实现类）。

接口隔离原则

　　一个类对另一个类的依赖应该建立在最小的接口上。其原则是将非常庞大的、臃肿的接口拆分成更小的更具体的接口。

迪米特原则

　　又叫作最少知识原则，就是说一个对象应当对其他对象有尽可能少的了解。
　　通俗地讲，一个类应该对自己需要耦合或调用的类知道得最少，不关心被耦合或调用的类的内部实现，只负责调用你提供的方法。
     　

# Design patterns implemented in Java

[![Build status](https://travis-ci.org/iluwatar/java-design-patterns.svg?branch=master)](https://travis-ci.org/iluwatar/java-design-patterns)
[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/iluwatar/java-design-patterns/master/LICENSE.md)
[![Join the chat at https://gitter.im/iluwatar/java-design-patterns](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/iluwatar/java-design-patterns?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Quality Gate](https://sonarqube.com/api/badges/gate?key=com.iluwatar%3Ajava-design-patterns)](https://sonarqube.com/dashboard/index/com.iluwatar%3Ajava-design-patterns)

# Introduction

Design patterns are formalized best practices that the programmer can use to
solve common problems when designing an application or system.

Design patterns can speed up the development process by providing tested, proven
development paradigms.

Reusing design patterns helps to prevent subtle issues that can cause major
problems, and it also improves code readability for coders and architects who
are familiar with the patterns.

# Getting started

Before you dive into the material, you should be familiar with various
Programming/Software Design Principles.

All designs should be as simple as possible. You should start with KISS, YAGNI,
and Do The Simplest Thing That Could Possibly Work principles. Complexity and
patterns should only be introduced when they are needed for practical
extensibility.

Once you are familiar with these concepts you can start drilling down into
patterns by any of the following approaches

 - Using difficulty tags, `Difficulty-Beginner`, `Difficulty-Intermediate` & `Difficulty-Expert`.
 - Using pattern categories, `Creational`, `Behavioral` and others.
 - Search for a specific pattern. Can't find one? Please report a new pattern [here](https://github.com/iluwatar/java-design-patterns/issues).

# How to contribute

If you are willing to contribute to the project you will find the relevant information in our [developer wiki](https://github.com/iluwatar/java-design-patterns/wiki). We will help you and answer your questions in the [Gitter chatroom](https://gitter.im/iluwatar/java-design-patterns).

# License

This project is licensed under the terms of the MIT license.
