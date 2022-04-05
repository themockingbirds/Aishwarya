package HW;

//	4. WAP to print the table of 2 in the following format:
//		2 x 1 = 2
//		2 x 2 = 4
//		2 x 3 = 6
//		And so on up to 10.

class P16{
	public static void main(String arg[]){
		int j;
		for(int i=1;i<=10;i++){
			j=2*i;
			System.out.println("2*"+i+"="+j);
		}
	}
}
			