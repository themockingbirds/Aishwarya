import java.util.Scanner;
class P50{
	public static void main(String arg[]){
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a character:  ");
		ch=s.next().charAt(0);
		if(ch>='A'&&ch<='Z'){
			System.out.println("You entered a character");
		}
		else{
			System.out.println("Oops!Wrong input");
		}
	}
}
