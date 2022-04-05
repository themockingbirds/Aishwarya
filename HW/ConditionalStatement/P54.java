import java.io.*;
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
class P54{
	public static void main(String args[]) throws IOException{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		char ch;
		System.out.print("Enter: ");
		ch =(char)obj.read(); 
		if(ch>=48&&ch<=57){
			System.out.println("You entered a number");
		}
		else if(ch>=65&&ch<=90){
			System.out.println("You entered a character");
		}
		else{
			System.out.println("You entered a special character");
		}
	}
}
        