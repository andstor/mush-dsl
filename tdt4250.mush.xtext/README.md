# Mush Xtext Core

> Core Mush implementation

## Table of Contents
- [Language specification](#language-specification)

## Language syntax
Short intro ..  

### Package Declaration
The language allows the use of packages. To use a packages write package and the package name. This way all the generated java code with the same package name is inside the same package. 
```package world```

### Functions
A function is set with a name and parentheses behind. If the function is to have inputs, these have to be inserted between the parentheses. All inputs need to start with a declaration of the type. This can be number, text, decimal, list with numbers, list with list with text ect. All content has to be inside a function.\ 
`Person()``Person(number year, text name, decimals height)`\
To get the code to run, write executable before the function name. This way the code will get a run method calling the function.`executable Person()`

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
### Types
text \
number \
decimal \
list with number \
list with text


### Variables 
When defining variables there are no types to set. Different ways to write equals are `=`, `equals` og `is`
```
year = 1
year is 3
year equals 1
name = “Hanne”
```
### Collections
Different ways to write collections are `array`,`list` and `table`. There are tree types of syntax. One that use sets, and two that use lists. 
This collection syntaxes has to have lists with at least one elemnt, so the list can not be empty.
```
B = [1,2,3,4]
B = [[1,2],[3,5]]

B = {1,2,4} //all elements will be unique
```
This collection syntax does allow empty lists.
```
B is new list with number //empty list
B is new list with number that contains 1,3,5
B equals new table with text that contains “hanne”, “petter”
```
#### Retrieve element from list
```
B at 0 //will retrieve the 0 element in the list
B[0] //will retrieve the 0 element in the list
```

#### Add elements to list
```
B add 1 //will add 1 to the list B
```
#### Remove elements from list
```
B remove 2 {will remove element on place 2}
```
#### Swap places of elements in list
```
B = [1,2,3,4] {before}
exchange B at 0 with B at 2
B = [3,2,1,4] {after}
```

#### Change element in a place in the list
```
B set 0 to 9 {this will set the number 9 on place 0 in the list}
B set 0,1 6 {this will set the number 6 on row 0 column 1} 
```
#### Find the size of the list
```
size of B
if the list is 2 dimensions:
size of (B[0]) {get the length of the columns}
size of B {get the length of the rows}
```

### Statements

#### While
```
while name != “Hanne”
	print name
```
#### For
```
for 0 to 10
	print "Hello"
```

```
for interval 2 to 9 
	print "Hello"
```
#### If
```
if language != “english” then
	print “Hello World”
else
	print “Hei Verden”
```

```
if language != “english” then
	print “Hello World”
	if 2 != nr then
		print “Hello London”
	else
		print “Hello New York”
else 
	print "Hei Verden"
	if 2 >= year then
		print “Hei Trondheim”
	else
		print “Hei Oslo”

```

### Stop
In a function or a statement it is possible to jump out of parts of the code or return variables, text or numbers. The stop statements can be used but are not necessary for the code syntax.

```
return “and the statement you want to return” 
break {wil break out of the loop}
continue {wil jump to next iteration of the loop}
stop {is used to signal that a loop or a function has ended, after stop in the other blok of the function, there are not allowed to write more code}
```
### Expressions
#### Print
```
print «expression»
print line «expression» {line is used to get new line after the print}
print “hello world”
```
#### Arithmetic Expressions
The Arithmetic expressions have multiple ways to code the same thing, here are the different once:\
 pseudo | standard 
 -|-
 plus | + 
 minus | - 
 divid | / 
 modulo | % 
 times | * 
#### Comparing operators
The Comparing  operators have in some cases multiple ways to code the same thing, here are the different once.\
 pseudo | standard 
 -|-
lessThen | <
biggerThen | >
and | &
or | \|
| | <= | 
| | >= | 
| | == |
| | != |





