import java.util.*;
class EqualToZeroEx  extends Exception{
	EqualToZeroEx(String message){
		super(message);
	}

}
class NegativeValueException  extends Exception{
	NegativeValueException(String message){
		super(message);
	}

}
class ArithmeticEx{
	public static void main(String arg[]){
		int a=5,b,r=0;
		Scanner sc = new Scanner(System.in);
		try{
			b=sc.nextInt();
			if(b==0){
				throw new EqualToZeroEx("Equal to Zero");
			}

			try{
				if(b<0){
					throw new NegativeValueException("Negative Value");
				}
			}catch(NegativeValueException e){
				System.out.println("Nestted Try Catch: \n"+e);
			}
		}catch(EqualToZeroEx e){
			System.out.println("Outer Try Catch: \n"+e.getMessage());
			//System.out.println("Outer Try Catch: \n"+e.toString());

			//System.out.println("Outer Try Catch: \n"+e.printStackTrace());
		}
	}

}