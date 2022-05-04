class Nestedtry_catch{
	public static void main(String arg[]){
		int a=10, b=5 , c=5,x,y;
		System.out.println("Weclome ...\n");
		try{
			x=a/(b+c);
			System.out.println("x: "+x);
			try{
				x=a/(b-c);
			System.out.println("x: "+x);
			}
			finally{
			}
			
		}
		catch(ArithmeticException e){
			System.out.println("Error ...\n");
		}
		finally{
			System.out.println("Thank you for using my program");
		}
		y=a/(b+c);
		System.out.println("y: "+y);
		
	}
}