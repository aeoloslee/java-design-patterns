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
