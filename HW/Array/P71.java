import java.io.*; 
/*2. WAP to create an integer array and initialize 10 element in the given array, then print them on console using Iteration Statement.
	Output Format:
		Elements are
		1 2 3 4 5 6 7 8 9 10
*/
class P71{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int[] arr ={1,2,3,4,5,6,7,8,9,10};
    	System.out.println("The elements are: ");
    	for(int i=0;i<10;i++){
    		System.out.print(arr[i]);
    		System.out.print(" ");
    	}
    }
}