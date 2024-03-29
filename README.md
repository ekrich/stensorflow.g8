# stensorflow.g8 - Scala Native TensorFlow template
![CI](https://github.com/ekrich/stensorflow.g8/workflows/CI/badge.svg)

Getting started with TensorFlow for Scala Native using a `sbt` template.

The current API is at the C interoperability level which means the coding will be pretty low level.

## Pre-requisites

You must install `sbt`, Scala Native requirements, and the Tensorflow library.
- Java - JDK 17 recommended (Used for sbt and Scala Native build)
- sbt - https://www.scala-sbt.org/download.html
- clang / llvm - https://scala-native.org/en/latest/user/setup.html#installing-clang-and-runtime-dependencies
- Tensorflow - https://github.com/ekrich/stensorflow#tensorflow-library

## Procedure
Use the following directions to create a project directory `tf-start` in the current directory. It is recommended that you start in your workspace or the place you want the project. You can use any name in place of `tf-start` but then substitute that name in the directions that follow:

```scala
 % sbt new ekrich/stensorflow.g8
 [info] welcome to sbt 1.5.5 (Azul Systems, Inc. Java 11.0.15)
[info] set current project to new (in build file:/private/var/folders/f8/vpd97qv1621_b7zt0z957cjc0000gn/T/sbt_28e22874/new/)

A minimal project that uses stensorflow

name [Scala Native TensorFlow Project]: tf-start

Template applied in /some/directory/./tf-start

% cd tf-start
% sbt
sbt:root> run
sbt:root> test
```

Now you are off and running so have fun!
