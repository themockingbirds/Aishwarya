//revision set Q13

/*import java.util.Scanner; 
class Q13{ 
	static int function(int x){
		return x;
	}
	static int function(int x,int y){
		return (x+y);
	}
		
    public static void main(String args[]){ 
    	System.out.println(function(1));
    	System.out.println(function(1,2));
    }
}*/


/*
	12. WAP to read the following information from the keyboard in which 
	the base class consists of: employee name, code and designation. 
	The derived class contains the data members, viz. years of experience and age. 
	Now  perform the following information:
		a. Display all records of employee.
		b. search and find the record using employee code.

*/

   
import java.util.Scanner; 
class Q13{
	public static void main(String args[]){ 
		Child c=new Child();
		c.function();
		Parent p=new Parent();
		p.function();
	}
}
class Parent{
	void function(){
		System.out.println("x: 1");
	}
}

class Child extends Parent{
	void function(){
		System.out.println("y: 2");
	}
}

    	