import java.util.Scanner;
class P6{
	public static void main(String arg[]){
		String fn,ln;
		int roll,cls;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		fn=s.nextLine();
		System.out.print("Enter last name: ");
		ln=s.nextLine();
		System.out.print("Enter roll: ");
		roll=s.nextInt();
		System.out.print("Enter class: ");
		cls=s.nextInt();
		s.close();
		System.out.println("Name: "+fn+" "+ln);
		System.out.println("Roll: "+roll);
		System.out.println("Class: "+cls);
	}
}
		
		