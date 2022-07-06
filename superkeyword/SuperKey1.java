class SuperKey1{
	public static void main(String arg[]){
		Child obj1 = new Child();
		Child obj2 = new Child(5);
		//Base bse =new Base();
		//bse.display(); //not allowed becase this method is protected
	}
}
class Base{
	Base(){
		System.out.println("I am base Cons");
	}
	
	Base(int i){
		System.out.println("i: "+i);
	}
	protected void display(){
		System.out.println("I am base");
	}
		
}
class Child extends Base{
	Child(){
		super(); //case 1
		//super(5); //case 2
		//displayChild();
		System.out.println("I am child cons");
		//displayChild();
	}
	
	Child(int i){
		super();
		System.out.println("i: "+(i++));
	}
	//@Override  -- not applicable
	void diplay(){
		System.out.println("I am in Child class");
	}
	void displayChild(){
		System.out.println("I am Child Class");
	}
}
/*
output case 1--
I am base cons
I am child class
child cons
child class

outputcase 2--
i: 5
I am child class
child cons
child class
*/