# Calculator Using scala in Maven

## What is Scala?
Scala is a general-purpose programming language providing support for both object-oriented programming and functional programming. The language has a strong static type system. Designed to be concise, many of Scala's design decisions are aimed to address criticisms of Java.

## What is Maven?
Maven is a build automation tool used primarily for Java projects. Maven can also be used to build and manage projects written in C#, Ruby, Scala, and other languages. The Maven project is hosted by the Apache Software Foundation, where it was formerly part of the Jakarta Project.

## About
I have created a calculator using scala language with Maven. I have added some simple functionality of a calculator. You can find the functionality details below.  

## Features
1. add(x,y) - Returns sum of x and y.
1. sub(x,y) - Returns difference of x and y.
1. mul(x,y) - Returns product of x and y.
1. div(x,y) - Returns quotient of x and y.
1. pow(x,y) - Returns value of X raised to the power of y.
1. abs(x)   - Returns absolute value of x.
1. mod(x,y) - Returns remainder of x and y.
1. max(x,y) - Returns largest value between x and y.
1. min(x,y) - Returns smallest value between x and y.

## Compile Code
```
mvn compile
```
## Generate Package
```
mvn package
```

## Run test cases
```
mvn test
```

## Check scalastyle for code and test cases
```
mvn scalastyle:check
```