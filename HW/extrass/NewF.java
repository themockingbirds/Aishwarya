import java.util.*;

class NewF{
	public static void main(String arg[]){
		System.out.println("""
			My name
			is Hello World
			Lhkdfsd
			ds fkdslfdslk
			dsd sgdsl"""
			);
		
		System.out.printf("""
			\nMy name
			is Hello World
			Lhkdfsd %d
			ds fkdslfdslk
			dsd sgdsl %10s\n\n""",54 ,"Hello 231"
		);
		
		Scanner sc = new Scanner (System.in);
		
		switch(sc.nextInt()){
			case 1-> {
				System.out.print("One");
				System.out.println(": 1");
			}
			case 2-> {
			System.out.print("two ");
			System.out.println("2");
			}
			case 3-> System.out.println("three");
			default-> {System.out.println("Error");}
		}
	}
}
			