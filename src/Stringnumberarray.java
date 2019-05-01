import java.util.Arrays;
import java.lang.reflect.Array;

public class Stringnumberarray {




        public static void main(String[]args){
            // a1= int Valuee
            int[] a1 = {10, 14, 36, 27, 43, 18};
            // String values
            String[] a2 = {"a", "b","c","d","e","f"};
            System.out.println("numeric array :" + Arrays.toString(a1));

            //a1 method
            Arrays.sort(a1);
            System.out.println("Sort numeric array:" + Arrays.toString(a1));
            //a2 String method
            System.out.println("String arrays:" + Arrays.toString(a2));
            Arrays.sort(a2);

            System.out.println("Sort arrays:" + Arrays.toString(a2));






        }
    }


