import java.io.*; 
/*
22.
Create an array of size N, and input their element from keyboard.
WAP to find out how many of them are +ive, -ive or zero, also how many are even and odd.

 */
class P82{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int size,positive=0,negative=0,even=0,odd=0;
    	System.out.print("Input the size of array: ");
    	size=Integer.parseInt(obj.readLine());
    	System.out.print("Input array elements: ");
    	int arr[]=new int[size];
    	for(int i=0;i<size;i++){
    		arr[i]=Integer.parseInt(obj.readLine());
    		System.out.print(" ");
    	}
    	for(int i=0;i<size;i++){
			if(arr[i]>=0){
				positive++;
			}
			if(arr[i]<0){
				negative++;
			}
			if(arr[i]%2==0){
				even++;
			}
			if(arr[i]%2!=0){
				odd++;
			}
		}
			System.out.println("Positive: "+positive);
			System.out.println("Negative: "+negative);
			System.out.println("Even: "+even);
			System.out.println("Odd: "+odd);
    	
    }
}