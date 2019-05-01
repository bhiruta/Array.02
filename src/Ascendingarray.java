public class Ascendingarray {
    public static void main(String[] args) {

        int main[];
        int arr[] = new int[0];
        int Size = 0;
        int i, j, temp;
        /* input size of array */
        printf("enter size of array :");
        scanf("%d", Size);

        /*input elements in array */
        printf("enter size of array :");
        scanf("%d", Size);

        /* input elements in array */
        printf("enter elements in array :");
        for (i = 0; i < Size; i++) {
            scanf("%d", arr[i]);
        }
        for (i = 0; i < Size; i++) {
            for (j = i + 1; j < Size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        printf("\n elements of array in ascending order :");
        for (i = 0; i < Size; i++) {
            printf("%d\t", arr[i]);
        }
        return;

    }

    private static void printf(String s, int i) {
    }


    private static void scanf(String s, int i) {
    }

    private static void printf(String s) {
    }}