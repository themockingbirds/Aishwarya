class S_NsVar{
	int i;
	public static int count;
	S_NsVar(){
		i++;
		count++;
	}
	
	public static void main(String arg[]){
		S_NsVar obj = new S_NsVar();
		System.out.println("i: "+obj.i); //1

		System.out.println("Count: "+count); 
		S_NsVar obj2 = new S_NsVar();

		System.out.println("i: "+(obj2.i)); //1
		
		System.out.println("Count: "+(S_NsVar.count)); 
		
		Abc abc =new Abc();
		
		//abc.display();
		
		Abc.display();
		nabstract class Abs{
	abstract void greet();

	void sayGm(){
		System.out.println("Good Morning");
	}
}

abstract class Def extends Abs{
	//void  greet(){
		
		//
	//}
	void sayGa(){
		System.out.println("Good afternoon");
	}
}
class Abs_Keyword extends Def{
	void greet(){
		System.out.println("You're welcome");
	}
	public static void main(String[] args) {
			Main obj = new Main();
			obj.greet();
			obj.sayGm();
			obj.sayGa();
	}
}
	}
}

class Abc{
static void display(){
			System.out.println("Count Abc: "+(S_NsVar.count)); 
		}
}