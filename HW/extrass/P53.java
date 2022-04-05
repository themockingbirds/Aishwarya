import java.io.*; 
class P53{
	public static void main(String args[]) throws IOException{
	//InputStreamReader obj=new InputStreamReader(System.in);
	BufferedReader obj1=new BufferedReader(new InputStreamReader(System.in));
	int a,b,c;
	System.out.print("Enter three numbers: ");
	a=Integer.parseInt(obj1.readLine());
	b=Integer.parseInt(obj1.readLine());
	c=Integer.parseInt(obj1.readLine());
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	System.out.println("c: "+c);
	System.out.println("sum: "+(a+b+c));
	}
}
	