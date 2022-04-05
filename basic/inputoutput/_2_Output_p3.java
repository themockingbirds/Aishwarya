package basic.inputoutput;
import java.util.Calendar;
import java.util.Locale;
/*
d	 	    A decimal integer.
f	 	    A float.
n	 	    A new line character appropriate to the platform running the application. You should always use %n, rather than \n.

   08	Eight characters in width, with leading zeroes as necessary.
 	+	Includes sign, whether positive or negative.
 	,	Includes locale-specific grouping characters.
 	-	Left-justified..
 	.3	Three places after decimal point.
 	10.3	Ten characters in width, right justified, with three places after decimal point.
 */
public class _2_Output_p3 {
    public static void main(String[] args) {
        long n = 461012;
        System.out.format("%d%n", n);      //  -->  "461012"
        System.out.format("%08d%n", n);    //  -->  "00461012"
        System.out.format("%+8d%n", n);    //  -->  " +461012"
        System.out.format("%,8d%n", n);    // -->  " 461,012"
        System.out.format("%+,8d\n", n); //  -->  "+461,012"
        n = 46100912;
        System.out.format("%+,d%n%n", n);      //  -->  "461012"

        double pi = Math.PI;

        System.out.format("%f%n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"
        System.out.format("%+,-10.3f%n", 3463875.4543);  // --> +3,463,875.454
        System.out.format(Locale.US, "%-10.4f%n%n", pi); // -->  "3,1416"


    }
}
