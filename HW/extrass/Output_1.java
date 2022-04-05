 
  
 ​import​ ​java.util.Calendar​; 
 ​import​ ​java.util.Locale​; 
  
 ​//​Use of printf to print colum wise statement 
​class​ ​Output_1 { 
 ​    ​public​ ​static​ ​void​ ​main​(​String​[] ​args​) { 
 ​        ​System​.​out​.​printf(​"​%s%s%s%s​\n​"​,​"​Name​"​,​"​Roll​"​,​"​Age​"​,​"​Class​"​); 
 ​        ​System​.​out​.​printf(​"​%s​\t​%s​\t​%s​\t​%s​\n\n​"​,​"​Name​"​,​"​Roll​"​,​"​Age​"​,​"​Class​"​); 
 ​        ​System​.​out​.​printf(​"​%20s%10s%10s%10s​\n\n​"​,​"​Name​"​,​"​Roll​"​,​"​Age​"​,​"​Class​"​); 
 ​        ​System​.​out​.​print(​"​============================================​\n​"​); 
 ​        ​System​.​out​.​printf(​"​%-20s%-10s%-10s%-10s%-10s%-10s​\n​"​,​"​Name​"​,​"​Roll​"​,​"​Age​"​,​"​Class​"​,​"​Fees​"​,​"​Fees Paid​"​); 
 ​        ​System​.​out​.​printf(​"​%-20s%-10d%-10d%-10d%-10.2f%9b​\n​"​,​"​Ravi Kumar​"​,​1​,​14​,​8​,​220.40​,​true​); 
 ​        ​System​.​out​.​printf(​"​%-20s%-10d%-10d%-10d%-10.2f%9b​\n​"​,​"​Ravi​"​,​10​,​14​,​8​,​2200.40​,​false​); 
 ​        ​System​.​out​.​printf(​"​%-20s%-10d%-10d%-10d%-10.2f%9b​\n​"​,​"​Ravi Kumar Singh​"​,​100​,​14​,​8​,​22000.40​,​true​); 
  
 ​        ​System​.​out​.​print(​"​============================================​\n​"​); 
 ​        ​System​.​out​.​printf(​"​%2$s-20s​\n​%1$-20s​\n​"​,​"​Ravi Kumar Singh​"​,​"​Hello World​"​); 
 ​        ​System​.​out​.​printf(​"​%f, %<+020.10f %n​"​, ​Math​.​PI​); 
 ​    } 
 ​}