abstract class Abs{
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
class Main extends Def{
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