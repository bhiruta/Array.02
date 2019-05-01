
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist<ArrayTest> {


    public ArrayTest Size;

    public static void main(String[] args) {
        List<String> L1 = new ArrayList<>();
        L1.add("1");
        L1.add("2");

        List<String> L2 = new ArrayList<>();
        L2.add("3");
        L2.add("4");
        L2.add("5");

        List<String>[] arrayofList = new List[2];
        arrayofList[0] = L1;
        arrayofList[1] = L2;

        for (int i = 0; i < arrayofList.length; i++) {
            List<String> l = arrayofList[i];
            System.out.println(l);
        }


    }

    public void add(Object objects) {
    }

    public void Size() {

        return;







    }


    }


    }