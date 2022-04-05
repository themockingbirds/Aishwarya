import java.io.*; 
//	12. WAP to print the all number from 1 to N where number is divisible by 2 and 5, N input by a user.

class P64{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int n;
    	System.out.print("Enter the value of n:  "); 
		n=Integer.parseInt(obj.readLine());
		for(int i=1;i<=n;i++){
			if(i%2==0&&i%5==0){
				System.out.println(i);
			}
		}
		
	}
		
}