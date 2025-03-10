// given static value of x, what should be output ?


public class Math2{

public static void main (String[] args){
//int x = 10;
//OR

int x = 10;

System.out.println("Test 1" + x * 3 * 2.0);
System.out.println("Test 2" + x * 3 + 2.0);
//System.out.println("Test 3" + x * 3 - 2.0); // error : string - double not possible
System.out.println("Test 3 " + (x * 3 - 2.0)); // but this works
System.out.println("Test 4 :" + x * 3 * 2.0);
System.out.println("Test 5 :" + x * 3 + 2.0);
System.out.println("Test 6 :" + ((x * 3) + 2.0));
System.out.println("Test 7 :" + 56 + 2.0 + 37);
System.out.println("Test 8 :" + (56 + 2.0 + 37));


}
}


/*

// note that without brackets, + acts as concatination instead of addition
D:\java>java Math2
Test 160.0
Test 2302.0
Test 3 28.0
Test 4 :60.0
Test 5 :302.0
Test 6 :32.0
Test 7 :562.037
Test 8 :95.0
*/

/*
System.out.println("Test 3" + x * 3 - 2.0);
D:\java>javac Math2.java
Math2.java:14: error: bad operand types for binary operator '-'
System.out.println("Test 3" + x * 3 - 2.0); // This did not work, see error below
                                    ^
  first type:  String
  second type: double
1 error
*/