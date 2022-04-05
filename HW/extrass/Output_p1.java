class Output_p1{
	public static void main(String arg[]){
		int age=45;
		String name="Hello World";
		char gender ='M';
		float salary =34562.987F;
		
		System.out.printf("Name : %s\nGender : %c\nAge : %d\nSalary : %f",name,gender,age,salary);
		
		System.out.printf("Name : %s\n"+
			"Gender : %c\n"+
			"Age : %d\n"+
			"Salary : %f"
			,name,gender,age,salary);
		
	}
}