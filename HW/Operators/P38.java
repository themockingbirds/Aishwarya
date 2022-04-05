import java.util.Scanner;
/*
	27. WAP to take a alphabet input and check whether that char is in uppercase or in lowercase.
	Case 1
	Input format:
		Input a char: f
	Output Format:
		f: LowerCase

	Case 2:
	Input format:
		Input a char: e
	Output Format:
		E: UpperCase

 */
class P38{
	public static void main(String arg[]){
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a character : ");
		ch=s.next().charAt(0);
		System.out.print(ch+": ");
		System.out.println((ch>=65&&ch<=90)?"Uppercase":(ch>=97&&ch<=122)?"Lowercase":"invalid");
	}
}
