import java.io.*; 

class Project2{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int heightBus,passengers,heightBridge,flag=0;
    	System.out.print("Height of the bus: ");
    	heightBus=Integer.parseInt(obj.readLine());
    	System.out.print("Number of passengers in the bus: ");
    	passengers=Integer.parseInt(obj.readLine());
    	int bus[]=new int[passengers];
    	System.out.print("Height of the bridges: ");
    	
    	for(int i=0;i<passengers;i++){
    		bus[i]=Integer.parseInt(obj.readLine());
    		System.out.print("");
    	}
    	
    	for(int i=0;i<passengers;i++){
    		if(heightBus>=bus[i]){
    			flag=1;
    			System.out.printf("Bus will crash at Bridge ");
    			System.out.println(++i);
    			break;
    		}
    	}
    	if(flag==0){
    		System.out.println("Bus will not crash");
    	}
    }
}
    	