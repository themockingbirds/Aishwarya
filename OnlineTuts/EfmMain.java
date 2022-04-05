

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


class EfgMain{
	public static void main(String arg[]){
		Efg obj = new Efg();
		obj.a=10;
		obj.b=10;
		obj.c=11;
		//obj.displayA(); //private method can be access outside of the class
	}
}