package be.intecbrussel;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.String;

    public class CharArrayTools {

    public static class filterAlphabet {
        public static void main(String[] args) {
            List list = Arrays.asList("Mick ", "David", "Tony", "Jacob", "Sam",
                    "Billy", "Gaby", "Jonas");
            System.out.println("List with elements...");
            for (Object res : list) {
                System.out.print(res+" ");
            }
//            Stream stream;
//            stream = list.stream().filter(name -> name.startsWith("J"));
//            System.out.println("\nGetting strings beginning with letter J = "+stream.collect(Collectors.toList()));
        }
}
//    public class JavaSortExample {
//            public static void main(String[] args)
//            {
//                //Unsorted arrayList
//                List[] list = new List[] {"Mick ", "David", "Tony", "Jacob", "Sam",
//                        "Billy", "Gaby", "Jonas" };
//
//                //Sort the arrayLIst
//                Arrays.sort(List[]);
//
//                //Print array in alphabetically order
//                System.out.println(Arrays.toString(List[]));
//            }
//        }
}