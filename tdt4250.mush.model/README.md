# Mush Ecore model

> Ecore model defenition for the Mush language

This project defines an Ecore model of the Mush language. 

In the `model`folder, you will find the ecore model and the generator model. The `src/tdt4250/mush/model` folder contains all the generated model code.

## Table of Contents
- [Domain Model](#domain-model)
  - [Description](#description)
  - [Model Hierarchy](#model-hierarchy)
## Domain Model

### Description

The model is primarily based on `Statements` and `Expressions`. A `Statement` includes "normal" code elements such as  `IfStatements`, `WhileStatements`, etc. An `Expression`, on the other hand, encompasses most of the other elements. This includes everything from numbers, to collections and operations. See the class diagram of the complete model in the section below.

### Model Hierarchy

![model UML](assets/ModelUML.png)
