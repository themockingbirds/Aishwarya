class ExpHandling{
	public static void main(String arg[]){
		int a=10, b=5 , c=5,x,y;
		
		// x=a/(b-c); //cause  an error because  dividing by zero is not possible.
		//System.out.println("x: "+x); //  due to that program will get terminated
		
		try{
			x=a/(b+c);
			System.out.println("x: "+x);
		}
		catch(ArithmeticException e){
			System.out.println("Error Occurred : Division By 0");
		}
		
		y=a/(b+c);
		
		System.out.println("y: "+y);
	}
}
