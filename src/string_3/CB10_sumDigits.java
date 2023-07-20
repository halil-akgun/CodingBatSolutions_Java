package string_3;

import java.util.Arrays;

/*
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars
'0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
 */
public class CB10_sumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits("Chocolate"));
    }

    public static int sumDigits(String str) {
        String[] arr = str.replaceAll("[^0-9]", "").split("");
        if (arr[0].equals("")) return 0;
        return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
    }
}
