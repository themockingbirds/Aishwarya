import java.io.*; 
/*
10. WAP to create an integer array of size N and input element through user. After some time User want to modify one element into the array, so ask the user to input the index of the element(Note: for user index start from 1, so if he want to modify index 6, means he want to modify index 5) and then ask what value he/she want to input for that index. Then display the total array's element.
Input format:
	Input Array Size: 10
	Input array Elements:
	5 10 15 20 25 32 35 40 45 50
Output Format:
	Input the index, you want to modify: 6
	Input the data for index 6: 30

	Update array is as given below:
	5 10 15 20 25 30 35 40 45 50

If user input wrong index then display message "index doesn't exit".

 */
class P76{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int size,index,flag=1,num;
    	System.out.print("Input size of the array: ");
    	size=Integer.parseInt(obj.readLine());
    	System.out.print("Input "+size+" elements: ");
    	int arr[]=new int[size];
    	for(int i=0;i<size;i++){
    		arr[i]=Integer.parseInt(obj.readLine());
    		System.out.print(" ");
    	}
    	
    	System.out.print("Enter the index you wish to modify: ");
    	index=Integer.parseInt(obj.readLine());
    	for(int i=0;i<size;i++){
    		if(index==i){
    			System.out.print("Input the data for index "+index+": ");
    			num=Integer.parseInt(obj.readLine());
    			arr[index]=num;
    			System.out.println("updated array is as given below: ");
    			flag=0;
    			for(int j=0;j<size;j++){
    				System.out.print(arr[j]);
    				System.out.print(" ");
    			}
    			break;
    		}
    		else{
    			flag=1;
    		}
    		
    	}
    	if(flag==1){
    		System.out.println("Sorry,element does not exist");
    	}
    	
    	
    	
    }
}