public class ArrayApp {


   public static void main(String[] args) {

        //declare the variable with name: numberArray
        //it is of the type int[], this is an array of ints
       int[] numberArray;
       //test pearl

        // create a new object of the type int[]
        // it has a length of 5
        // numberArray will point towards this new object

        numberArray = new int[5];

        //set the values of the array elements
        // index is always the number between the []
        // the value is what we assign by using the =
        numberArray[0] = 8;
        numberArray[1] = 13;
        numberArray[2] = 100;
        numberArray[3] = 0;
        numberArray[4] = 5;

        //print out the values of our array
        System.out.println("the first value of our array is: " + numberArray[0]);
        System.out.println("the second value of our array is: " + numberArray[1]);
        System.out.println("the third value of our array is: " + numberArray[2]);
        System.out.println("the fourth value of our array is: " + numberArray[3]);
        System.out.println("the fifth value of our array is: " + numberArray[4]);
    }

   public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }


    }
}