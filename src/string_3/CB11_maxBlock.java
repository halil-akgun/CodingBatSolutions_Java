package string_3;

import java.util.Arrays;
import java.util.Comparator;

/*
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 */
public class CB11_maxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));
    }

    public static int maxBlock(String str) {
        StringBuilder temp = new StringBuilder();
        String prev = "";
        for (int i = 0; i < str.length(); i++) {
            if (prev.equals(String.valueOf(str.charAt(i)))) temp.append(str.charAt(i));
            else temp.append(" ").append(str.charAt(i));
            prev = String.valueOf(str.charAt(i));
        }
        String[] arr = temp.toString().split(" ");
        Arrays.sort(arr, Comparator.comparing(String::length));
        return arr[arr.length - 1].length();
    }
}
