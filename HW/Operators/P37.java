import java.util.Scanner;
/*
	26. WAP to take a char input and  check Whether a Character is Vowel or consonant.

	Case 1
	Input format:
		Input a char: f
	Output Format:
		f: consonant

	Case 2:
	Input format:
		Input a char: e
	Output Format:
		e: vowel

 */
class P37{
	public static void main(String arg[]){
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a character : ");
		ch=s.next().charAt(0);
		System.out.print(ch+": ");
		System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?"vowel":"consonant");
	}
}
