public class Stringcount {

    public static void main(String[] args) {
        char str[] = new char[0];
        int i, totalwords;
        totalwords = 1;
        printf("\n please enter any string :");
        Object gets;
        gets(str);

        for (i = 0; str[i] != '\0'; i++) {
            if (str[i] == '\n') {
                if (str[i] != '\t') {
                    continue;
                }
            } else if (str[i] == 'a') {
                if (str[i] != '\t') {
                    continue;
                }
            }
            totalwords++;


        }
        printf("\n the total number of words in this string %s = %d,str,totalwords");
        return;
    }

    public static void gets(char[] str) {
    }

    private static void printf(String s) {
    }
}