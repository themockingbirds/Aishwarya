import java.io.*;
class ThrowsMain{
	public static void main(String[] arg) {

		InputStreamReader isr = new InputStreamReader(System.in);
       	BufferedReader br=new BufferedReader(isr);

       	System.out.print("Input your name: ");
       	try{
       		String name = br.readLine();	
       	}
       	catch(IOException e){
       		System.out.println("e: "+e);
       	}

       	//System.out.println("Name: "+name);
       	
	}
}