//revision set Q17


/*
	WAP to give an example to use of access modifier.
*/
import java.util.Scanner;
class Q17{
	public static void main(String arg[]){
		Parent p=new Parent();
		Child ch = new Child();
		//p.a=1; //due to private access modifire
		p.setA(5);
		System.out.println("p.a : "+p.getA());
		
		//ch.a=4
		ch.b=2;
		//ch.c=4;
		//p.c=3;--error due  to protect AM
		ch.display();
	}
}
	
	class Parent{
		private int a; //private for all other class.
		
		int getA(){
			return a;
		}
		
		void setA(int a){
			this.a=a;
		}
			
		public int b;
		protected int c;  // only visible to it's child class and for other it remains private.
		
	}

	class Child extends Parent{
		
		void display(){
			//System.out.println("a: "+super.a);
			System.out.println("b: "+(super.b));
			System.out.println("c: "+super.c);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	