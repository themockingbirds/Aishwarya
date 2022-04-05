import java.io.*; 
/*

29. WAP program to find all roots of a Quadratic equation using switch case.
 */
class P61{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int a,b,c,d,root,root1;
    	System.out.print("Enter the values of a,b,c(ax^2+bx+c):  "); 
		a=Integer.parseInt(obj.readLine());
		b=Integer.parseInt(obj.readLine());
		c=Integer.parseInt(obj.readLine());
		d=(b*b(-4*a*c));
		if(d>0){
			root=(-b+Mathsqrt(d)/2*a);
			root1=(-b-Mathsqrt(d)/2*a);
			System.out.println("Roots of the equation: "+root+" and "+root1);
		}
		if(d==0){
			root=(-b/2*a);
			root1=root;
			System.out.println("Roots of the equation: "+root+" and "+root1);
		}	
		if(d<0){
			root=(-b/2*a);
			root=(b/2*a);
			System.out.println("Roots of the equation: "+root+" and "+root1);
		}	
	}
}
			
		
			
			
		