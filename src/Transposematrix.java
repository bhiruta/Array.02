public class Transposematrix {
    private static final int N = 4;
    private int[][] A;


    public static void main(String[] args) {
        //finds transpose of A [][] in place static void transpose(int A[][])

    }

    // This function stores transpose of A[][] in B[][]
    void transpose(int[][] A) {

        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }

        //Driver code
        int a[][] ={{1,1,1,1},{2,2,2,2},{3,3,3,3}};

        transpose(A);
        System.out.println("Modified matrix is \n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.println(A[i][j] + "");
            System.out.println("\n");
        }


    }


}




















