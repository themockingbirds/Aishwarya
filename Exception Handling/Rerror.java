//Multuple Catch Block
class Rerror{
	public static void main(String[] args) {
		int a[] ={5,10};
		int b=10;
		try{
			int x=a[0]/(b-a[1]);
			System.out.println("y: "+y);
		}
		catch(ArithmeticException e){
			System.out.println("Divison by 0");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Error");
		}
		catch(ArrayStoreException e){
			System.out.println("Wrong Data Type");
		}

		int y = a[1]/a[0];
		System.out.println("y: "+y);
	}
}