package be.intecbrussel;


    import java.util.*;

    public class Dictionary_Demo {
        public static void main(String[] args)
        {

            // Creating an empty Dictionary
            Dictionary<Integer, String> dict
                    = new Hashtable<Integer, String>();

            // Inserting elements into the Dictionary
            dict.put(10, "Geeks");
            dict.put(15, "4");
            dict.put(20, "Geeks");
            dict.put(25, "Welcomes");
            dict.put(30, "You");

            // Displaying the Dictionary
            System.out.println("The Dictionary is: " + dict);

            // Creating an empty enumeration to store
            Enumeration enu = dict.elements();

            System.out.println("The enumeration of values are:");

            // Displaying the Enumeration
            while (enu.hasMoreElements()) {
                System.out.println(enu.nextElement());
            }
        }
    }


