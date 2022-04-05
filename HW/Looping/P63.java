import java.io.*; 
//	10. WAP to find the factorial of a number, whether Number input by a user.
class P63{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int a,fact=1;
    	System.out.print("Enter the number to get it's factorial:  "); 
		a=Integer.parseInt(obj.readLine());
		for(int i=1;i<=a;i++){
			fact=fact*i;
			
		}
		System.out.println("Factorial= "+fact);
	}
		
}