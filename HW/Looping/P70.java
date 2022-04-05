import java.io.*; 
/*	28. WAP to take a number input and check that is even or odd,
		a. if even then find the cube of that number and display the result.
		b. if odd then find the square of that number and display the result.
*/

class P70{ 
    public	 static void main(String [] args) throws IOException{
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int a,rev=0,rem,cube=0,square=0,rem1=0,rev1,reverse;
    	System.out.print("Enter a number:  "); 
		a=Integer.parseInt(obj.readLine());
		while(a!=0){
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		rev1=rev;
		while(rev1!=0){
			rem1=rev1%10;
			reverse=reverse*10+rem1;
			rev1=rev1/10;
		}
		
			if(reverse%2==0){
				cube=rev*rev*rev;
				System.out.println("Cube: "+cube);
			}
			else{
				square=rev*rev;
				System.out.println("Square: "+square);
			}
		
	}
}