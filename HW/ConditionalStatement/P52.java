import java.util.Scanner;
/*
	11. WAP to check whether the given input is a char or number or special chars.

	Input/Output Format 1:
		Input a char: A
		you input a char.

	Input/Output Format 2:
		Input a char: 4
		You input a number

	Input/Output Format 3:
		Input a char: @
You input a special char.
 */
class P52{
	public static void main(String arg[]){
		String ch;
		Scanner s=new Scanner(System.in);
		System.out.print("enter:  ");
		ch=s.nextLine();
		if(ch>=65&&ch<=90){
			System.out.println("You entered a character");
		}
		else  if(ch>=0&&ch<=9){
			System.out.println("You entered a number");
		}
		else{
			System.out.println("Special character");
		}
	}
}