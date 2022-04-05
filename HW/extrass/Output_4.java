class Output_4{
	public static void main(String arg[]){
		​long​ n ​=​ ​461012​; 
 ​        ​System​.​out​.​printf(​"​%d%n​"​, n);      ​//​  -->  "461012" 
 ​        ​System​.​out​.​printf(​"​%08d%n​"​, n);    ​//​  -->  "00461012" 
 ​        ​System​.​out​.​printf(​"​%+8d%n​"​, n);    ​//​  -->  " +461012" 
 ​        ​System​.​out​.​printf(​"​%,8d%n​"​, n);    ​//​ -->  " 461,012" 
 ​        ​System​.​out​.​printf(​"​%+,8d​\n​"​, n); ​//​  -->  "+461,012" 
 ​        n ​=​ ​46100912​; 
 ​        ​System​.​out​.​format(​"​%+,d%n%n​"​, n);      ​//​  -->  "461012" 
  
 ​        ​double​ pi ​=​ ​Math​.​PI​; 
  
 ​        ​System​.​out​.​printf(​"​%f%n​"​, pi);       ​//​ -->  "3.141593" 
 ​        ​System​.​out​.​printf(​"​%.3f%n​"​, pi);     ​//​ -->  "3.142" 
 ​        ​System​.​out​.​printf(​"​%10.3f%n​"​, pi);   ​//​ -->  "     3.142" 
 ​        ​System​.​out​.​printf(​"​%-10.3f%n​"​, pi);  ​//​ -->  "3.142" 
 ​        ​System​.​out​.​printf(​"​%+,-10.3f%n​"​, ​3463875.4543​);  ​//​ --> +3,463,875.454 
 ​        ​System​.​out​.​printf(​Locale​.​US​, ​"​%-10.4f%n%n​"​, pi); ​//​ -->  "3,1416" 
  /*
 ​        ​Calendar​ c ​=​ ​Calendar​.​getInstance(); 
 ​        ​System​.​out​.​printf(​"​%tB %te, %tY%n​"​, c, c, c); ​//​ -->  "May 29, 2006" 
  
 ​        ​System​.​out​.​printf(​"​%tl:%tM %tp%n​"​, c, c, c);  ​//​ -->  "2:34 am" 
  
 ​        ​System​.​out​.​printf(​"​%tD%n​"​, c);    ​//​ -->  "05/29/06"
 */
 	}
}