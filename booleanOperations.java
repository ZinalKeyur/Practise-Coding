public class booleanOperations{
	
	public static void main (String[] args){
		
	int x=5, y=10, z=15;
	
	if (x < 5 && y > x)System.out.println("1 is true");
	if (x < 5 || y > x)System.out.println("2 is true");
	if (x > 3 || y < 10 && z == 15)System.out.println("3 is true");
	if (!(x > 3) && x != z || x+y ==z)System.out.println("4 is true");
	if (!(x > 6) && x != z || x+y ==z)System.out.println("5 is true");
	
	//if !x > x+y   // will not work with error () expected
	if (!(x > x+y)){
	x = 2 * x;
	System.out.println("6 is true");}
	else{
	x = x + 3;	
	System.out.println("7 is true");}	
	
	}
}