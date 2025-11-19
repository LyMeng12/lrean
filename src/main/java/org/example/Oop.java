package org.example;

public class Oop {
    int x;

    public Oop(){
        for (int i =0; i<10; i++){
            System.out.print(x + " |");
            x++;
        }
    }
//    public void man(){
//        System.out.println("Hello World");
//    }
//    public  void woman(int x){
//        System.out.println("Woman"+x);
//    }
    public static void main(String[] args) {
        Oop oop = new Oop();
        for(int i=1 ;i < 10; i++){
            System.out.print(oop.x+" ");
            oop.x++;
        }


//        Oop oop = new Oop();
//        oop.man();
//        oop.woman(5);
    }
}
