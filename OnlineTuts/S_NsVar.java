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
		abc.display();
	}
}

class Abc{
	static void display(){
			System.out.println("Count: "+(S_NsVar.count)); 
		}
}