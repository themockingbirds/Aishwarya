import java.io.*; 
//	27. WAP to read a number form user and count even and odd digit in that number.
class P69{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int a,rem,even=0,odd=0;
    	System.out.print("Enter a number:  "); 
		a=Integer.parseInt(obj.readLine());
		while(a!=0){
			rem=a%10;
			a=a/10;
			if(rem%2==0){
				even++;
			}
			else{
				odd++;
			}
			
		}
		System.out.println("total even digits: "+even);
		System.out.println("total odd digits: "+odd);
	}
}