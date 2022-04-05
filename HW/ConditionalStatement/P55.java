import java.io.*;
/*
	20. WAP to find greatest or smallest  num between 3 number where the choice is input by the user.
	Input/Output Format :
		Input three number: 34 45 56
		Enter your choice(g or s): g
		Greatest number is: 56
 */
class P55{
	public static void main(String args[]) throws IOException{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c,ch;
		System.out.print("Enter a number: ");
		a=Integer.parseInt(obj.readLine());
		System.out.print("");
		//System.out.print("Enter another number: ");
		b=Integer.parseInt(obj.readLine());
		System.out.print("");
		//System.out.print("Enter another number: ");
		c=Integer.parseInt(obj.readLine());
		
		System.out.print("1: greatest  2: smallest  : ");
		ch=Integer.parseInt(obj.readLine());
		switch(ch){
			case 1:
			if(a>b&&a>c){
				System.out.println(a+" is greatest");
			}
			else if(b>a&&b>c){
				System.out.println(b+" is greatest");
			}
			else{
				System.out.println(c+" is greatest");
			}
			break;
			
			case 2:
				if(a<b&&a<c){
				System.out.println(a+" is smallest");
			}
			else if(b<a&&b<c){
				System.out.println(b+" is smallest");
			}
			else{
				System.out.println(c+" is smallest");
			}
			break;
			
			default:
				System.out.println("invalid choice");
			break;
		}
	}
}
				
			
			