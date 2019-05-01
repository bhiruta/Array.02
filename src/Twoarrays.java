import java.util.Arrays;
import java.util.HashSet;


import java.util.Arrays;
        import java.util.HashSet;
        import java.util.Set;

public class Twoarrays {
    public static void main(String[]args){
        String[] array1 = {"python","JAVA","PHP","C#","C++","SQL"};

        String[] array2 = {"MySQL","SQL","SQlite","Oracle","PostgreSQL","DB2","JAVA"};

        System.out.println("Array1 :" + Arrays.toString(array1));
        System.out.println("Array2 :" +Arrays.toString(array2));

        HashSet<String>Set = new HashSet<String>();

        for (int i =0; i < array1.length; i++){

            for (int j =0; j < array2.length; j++){
                if (array1[i].equals(array2[j])) {
                    Set.add(array1[i]);
                }
                System.out.println("Common element:" +(Set));
            }
        }
    }

}



