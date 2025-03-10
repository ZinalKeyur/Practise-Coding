// Most imp, enums dont have any iteration methods like for each. SO we can use array of enum values given by values().
public class enumeration{
	
	enum months {January, February, March, April, May, June, July, August, September,October, November, December}
	
	public static void main(String[] args){
	
	for (months x : months.values()){
		System.out.println(x);
	}
	}
}


