package string_2;

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */
public class CB15_catDog {
    public static void main(String[] args) {
        System.out.println(catDog("catdogdog"));
    }

    public static boolean catDog(String str) {
        return str.split("cat", -1).length == str.split("dog", -1).length;
    }
}
