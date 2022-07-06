import addition.*;
class Main{
	public static void main(String[] args) {
		Sum sum=new Sum();
		Product pro=new Product();
		Sub sub=new Sub();
		Divide divi=new Divide();

		System.out.println(sum.getSum(5,6));
	}
}