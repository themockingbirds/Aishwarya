abstract class Abs{
	abstract void greet();

	void sayGm(){
		System.out.println("Good Morning");
	}
}

class Main extends Abs{
	void greet(){
		System.out.println("You're welcome");
	}
	public static void main(String[] args) {
			Main obj = new Main();
			obj.greet();
	}
}