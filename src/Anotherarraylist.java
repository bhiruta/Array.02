import java.util.ArrayList;

public class Anotherarraylist {
    public static void main(String[]args){
        ArrayList<String> arr = new ArrayList<String>();
        // Adding items

        arr.add("Hello");
        arr.add("name is Het");
        arr.add(1,"My");

        //Removing items

        arr.remove("My");
        arr.remove(1);

        //print the Arraylist
        System.out.println(arr);
    }
}
