import java.util.Scanner;

public class Insertelementarray {




    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int Size, i, Sum =0;
        sc = new Scanner(System.in);

        System.out.println("Please enter number of elements in an array :");
        Size = sc.nextInt();

        int[] a = new int[Size];
        System.out.println("Please enter + Size + elements of an array :");
        for (i =0; i<Size; i++) {
            a[i] = sc.nextInt();
        }
        for (i =0; i<Size; i++) {
            Sum = Sum + a[i];
        }
        System.out.println("\n the sum of all elements in this array =" + Sum);
    }
}

