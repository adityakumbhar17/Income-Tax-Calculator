import java.math.BigInteger;
import java.util.Scanner;
public class incometaxcal {
    public static double monyTrackingSystem(int ms,int rr,int mf,int oe){
        //frt calculate the monthly expan
        double monthlyexpan = rr+mf+oe;
        System.out.println("SIR YOUR MONTHLY EXPENDITURE IS="+" "+ monthlyexpan);
        //show the saving amount from the employs salary
        double saving = ms-monthlyexpan;
        System.out.println("SIR YOUR MONTHLY SAVING IS="+" "+ saving);
        double ctc = ms+5000;//50000 is the benefits give to the employ from the company
        System.out.println("SIR YOUR COST TO COMPANY IS="+" "+ctc);
        double annual = ms*12;
        System.out.println("SIR YOUR ANNUAL INCOME IS="+" "+annual);
        if(annual<250000){
            System.out.println("SIR YOU DONT NEED TO TO PAY INCOME TAX YOUR INCOME IS IN BETWEEN THE 0 TO 2.5 LAKH");
        }else if( annual>=250000 && annual<500000){
            double tax =250000*0.05;
            System.out.println("SIR YOUR INCOME IS IN BETWEEN THE 2.5 LAKH TO 5 LAKH SO YOU PAY THE TAX = "+" "+tax);
        }else if(annual>=500000 && annual<1000000){
            double tax2 =500000*0.2;
            System.out.println("SIR YOUR INCOME IS IN BETWEEN 5 LAKH TO 10 LAKH SO YOU NEED TO PAY THE  TAX = "+" "+ tax2);

        }else if( annual>= 1000000){
            double tax3 = annual-1000000;
            double tax4 = tax3*0.3;
            double tax5 = tax4 +12500+100000;
            //add the 4% of the health and educaion  cesss
            double tax6 = tax5*0.04;
            double tax7 =tax5 + tax6;
            System.out.println("SIR YOUR INCOME IS ABOVE THE 10 LAKH SO YOUR TAX IS="+tax7);
        }else{
            System.out.println(" you need to enter the appropriate amount so we can calulate");
        }
        return 0;
    }
    public static void main(String[] args) {
        //get the information from the user  his finantial information
        Scanner sc = new Scanner(System.in);
        System.out.println("SIR, PLZ ENTER YOUR MONTHLY SALARY");
        int ms=sc.nextInt();
        System.out.println("SIR PLZ ENTER YOUR ROOM RENT/MONTH");
        int rr = sc.nextInt();
        System.out.println("SIR ,PLZ ENTER YOUR MESS FEES/MONTH");
        int mf = sc.nextInt();
        System.out.println("SIR,PLZ ENTER OTHER EXPANCES/MONTH");
        int oe = sc.nextInt();
        monyTrackingSystem( ms, rr, mf, oe);
    }
    
}
