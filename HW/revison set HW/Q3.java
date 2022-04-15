//Revision set Q3
/*
	3. WAP to input a character, a number or a special character and check whether user input a 
	character, number or special character. In case of Character input check that is Upper Case Character or Lower Case Character.
	Case 1
	Input format:
		Input : f
	Output Format:
		f: Lower Case

	Case 2:
		Input format:
			Input : 4
		Output Format:
			4: Number
	Case 3:
		Input format:
			Input : @
		Output Format:
			@: Special Character


*/
import java.util.Scanner;
class Q3{
	public static void main(String arg[]){
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("enter:  ");
		ch=s.next().charAt(0);
		if(ch>=65&&ch<=90){
			System.out.println("You entered an Alphabet : Uppercase");
		}
		else if(ch>=97&&ch<=122){
			System.out.println("You entered an Alphabet : Lowercase");
		}
		else if(ch>=48&&ch<=57){
			System.out.println("You entered a Number");
		}
		else{
			System.out.println("You enterd a Special Character");
		}
	}
}




			
 