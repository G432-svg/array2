import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
    public class IntArrayTools {
    /**
     *
     * Collections.sort() example to sort List of Strings.
     *
     *
     */
    public static class CollectionSortIntegersExample {

        public static void main(String[] args) {

            List<Integer> primeNumbers = new ArrayList<>();

            primeNumbers.add(19);
            primeNumbers.add(7);
            primeNumbers.add(37);
            primeNumbers.add(59);
            primeNumbers.add(23);

            System.out.println("List of integer prime numbers before sorting : ");

            Iterator<Integer> it = primeNumbers.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }
            Collections.sort(primeNumbers);

            System.out.println("List of integer prime numbers after sorting :");

            it = primeNumbers.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }

        }

    }

    public static boolean isSorted(Comparable[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0)
                return false;
        }
        return true;

    }

}