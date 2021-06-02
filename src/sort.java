import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        //Unsorted array
        Integer[] numbers = new Integer[] {15,9,47,18,380,540,1956};

        //Sort the array
        Arrays.sort(numbers);

        //Print array to confirm
        System.out.println(Arrays.toString(numbers));


            //Sort the array in reverse order
        Arrays.sort(numbers, Collections.reverseOrder());

        //Print array to confirm
        System.out.println(Arrays.toString(numbers));

        //Unsorted list
        numbers = new Integer[]{15, 9, 47, 18, 380, 540, 1956};
        List<Integer> numbersList = Arrays.asList(numbers);

        //Sort the list
        Collections.sort(numbersList);

        //Print list to confirm
        System.out.println(numbersList);

        //Sort the list
        Collections.sort(numbersList, Collections.reverseOrder());

        //Print list to confirm
        System.out.println(numbersList);


    }

}
