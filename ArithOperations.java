public class ArithOperations{

public static void main (String[] args){

int u = 2, v = 3, w = 5, x = 7, y = 11;

int result1, result2, result3;

result1 = u + y * w + x;
result2 = u + y % v * w + x;
result3 = u++ / v + u++ * w;

System.out.println (" u + y * w + x  : " +result1);
System.out.println (" u + y % v * w + x : " +result2);
System.out.println (" u++ / v + u++ * w : " +result3);

/* Got error while compiling "Could not find or load main class ArithOperations.java" with below
System.out.println (" u + y * w + x  : " +(u + y * w + x ));
System.out.println (" u + y % v * w + x : " +(u + y % v * w + x ));
System.out.println (" u++ / v + u++ * w : " +(u++ / v + u++ * w));
*/


}
}
