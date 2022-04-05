import java.io.*; 

class Project1{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1);
    	int u[]=new int[3];
    	int c[]=new int[3];
    	String name,flag="hello",flagC="hi";
    	int score=0,scoreC=0;
    	System.out.print("Input Your User Name: ");
    	name=obj.readLine();
    	System.out.println("\n");
    	System.out.printf("%40s\n","~Rock Paper & Scissors~");
    	System.out.printf("%30s%s\n","Hello, ",name);
    	
    	
    		for(int j=0;j<3;j++){
				System.out.println("----------------------------------------------------------------");
				System.out.printf("%s%d\n","Round -> ",j+1);
				System.out.println("----------------------------------------------------------------");
				System.out.println("Choose your armor ->");
				System.out.println("\n");
				System.out.printf("%10s\n","	0.-> Rock   1.-> Paper   2.-> Scissors");
				System.out.println("\n");
				System.out.print(name+" :   -> ");
				u[j]=Integer.parseInt(obj.readLine());
				if(u[j]==0){
					flag="Rock";
				}
				else if(u[j]==1){
					flag="Paper";
				}
				else if(u[j]==2){
					flag="Scissors";
				}
				
				System.out.print("Computer:  -> ");
				c[j]=Integer.parseInt(obj.readLine());
				if(c[j]==0){
					flagC="Rock";
				}
				else if(c[j]==1){
					flagC="Paper";
				}
				else if(c[j]==2){
					flagC="Scissors";
				}
				
				System.out.println(name+" : "+u[j]+" -> "+flag);
				System.out.println("Computer : "+c[j]+" -> "+flagC);
				if(u[j]==0&&c[j]==2||u[j]==1&&c[j]==0||u[j]==2&&c[j]==1){
					score++;
				}
				else if(u[j]==0&&c[j]==1||u[j]==1&&c[j]==2||u[j]==2&&c[j]==0){
					scoreC++;
				}
				else if(u[j]==c[j]){
					System.out.println("Oops, It's a tie");
				}	
				System.out.println("Round "+(j+1)+" Scores:");
				System.out.println("	"+name+" : "+score+"	Computer : "+scoreC);
			}
		
		
			System.out.println("----------------------------------------------------------------");
			System.out.printf("%40s\n","Score Board");
			System.out.print("\n");
			
				for(int j=0;j<3;j++){
					System.out.printf("Round %d Score ->",j+1);
					System.out.println(name+" : "+u[j]+"  Computer : "+c[j]);
					System.out.println("\n");
			
			}
					System.out.println("\n");
					System.out.println("----------------------------------------------------------------");
					if(score==scoreC){
						System.out.println("		  !! You Both Are Very Tough !!");
					}
					if(score>scoreC){
						System.out.println("			Congrats !! ~"+name+" WON~ !!");
					}
					if(score<scoreC){
						System.out.println("			Congrats !! ~Computer WON~ !!");
					}
			
	}
}




