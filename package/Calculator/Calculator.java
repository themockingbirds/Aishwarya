import basicmath1.Sum;
import basicmath1.Sub;
//import basicmath.*;
class Calculator{
	public static void main(String[] args) {
		Sum sum = new Sum();
		Sub sub=new Sub();
		System.out.println("Sum  "+sum.getSum(10,8));
		System.out.println("Sub  "+sub.getSub(43,8));
	}
}
