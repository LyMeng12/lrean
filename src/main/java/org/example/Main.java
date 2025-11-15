package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String again;


        do {
            System.out.println("Welcome My game.");
            System.out.println("I have 2 game Need you choose.");
            System.out.println("1.Find My Number.");
            System.out.println("2.Find My Name.");
            System.out.println("=============================");
//            boolean pp ;
            System.out.print("Choose:");
            int play = in.nextInt();
            while (play<1 || play>2){
                System.out.print("Choose again!:");
                play = in.nextInt();

            }

            switch (play)
            {
                case 1: game1();break;
                case 2: game2();break;
                default:break;
            }

            System.out.print("Play again ?(y/n):");
            again = in.next().toLowerCase();
            while (!again.equals("y") && !again.equals("n")){
                System.out.print("Play again ?(y/n):");
                again = in.nextLine().toLowerCase();
            }
        }while (again.equals("y"));
        System.out.println("End Game!");

    }
    public static void game1(){
        Scanner in = new Scanner(System.in);
        System.out.println("This is game 1.");
        System.out.println("1 - 10 i have 1 number");
        System.out.println("i need you find this u have 2 point.");
        int random = (int)(Math.random()*10)+1;
        int num;
        System.out.println(random);
        for(int i = 1; i < 3 ;i++){
            System.out.println("You have "+(3-i));
            System.out.print("Choose Number:");
            num = in.nextInt();
            if(num > random){
                System.out.println("This bigger!");
            }
            if(num < random){
                System.out.println("This Smaller!");
            }
            if(i==2){
                System.out.println("You are Lose!");
                break;
            }

            if(num == random){
                System.out.println("You are Wind!");
                break;
            }
        }
    }
    public static void game2(){
        System.out.println("hello game2");
    }
}