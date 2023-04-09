package String_2;

/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of
chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */
public class CB12_xyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
    }

    public static boolean xyzMiddle(String str) {
        int indexOfXYZ = str.toLowerCase().indexOf("xyz");
        return Math.abs(indexOfXYZ - (str.length() - (indexOfXYZ + 3))) < 2;
    }
}
