import java.util.*;
class RNum{
	public static void main(String arg[]){
		Random rnd = new Random();
		int r;
		for(int i=0;i<20;i++){
			r=rnd.nextInt(5);
			System.out.print(r+" ");
		}
	}
}