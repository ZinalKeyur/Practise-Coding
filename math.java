public class math{

public static void main (String[] args){

int u = 2, v = 3, w = 5, x = 7, y = 11;

int result1, result2, result3, prec1, prec2, prec3;

result1 = u + v * w + x;
result2 = u + y % v * w + x;
result3 = u++ / v + u++ * w;

System.out.println (" 2 + 3 * 5 + 7  result1 : " +result1);
System.out.println (" 2 + 11 % 3 * 5 + 7 result2 : " +result2);
System.out.println (" 2++ / 3 + 2++ * 5 result3 : " +result3);

System.out.println (" 2 + 3 * 5 + 7  : " + u + v * w + x);
System.out.println (" 2 + 11 % 3 * 5 + 7 : " + u + y % v * w + x);
System.out.println (" 2++ / 3 + 2++ * 5 : " + u++ / v + u++ * w);


System.out.println (" (2 + 3 * w + 7) : " + (u + v * w + x));
System.out.println (" (2 + 11 % 3 * 5 + 7) : " + (u + y % v * w + x));
System.out.println (" (2++ / 3 + 2++ * 5) : " + (u++ / v + u++ * w));
}
}

/*  
 Acc to precedence rules
 
 // Note that + operator without bracket beside string acts as concatenation
 First unary operators -> +, - !, ++, --
 Second binary operation -> %, /, *
 Third binary arithematic operators -> - and +
 
i tried getting answer in all way but not sure which is right :(

D:\java>java math
 u + v * w + x  : 24  -> correct
 (u + v * w + x)  : 28
 u + (v * w) + x  : 28
 prec -> u + ( v * w ) + x  : 26
 u + y % v * w + x : 19  -> correct as per precedence rules
 (u + y % v * w + x) : 23
 u + (y %(v * w)) + x : 24
 prec2 -> u + (y % (v * w)) + x : 22
 u++ / v + u++ * w : 15  ->  should be 16 not sure where this comes from
 (u++ / v + u++ * w) : 37
 u + (1 / v) + u + (1 * w) : 21
 prec3 -> ((u++) / v) + ((u++) * w) : 26
 D:\java>java math
 2 + 3 * 5 + 7  result1 : 24 -> correct
 2 + 11 % 3 * 5 + 7 result2 : 19 -> correct
 2++ / 3 + 2++ * 5 result3 : 15
 2 + 3 * 5 + 7  : 4157
 2 + 11 % 3 * 5 + 7 : 4107
 2++ / 3 + 2++ * 5 : 125
 (2 + 3 * w + 7) : 28
 (2 + 11 % 3 * 5 + 7) : 23
 (2++ / 3 + 2++ * 5) : 37
 

 
 */ 









