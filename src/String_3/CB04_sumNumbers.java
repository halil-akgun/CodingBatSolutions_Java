package String_3;

/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
 */
public class CB04_sumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));
    }

    public static int sumNumbers(String str) {
        String[] arr = str.replaceAll("[^0-9]+", " ").trim().split("\\s+");
        int sum = 0;
        for (String w : arr) {
            if (w.length() == 0) continue;
            if (!Character.isDigit(w.charAt(0))) continue;
            sum += Integer.parseInt(w);
        }
        return sum;
    }
}
