import java.util.Scanner;
class P10{
	public static void main(String arg[]){
		String a="hello";
		Scanner s=new Scanner(System.in);
		System.out.print("enter a word: ");
		if(s.hasNextLine()){
			a=s.nextLine();
			System.out.println("String: "+a);
		}
		else{
			System.out.println("invalid");
		}
		s.close();
	}
}
		