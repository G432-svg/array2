import java.util.Arrays;

public class BubbleSortExamples {


    public static void main(String[] args)
    {
        // This is unsorted array
        Integer[] array = new Integer[] {15,9,47,18,380,540,1956 };

        // Let's sort using bubble sort
        bubbleSort(array, 0, array.length);

        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }

 
    public static void bubbleSort(Object[] array, int fromIndex, int toIndex)
    {
        Object d;
        for (int i = toIndex - 1; i > fromIndex; i--)
        {
            boolean isSorted = true;
            for (int j = fromIndex; j < i; j++)
            {
                //If elements in wrong order then swap them
                if (((Comparable) array[j]).compareTo(array[j + 1]) > 0)
                {
                    isSorted = false;
                    d = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = d;
                }
            }
            //If no swapping then array is already sorted
            if (isSorted)
                break;
        }
    }
}

