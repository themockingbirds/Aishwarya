class MainClass{
	int i=0;
	public static void main(String[] arg){
		
		MainClass obj1= new MainClass();
		MainClass obj2= new MainClass();
		obj1.i=5;
		System.out.println(sum());
		System.out.println(MainClass.sum());
		System.out.println(obj1.i);
		System.out.println(obj1.sub());
		
		System.out.println("Sub Class");
		Sub sub = new Sub();
		System.out.println(sub.sum(9,6));
		
		int s=Sub.sum(6,8);
		System.out.println(s);
		System.out.println(Sub.l);
		System.out.println(sub.k);
		sub.display();
	}
	static int sum(){
		return 5+6;
	}
	int sub(){
		return 5-6;
	}
}

class Sub{

int k=9;
static int l=45;
	int sub(int i, int j){
		return i-j;
	}
	void display(){
		Sub o=new Sub();
		System.out.println(this.k);
		System.out.println(this.k);
		System.out.println(l);
	}
	static int sum(int i, int j){
		return i+j;
	}
}