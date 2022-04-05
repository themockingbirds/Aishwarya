import java.util.Scanner;
class P51{
	public static void main(String arg[]){
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a character:  ");
		if(s.hasnext().charAt(0)){
			ch=s.next().charAt(0);
			System.out.println("You entered a character");
		}
		else{
			System.out.println("Oops!Wrong input");
		}
	}
}
