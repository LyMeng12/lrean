
package org.example;


import java.util.Scanner;

public class Methods {
    static void Moth(double money){
        Scanner in = new Scanner(System.in);
        double time ;
        double Interest;
        double amount;
        double moth;
        System.out.print("How many moth:");
        moth = in.nextInt();


        Interest = (money * 15)/100;
        amount = Interest+money;
        time = amount / moth;
        System.out.println("=========================================");
        System.out.println("times interest money/1moth:"+Math.round(time) +"$");
        System.out.println("Total Interest:" + Interest + "$" );
        System.out.println("Tota Amount: "+amount + "$");
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pay;
        int year;



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
            System.out.print("How many year:");
            year = in.nextInt();

            System.out.print("Payment (moth or year):");
            pay = in.next();
        }


    }
    
}
