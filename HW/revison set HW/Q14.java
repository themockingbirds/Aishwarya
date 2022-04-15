//revision set Q14
/*
WAP to give an example to explain the use of super keyword.
*/
import java.util.Scanner; 
class Q14{
	public static void main(String args[]){ 
		Child c=new Child();
	}
}
class Parent{
		Parent(){
		System.out.println("x: 1");
	}
}

class Child extends Parent{
		Child(){
		super();
		System.out.println("y: 2");
	}
}

	

	
