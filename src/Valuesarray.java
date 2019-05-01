public class Valuesarray {

    private static String s;

    public static void main(String[] args) {

        String getInput;

        String S1 = getInput("Enter value 1:");
        String S2 = getInput("Enter value 2:");
        String S3 = getInput("Enter value 3 :");

        double result = addvalues("S1","S2");
        System.out.println("The answer is:" + result);

        double result2 = addvalues("S1", "S2", "S3");
        System.out.println("The answer is:" + result2);


    }

    private static double addvalues(String s1, String s2) {return 0;}


    private static double addvalues(String s1, String s2, String s3) {
        return 0;
    }
    
    private static String getInput(String s) {
        Valuesarray.s = s;
        return s;
    }
}
