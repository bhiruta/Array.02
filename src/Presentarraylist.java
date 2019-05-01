import java.util.ArrayList;

public class Presentarraylist {
    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<>(2);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list.contains("A")); // true

        System.out.println(list.contains("Z"));  //false

    }
}
