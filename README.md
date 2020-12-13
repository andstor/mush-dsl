<p align="center">
  <a href="https://github.com/andstor/mush-dsl">
    <img src="media/logo.svg" alt="Mush logo" width="180">
  </a>
</p>

<h1 align="center">Mush DSL</h1>

> Simple, intuitive, and powerful DSL inspired by multiple popular programming languages.

Mush is a DSL / Programming Language for writing in a pseudocode like style. The language is created with [Ecore](https://wiki.eclipse.org/Ecore) and [Xtext](https://www.eclipse.org/Xtext/). Mush features a compiler, which compiles Mush code down to Java code. Editing support for Eclipse is also available.

[Examples](https://andstor.github.io/mush-dsl/examples/) - 
[Documentation](https://andstor.github.io/mush-dsl/) - 
[Wiki](https://github.com/andstor/mush-dsl/wiki)

## Table of Contents
- [Table of Contents](#table-of-contents)
- [Getting Started](#getting-started)
- [Install](#install)
- [Rationale](#rationale)
- [Structure](#structure)
- [Build](#build)
- [License](#license)

## Getting Started
There are multiple ways to get started using Mush. You may install the plugin using the prebuilt jar files. See the [installation instructions](#install) below. You may also manually build the project(s) and launch a new Eclipse application. See the [build](#build) section.

Once you have installed Mush into Eclipse, you may create a new mush file. This is a file with the extension name `mush`. For example `HelloWorld.mush`.

The following Mush code produces a [Hello, world](https://en.wikipedia.org/wiki/%22Hello,_World!%22_program) program:

```
executable HelloWorld()
    print "Hello, world!"
```

This compiles down to the following runnable Java code:

```java
public class HelloWorld {
    public static void run() {
        System.out.print("Hello, world!");
    }
    
    public static void main(final String[] args) {
        run();
    }
}
```

Mush ships with several examples. These are found in the [tdt4250.mush.examples](tdt4250.mush.examples/) project.

## Install
You can download the latest build [here](https://github.com/andstor/mush-dsl/releases/latest)

This needs to be manually installed into Eclipse. See here for manual [installation instructions]().

## Rationale

Most programming languages has a very crude syntax, including a lot of specific symbols and characters. These are often hard to understand for a person without much programming experience. We therefore wanted to make a language that could be expressed in a more natural style. The result of this was Mush. Mush provides a more pseudocode like syntax, without a lot of syntactical clutter. 

Due to the language’s nature, it makes a great candidate for beginners to learn programming. Yet, it is powerful enough to express complex algorithms. Algorithms are often expressed in a pseudo like syntax. Mush would allow implementation of such "pseudo algorithms" in a more straight forward way. In particular, we have used the book “Introduction to ALGORITHMS, 3.rd edition” as inspiration.

## Structure

[tdt4250.mush.model](tdt4250.mush.model/) - ModelModel for the Mush language.

[tdt4250.mush.xtext](tdt4250.mush.xtext/) - Mush core Xtext project based on [Mush model](../assignment-1/tdt4250.studyprogramme.model/).

[tdt4250.mush.xtext.tests](tdt4250.mush.xtext.tests/) - Tests for Mush core Xtext project.

[tdt4250.mush.xtext.ide](tdt4250.mush.xtext.ide/) - Mush Xtext IDE project.

[tdt4250.mush.xtext.ui](tdt4250.mush.xtext.ui/) - Mush tests for Xtext UI project.

[tdt4250.mush.xtext.ui.tests](tdt4250.mush.xtext.ui.tests/) - Mush tests for Xtext UI project (TODO).

[tdt4250.mush.examples](tdt4250.mush.examples/) - Mush example project.

## Build
In order to build the project(s) you first need to import all the modules in this repository into your Eclipse workspace.

Eclipse should build class files automatically. Ensure that the `Project` -> `Build Automatically` is checked.

Right click on the [`GenerateMush.mwe2`](tdt4250.mush.xtext/src/tdt4250/mush/xtext/GenerateMush.mwe2) in the core xtext bundle, and select `Run As` -> `MWE2 Workflow`.

In order to test the new build, a second Eclipse application should be launched with the Mush bundles installed. This is done by creating a new Eclipse run configuration.

Se the [build](tdt4250.mush.xtext/README.#build) instructions in the [tdt4250.mush.xtext](tdt4250.mush.xtext) project and the [Running Eclipse Plugin](tdt4250.mush.xtext.ui/README.md#running-eclipse-plugin) in the [tdt4250.mush.xtext.ui](tdt4250.mush.xtext.ui/) project for more detailed instructions.

## License

Copyright © [André Storhaug](https://github.com/andstor) and [Annabelle Solem Almås](https://github.com/asaAnnabelle)
