import java.io.*; 
//27. WAP to accept the co-ordinate point in x y and determine in which quadrant that point lies.
class P59{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int x,y;
    	System.out.print("Enter the values of x axis(x,y):  "); 
		x=Integer.parseInt(obj.readLine());
		System.out.print("Enter the values of y axis(x,y):  "); 
		y=Integer.parseInt(obj.readLine());
		if(x>=0&&y>=0){
			System.out.println("The point lies in first quadrant");
		}
		else if(x<0&&y>=0){
			System.out.println("The point lies in second quadrant");
		}
		else if(x<0&&y<0){
			System.out.println("The point lies in third quadrant");
		}
		else{
			System.out.println("The point lies in fourth quadrant");
		}	
	}
}