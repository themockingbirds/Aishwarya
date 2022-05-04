class Finally{
	public static void main(String arg[]){
		int a=10, b=5 , c=5,x,y;
			//x=a/(b-c);
		//System.out.println("x: "+x);
		System.out.println("Welcome in my program");
		/*
		try{
			x=a/(b-c);
			System.out.println("x: "+x);
		}
		finally{
				System.out.println("Thank you for using my program");
				y=a/(b+c);
			System.out.println("y: "+y);
		}

		System.out.println("Good Bye");
		*/
		
		try{
			x=a/(b-c);
			System.out.println("x: "+x);
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