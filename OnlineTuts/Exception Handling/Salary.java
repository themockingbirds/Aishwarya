import java.util.*;
import java.lang.*;

class NegativeValueException extends Exception{

	@Override
	public String toString(){
		return "Negative Value Can't Be accepted";
	}

	@Override
	public String getMessage(){
		return "Negative Value Can't Be accepted";
	}
	
	NegativeValueException(){

	}
	NegativeValueException(String str){
		super(str);
	}
	
	/*
	public String display(){
		return "Negative Value Can't Be accepted";
	}
	*/

}
class Salary{
	public static void main(String[] args) {
		int salary;
		Scanner sc  = new Scanner(System.in);	
		try {
			salary=sc.nextInt(); //-7
			if(salary<0)
				//throw new NegativeValueException("Negative Value Can't Be accepted");	
				throw new NegativeValueException();	
		} catch(NegativeValueException e) {
			System.out.println("Error Occurred:\n"+e.toString());
			System.out.println("Error Occurred:\n"+e.togetMessage());
		}
		
	}
}