package be.intecbrussel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

    public class Sort {

    /**
     *
     * Collections.sort() example to sort List of Strngs.
     *
     * @author JavaProgramTo.com
     *
     */
    public static class CollectionSortExample {

        public static void main(String[] args) {

            List<String> countries = new ArrayList<>();

            countries.add("Singapore");
            countries.add("India");
            countries.add("USA");
            countries.add("UK");
            countries.add("Australia");

            System.out.println("List of countires before sorting : ");

            Iterator<String> it = countries.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }
            Collections.sort(countries);

            System.out.println("List of countries after sorting :");

            it = countries.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }

        }

    }

}
