import java.util.Arrays;

public class Equalityarray{

    

    public static void main(String[]args){

        // Let us create different integers arrays
        int[] a1 = new int[]{1,2,3,4};
        int[] b2 = new int[]{1,2,3,4,};
        int[] c3 = new int[]{1,2,4,3};

        System.out.println("Is a1 equals to b2 :" + Arrays.equals(a1,b2));

        System.out.println("Is a1 equals to c3 :" + Arrays.equals(a1,c3));

    }
}

