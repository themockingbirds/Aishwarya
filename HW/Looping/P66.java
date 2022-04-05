import java.io.*; 
//23. WAP  to print the revers of any number.
class P66{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int a,rev=0,rem;
    	System.out.print("Enter a number:  "); 
		a=Integer.parseInt(obj.readLine());
		while(a!=0){
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println("Reverse: "+rev);
	}
}