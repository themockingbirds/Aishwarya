​import​ ​java.util.Calendar​; 
​import​ ​java.util.Locale​; 
 ​/* 
 ​d                     A decimal integer. 
 ​f                     A float. 
 ​n                     A new line character appropriate to the platform running the application. You should always use %n, rather than \n. 
 ​tB                     A date & time conversion—locale-specific full name of month. 
 ​td, te                 A date & time conversion—2-digit day of month. td has leading zeroes as needed, te does not. 
 ​ty, tY                 A date & time conversion—ty = 2-digit year, tY = 4-digit year. 
 ​tl                 A date & time conversion—hour in 12-hour clock. 
 ​tM                 A date & time conversion—minutes in 2 digits, with leading zeroes as necessary. 
 ​tp                 A date & time conversion—locale-specific am/pm (lower case). 
 ​tm                 A date & time conversion—months in 2 digits, with leading zeroes as necessary. 
 ​tD                 A date & time conversion—date as %tm%td%ty 
 ​   08        Eight characters in width, with leading zeroes as necessary. 
 ​         +        Includes sign, whether positive or negative. 
 ​         ,        Includes locale-specific grouping characters. 
 ​         -        Left-justified.. 
 ​         .3       Three places after decimal point. 
 ​         10.3     Ten characters in width, right justified, with three places after decimal point. 
 ​ ​*/ 
​class​ Output_3​ { 
 ​    ​public​ ​static​ ​void​ ​main​(​String​[] ​args​) { 
 ​        ​long​ n ​=​ ​461012​; 
 ​        ​System​.​out​.​format(​"​%d%n​"​, n);      ​//​  -->  "461012" 
 ​        ​System​.​out​.​format(​"​%08d%n​"​, n);    ​//​  -->  "00461012" 
 ​        ​System​.​out​.​format(​"​%+8d%n​"​, n);    ​//​  -->  " +461012" 
 ​        ​System​.​out​.​format(​"​%,8d%n​"​, n);    ​//​ -->  " 461,012" 
 ​        ​System​.​out​.​format(​"​%+,8d​\n​"​, n); ​//​  -->  "+461,012" 
 ​        n ​=​ ​46100912​; 
 ​        ​System​.​out​.​format(​"​%+,d%n%n​"​, n);      ​//​  -->  "+46,100,912" 
 ​        ​double​ pi ​=​ ​Math​.​PI​; 
 ​        ​System​.​out​.​format(​"​%f%n​"​, pi);       ​//​ -->  "3.141593" 
 ​        ​System​.​out​.​format(​"​%.3f%n​"​, pi);     ​//​ -->  "3.142" 
 ​        ​System​.​out​.​format(​"​%10.3f%n​"​, pi);   ​//​ -->  "     3.142" 
 ​        ​System​.​out​.​format(​"​%-10.3f%n​"​, pi);  ​//​ -->  "3.142      " 
 ​        ​System​.​out​.​format(​"​%+,-10.3f%n​"​, ​3463875.4543​);  ​//​ --> +3,463,875.454 
 ​        ​System​.​out​.​format(​Locale​.​US​, ​"​%-10.4f%n%n​"​, pi); ​//​ -->  "3,1416" 
 ​        ​Calendar​ c ​=​ ​Calendar​.​getInstance(); 
 ​        ​System​.​out​.​printf(​"​%tB %te, %tY%n​"​, c, c, c); ​//​ -->  "May 29, 2006" 
 ​        ​System​.​out​.​printf(​"​%tl:%tM %tp%n​"​, c, c, c);  ​//​ -->  "2:34 am" 
 ​        ​System​.​out​.​printf(​"​%tD%n​"​, c);    ​//​ -->  "05/29/06"
 ​    } 
 ​}