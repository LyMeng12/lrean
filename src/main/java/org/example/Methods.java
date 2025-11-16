
package org.example;


import java.util.Scanner;

public class Methods {

    static void  printName(int a , int b){

        int sum = a+b;

        if(sum > 5){
            System.out.println("good");
        }
        if(sum<5 ){
            System.out.println("Fales");
        }



    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number A:");
        int a = in.nextInt();
        System.out.print("Enter Number B:");
        int b = in.nextInt();

        printName(a,b);
    }
    
}
