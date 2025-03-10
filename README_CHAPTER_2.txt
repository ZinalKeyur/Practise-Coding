VARIABLE DECLARATION

datatype variableName = variableValue;

declaring a variable with appropriate datatype helps compiler/computer understand how to encrypt or decrypt or retrieve bytecode data, and how much memory it will use.

Data Type -> class type -> declares the type of class objects -> start with upper letter
			 Primitive type -> declares the type of variable -> starts with lower letter
				-> Type		value		memUsed		Range of Values
				   byte		Integer		1 byte		-128 to 127
				   short	Integer		2 bytes		-32768 to 32768
				   int		Integer		4 bytes		-2147483648 to +
				   long		Integer		8 bytes		-9223372036854775808 to +
				   float	F-point     4 bytes     +-3.402.......*10^308 to +- 1.40...........*10^-45
				   double	F-point     8 bytes		+-1.797.......*10^308 to +- 4.94...........*10^-324
				   char  	Single char	2 bytes		0 to 65535
				   boolean              1 bit		true or false (o or 1)
				   

Float or double -> has decimal/fractional part
char -> for single characters like letters digits punctuation etc.
All primitive types in lower letters

Java identifiers -> the variables are also called identifiers.
					Variable names can have letters,digits,_. No space,*,should not start with a digit.
					good practise -> numberOfBaskets, totalBefore, totalAfter. (punctuate words using uppercase.)
					Java is case sensitive. So "count" and "Count" are considered 2 diff variables.
					
Keywords / reserverd words -> have predefined meaning in Java. (public,static,void,class). 
							  some eg.: of not a keyword because its meaning can be changed in Java through settings are println,main,etc.
							  
Assignment Operator -> = -> assigns value to a variable

Variable = Expression;  -> This is called Assignment statement.

Variable can be initiatized by when you give it some value. or it is called uninitalized.

int count = 0;
double taxRate=0.075;
char grade = 'A'
int balance = 1000, newBalance;
double height=12.34, prize=7.3+increment;