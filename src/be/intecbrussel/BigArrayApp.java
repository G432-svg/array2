package be.intecbrussel;

import java.util.Random;

public class BigArrayApp {

    public static void main(String[] args) {

        int[] bigArray = new int[10000];

        bigArray[9999] =8;

        System.out.println(bigArray[1]);

    }
    //fill the array with random numbers between0 and 9 (9 included)
   public static void fillArray(int[] array ){
        Random randomGenerator = new Random();

        for (int i = 0; 1 < array.length; i++){
            array[i] = randomGenerator.nextInt(10);
            System.out.println(array[i]);
        }




    }

//    public static void printArray(int[] array){
//
//        for (int i = 0; i< array.length; i++){
//
//            System.out.println(array[i]);
//
//        }
//
//    }

}

