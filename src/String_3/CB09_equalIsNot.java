package String_3;

/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number
of appearances of "not" anywhere in the string (case-sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 */
public class CB09_equalIsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));
    }

    public static boolean equalIsNot(String str) {
        int amountOfIs = 0;
        int amountOfNot = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("is")) amountOfIs++;
            if (str.substring(i).startsWith("not")) amountOfNot++;
        }
        return amountOfIs == amountOfNot;
    }
}
