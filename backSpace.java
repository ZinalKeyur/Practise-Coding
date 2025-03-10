public class backSpace{
	public static void main (String[] args){
		
		System.out.println("\"\"tTest\\\\\rIt\'");  /* O/p -> It'est\\ 									*/       // -> DOUBT
		System.out.println("\"\"tTest\\\\\nIt\'");  /* O/p -> ""tTest\\ and in another line It' 		*/       // -> UNDERSTOOD
		System.out.println("\"\"tTest\\\\\tIt\'");  /* O/p -> ""tTest\\       It' 						*/       // -> UNDERSTOOD
		System.out.print("one ");
		System.out.print("two ");
		System.out.println("three");
		System.out.print("one \n");
		System.out.print("two \n");
		System.out.println("three \n");
		}
}
