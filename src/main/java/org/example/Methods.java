
package org.example;


import java.util.Scanner;

public class Methods {

    static double interestYEAR(double money){

        return (money * 10)/100;
    }


    static void Moth(double money){
        Scanner in = new Scanner(System.in);

        double moth;
        System.out.print("How many moth:");
        moth = in.nextDouble();

        double Interest;
        double time;

        double amount;
        Interest =(money * 15)/100;
        amount = Interest+money;
        time = amount / moth;
        System.out.println("=========================================");
        System.out.println("times interest money/1moth:"+Math.round(time) +"$");
        System.out.println("Total Interest:" + Interest + "$" );
        System.out.println("Tota Amount: "+amount + "$");


    }
    static void year( double money , String yorm ){
        Scanner in = new Scanner(System.in);
        double moth;
        if(yorm.equals("year")){

        }else if(yorm.equals("moth")){
            System.out.print("How many year:");
            double timemoth = in.nextDouble();
            moth = timemoth * 12;
            double Interest;
            double time;

            double amount;
            Interest =(money * 15)/100;
            amount = Interest+money;
            time = amount / moth;
            System.out.println("=========================================");
            System.out.println("times interest money/1moth:"+Math.round(time) +"$");
            System.out.println("Total Interest:" + Interest + "$" );
            System.out.println("Tota Amount: "+amount + "$");


        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);




        System.out.println("Welcome My ABA Bank.");
        System.out.println("========Interest========");
        System.out.print("Money you need:$");
        double money = in.nextDouble();
        System.out.println("year Interest rate(10%)");
        System.out.println("you payment moth Interest rate(15%)");
        System.out.println("moth Interest rate(15%)");
        System.out.print("Time(Moth or Years):");
        String time = in.next().toLowerCase();
        while (!time.equals("moth") && !time.equals("year")){
            System.out.print("Choose again Time(Moth or Years):");
            time = in.next().toLowerCase();
        }
        if (time.equals("moth")){
            Moth(money);
        }else if(time.equals("year")){
            System.out.print("Payment many year or moth:");
            String yorm = in.next().toLowerCase();
            year(money,yorm);
        }


    }
    
}
