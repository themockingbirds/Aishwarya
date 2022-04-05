import java.util.Scanner;
class ScannerClass{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input an Integer: ");
		int num=0;
		float fl=0F;
		boolean flag;
		//flag=sc.hasNextInt();
		//System.out.println("Num : "+flag);
	
		if(sc.hasNextInt()){
			//System.out.println("Num : "+flag);
			num=sc.nextInt();
			System.out.println("Num : "+num);
		}
		else if(sc.hasNextFloat()){
				fl=sc.nextFloat();
				System.out.println("fl : "+fl);
			
		}else{
			System.out.println("Input Wrong Data");
		}

		sc.close();
	}
}