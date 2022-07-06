interface Abc{
	int n=11; //can't be change later
	void sum();
	void display();
}

interface Def{
	void sub();
	void multi();
}

class InfMain implements Abc, Def{
	
	public void sum(){
		System.out.println("Sum");
	}
	public void sub(){
		System.out.println("Sub");
	
	}
	public void multi(){
		System.out.println("Multi");
		
	}
	
	public void display(){
		//n=20;
		//++n;
		//n++;
		System.out.println("Display n "+n);
			System.out.println("Display ");
	}
	
	public static void main(String arg[]){
		InfMain obj=new InfMain();
		obj.sum();
		obj.display();
		obj.sub();
		obj.multi();
	}
}

