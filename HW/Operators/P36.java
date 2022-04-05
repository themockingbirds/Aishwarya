import java.util.Scanner;
/*
	25. WAP to check whether character is an alphabet or not using conditional operator.

	Case 1
	Input format:
		Input a char: A
	Output Format:
		A: char

	Case 2:
	Input format:
		Input a char: 5
	Output Format:
		5: Invalid Input.

 */
class P36{
	public static void main(String arg[]){
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a character : ");
		ch=s.next().charAt(0);
		System.out.print(ch+": ");
		System.out.println(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?"Char":"Invalid input");
	}
}