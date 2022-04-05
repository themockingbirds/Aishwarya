class ExtraClasses{
	public static void main(String ar[]){
		System.out.println("I am main");
		Hello obj = new Hello();
		obj.sayHi();
	}
}
class Hello{
	void sayHi(){
		System.out.println("I am Hello Class");
	}
}