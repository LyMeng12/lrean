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
            System.out.println("2.Play card whit me.");
            System.out.println("=============================");
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
        System.out.println("(1 - 10) I have 1 number");
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
        Scanner in = new Scanner(System.in);
        System.out.println("This is game 2.");
        System.out.println("You Play card whit me.");
        System.out.println("full Point 22 u have 2 and 3 card.");
        System.out.println("if your point 20 me 22 me win.");
        System.out.print("You can start new(Y/N):");
        String play = in.next().toLowerCase();
        while (play.equals("y")){
            System.out.println("Admin:");
            int card1admin = (int)(Math.random() * 10) + 1;
            int card2admin = (int)(Math.random() * 10) + 1;
            System.out.println(card1admin + " + " + card2admin + " = " + (card1admin + card2admin));




            System.out.println("Me:");
            int card1user = (int)(Math.random() * 10) + 1;
            int card2user = (int)(Math.random() * 10) + 1;
            System.out.println(card1user + " + " + card2user + " = " + (card1user + card2user));
            System.out.print("You need 1 more?:");
            String user = in.next().toLowerCase();
            if(user.equals("y")){
                System.out.println("Admin:");
                int adminsum = card1admin + card2admin;
                System.out.println(card1admin + " + " + card2admin + " = " + adminsum);




                System.out.println("Me:");

                int card3user = (int)(Math.random() * 10) + 1;
                int usersum = card1user + card2user + card3user;
                System.out.println(card1user + " + " + card2user + " + " + card3user + " = " + usersum);

            }
            if()
            System.out.print("Play card again !(y/n):");
            play = in.next().toLowerCase();
            if (play.equals("y")){
                play = "y";
            }else if (play.equals("n")){
                play = "n";
            }
        }

    }
}