interface Demo{
	final int a = 5;
	int b=6; //by default it is final type
	void sum();
	default void display(){
		System.out.println("Welcome");
	}
	static void display2(){
		System.out.println("Welcome to static world");
	}
}
class InfMain2 implements Demo{
	public void sum(){
		System.out.println("Sum");
	}
	
	void display2(){
		System.out.println("I am display2");
	}
	public void display(){
		
		System.out.println("a: "+a);
	//	a++; //generate an error
	//b++; //generate an error
	System.out.println("b: "+b);
		System.out.println("Welcome to my program");
	} 
		
	public static void main(String arg[]){
		InfMain2 ob=new InfMain2();
		ob.sum();
		ob.display();
		Demo.display2();
		ob.display2();
		
	}
}