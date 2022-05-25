import java.util.*;
class MultipleCatch {
	 public static void main(String[] args) throws IOException{
        int i;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Input : ");
            i=sc.nextInt(); //t
            System.out.println(i);
            
            int[] arr=new int[5];
            arr[5]=10;
            
        } catch(InputMismatchException | ArithmeticException | IndexOutOfBoundsException e){
            
        		System.out.println("Exception Occurred: "+e+"\n");
            
        } finally {
        	
            System.out.println("======= | Thank  you | =======");
        }
    }
}