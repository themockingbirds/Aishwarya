//revision set Q18
/*
	WAP to give an example to demonstrate the difference between statice variable and non-static variable.
*/
import java.util.Scanner;
class Q18{
	public static void main(String arg[]){
		abc();
		Q18 obj=new Q18();
		obj.def();
	}
	
	static void abc(){
		System.out.println("Static");
	}
	
	void def(){
		int i=0;
		System.out.println("Non Static");
	}
}