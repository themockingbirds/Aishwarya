

class Efg{
	private int a;
	int b;
	public int c;
	Efg(){
		displayA();
	}
	
	private void displayA(){
		System.out.println(a);
		
	}
void displayB(){
		System.out.println(b);
		displayA();
	}
	void displayC(){
		System.out.println(c);
	}
}


class AccModifier{
	public static void main(String arg[]){
		AccModifier obj = new AccModifier();
		obj.a=10;
		obj.b=10;
		obj.c=11;
		//obj.displayA(); //private method can be access outside of the class
	}
}