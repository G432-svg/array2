package be.intecbrussel;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class DEmolotto<Int> {

    //fill the array with random numbers between 1 and 45(45 included)
    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};


    public static void fillArray(int[] array) {
        Random randomGenerator = new Random();

        for (int i = 0; 1 < array.length; i++) {
            array[i] = randomGenerator.nextInt(45);
            System.out.println(array[i]);
        }
    }

    public class RandomGenerator {


        public void main(String[] args) {

                int min = 1;
                int max = 45;

                Random random = new Random();

                int[] numbers = new Random().ints(min, max + 1).limit(6).toArray();
                System.out.println(Arrays.toString(numbers));
        }
    }
    }
