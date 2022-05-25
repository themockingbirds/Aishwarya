import java.util.*;
class NegativeValueException  extends Exception{
	NegativeValueException(String message){
		super(message);
	}

}

class Salary{
	public int getSalary(int salary) throws NegativeValueException {
		return salary;
	}
}
//B
class SalaryMain{
	public static void main(String[] arg) throws NegativeValueException{
		int salary;

		Salary obj=new Salary();
		int s=-9,newSalary=0;
		
		/*try{
			newSalary=obj.getSalary(s);
			if(s<0)
				throw new NegativeValueException("Error,-ive value Exception");

			System.out.println("My salary is: "+s);
		}
		catch (NegativeValueException e) {
			System.out.println(e);
		}*/

			newSalary=obj.getSalary(s);
			System.out.println("My salary is: "+s);


	}
}