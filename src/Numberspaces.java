public class Numberspaces {

    public static void main(String[] args) {
        int count = 0, i;
        char str[] = new char[0];

        printf("enter the sentence");
        Stringcount.gets(str);
        int len = strlen(str);
        for (i = 0; i <= len; i++) {
            if (str[i] == 'i')
                count++;
        }
        printf("the number of words are :\t%d", count + 1);
        return;
    }

    private static void printf(String enter_the_sentence) {
    }

    private static void printf(String s, int i) {
    }

    private static int strlen(char[] str) {


        int i = 0;
        return i;
    }
}