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

    	