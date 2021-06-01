package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class Gokken {
    public static void main(String[] args) {
        System.out.println("Enter the number of the lines in the array: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter the number of the columns in the array: ");
        int n = sc.nextInt();


        // declares the array
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(String.format("Enter a[%d][%d] : ", i, j));
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println(a[i][j] + "\t");
            }
            System.out.println();
        }
        //scanner close
        sc.close();
    }
}
//        //fill the array with random numbers between0 and 9 (9 included
//    public static void fillArray(int[] array){
//            Random randomGenerator = new Random();
//
//            for (int i = 0; 1 < array.length; i++){
//                array[i] = randomGenerator.nextInt(10);
//                System.out.println(array[i]);
//            }
//    }
//    public static int average(int ...values){
//     int[] values = {0,1,2,3,4,5,6,7,8,9,};
//
//    }
//    System.out.println(average(3, 8, 6, 9, 4, 7));
//
//       public static int min(int ...values)
//           public static int max(int ...values)
//    public static int average(int... values) {
//        int total = 0;
//        for (int el : values) {
//            total += el;
//       }
//       int avg = 0;
//        if (values.length != 0) {
//            avg = total / values.length;
//        }
//       return avg;
//   }
//
//    public static void main(String[] args) {
//        System.out.println(average(4, 7, 9));
//       System.out.println(average(7, 9, 2, 3, 5));
//        System.out.println(average(3, 8, 6, 9, 4, 7));
//       System.out.println(average());
//        int[] values = {3, 8, 6, 9, 4, 7};
//        System.out.println(average(values));
//
//    }
//    public static int average ( int value1, int value2){
//        return (value1 + value2) / 2;
//}
