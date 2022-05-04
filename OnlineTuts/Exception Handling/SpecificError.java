class SpecificError{
	public static void main(String arg[]){
		int a=10, b=5 , c=5,x,y;

		//x=a/(b-c);
		//System.out.println("x: "+x);
		try{
			x=a/(b-c);
			System.out.println("x: "+x);
		}
		/*catch(ArithmeticException e){
			System.out.println("Error Ouccred : Division By 0");
			
		}*/
		catch(Exception e){
			System.out.println(e + " \n- Error Ouccred : Division By 0");
			
		}
		
		y=a/(b+c);
		
		System.out.println("y: "+y);
	}
}