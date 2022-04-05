import java.io.*; 
//	24. WPA to calculate and display the total sum of digits of a Number.
class P67{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int a,rev=0,rem,sum=0;
    	System.out.print("Enter a number:  "); 
		a=Integer.parseInt(obj.readLine());
		while(a!=0){
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			sum=sum+rem;
		}
		
		System.out.println("sum of digits: "+sum);
	}
}