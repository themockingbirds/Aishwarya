interface NewShape{
	void draw();
}

interface Circle{
	//void draw();
	void getRadius();
	int radius =10;
}

class NewCircle implements Circle, NewShape{
	
	
	public void draw(){
		System.out.println("Draw a Circle");
	}
	public  void getRadius(){
		System.out.println("Radius : "+radius);
	}
}
class InterfaceVar{
	public  static void main(String arg[])
	{
		NewCircle nc = new NewCircle();
		nc.getRadius();
		nc.draw();
	}
}