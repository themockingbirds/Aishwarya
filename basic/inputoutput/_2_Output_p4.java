package basic.inputoutput;

//show  date  and time
import java.util.Calendar;

/*
    tB	 	    display full name of month.
    td, te	 	display day of month.
                td has leading zeroes as needed for day with single digit like 1, te does not.

    tm	 	    display months in 2 digits, with leading zeroes as necessary.

    ty, tY	    display ty = 2-digit year, tY = 4-digit year.

    tl	 	    display hour in 12-hour clock.
    tM	 	    display minutes in 2 digits, with leading zeroes as necessary.
    tp	 	    display locale-specific am/pm (lower case).

 */

public class _2_Output_p4 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        // tB	 	display full name of month.
        // tm	 	display months in 2 digits, with leading zeroes as necessary.
        // te	 	display day of month.
        // ty, tY	    display ty = 2-digit year, tY = 4-digit year.
        System.out.printf("Date (Month Date, Year): %tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"
        System.out.printf("Date (Month DD, YY): %tB %te, %ty%n", c, c, c); // -->  "May 29, 2006"
        System.out.printf("Date (MON/Date/Year): %tm/%te/%tY%n", c, c, c); // -->  "05 29, 2006"

        // tl	 	    display hour in 12-hour clock.
        // tM	 	    display minutes in 2 digits, with leading zeroes as necessary.
        // tp	 	    display locale-specific am/pm (lower case).
        System.out.printf("Time : %tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

        //tD	 	    display date as %tm%td%ty
        System.out.printf("Date: %tD%n", c);    // -->  "05/29/06"

    }
}