package org.example;

public class Oop {
    public static void main(String[] args) {
        //        ---1
//        int[][] a = new int[2][2];
//        int sum =0;
//
//        for(int i= 0; i<=2 ; i++){
//            for(int j=0; j<=2 ; j++){
//                sum+=1;
//                System.out.print((sum+"\t"));
//            }
//            System.out.println();
//        }

//        --2
//        int[][] arr = {
//                {2, 3, 4},
//                {5, 6, 7},
//                {8, 9, 10}
//        };
//        int x= 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//                x += arr[i][j];
//            }
//        }
//        System.out.println((x));

//
//        int sum =0;
//        for(int i = 0 ; i<arr.length;i++){
//            for (int j = 0 ; j< arr[i].length;j++){
////                System.out.println(arr[i].length-1);
//                System.out.print(arr[i][j]);
//                sum += arr[i][j];
//                if(j==arr[i].length-1){
//                    System.out.print(" = ");
//                }else {
//                    System.out.print(" + ");
//                }
//
//
//            }
//            System.out.print((sum));
//            System.out.println();
//        }
        int[][] a = {{2, 3, 4},{5, 6, 7},{8, 9, 10}};

        System.out.println("Welcome to the ArrayMulti program");
//        for(int i=0;i<3; i++){
//            for(int j=0 ;j<3; j++){
//                System.out.print("Enter A:");
//                a[i][j] = cin.nextInt();
//            }
//        }
        System.out.println("==============================");
        int bigRow=0;
        for(int i=0;i<3;i++){
            int big=a[i][0];
            for(int j=0 ;j<3; j++){
                if(big<a[i][j]){
                    big= a[i][j];
                }
            }
            if(big>bigRow){
                bigRow=big;
                System.out.println(bigRow);
            }

        }
        System.out.println((bigRow));
    }
}
