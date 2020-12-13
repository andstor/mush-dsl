# Mush Xtext Core

> Core Mush implementation

## Table of Contents
- [Language specification](#language-specification)

## Language syntax
Short intro ..  

### Package Declaration
Description...

### Functions
A function is set with a name and parentheses behind. If the function is to have inputs, these have to be inserted between the parentheses. All inputs need to start with a declaration of the type. This can be number, text, decimal, list with numbers, list with list with text ect. All content has to be inside a function. 
`Person()`
`Person(number year, text name, decimals height)`
To get the code to run, write executable before the function name. This way the code will get a run method calling the function.
`executable Person()`

```
HelloWorld(text language)
	theText equals “”
if language != “english” then
		theText equals “Hello World”
else
		theText equals  “Hei Verden”
	return theText

executable Main()
	language equals “english”
	print line HelloWorld(theText)

```

### Comparing operators


### Variables 

###

###
