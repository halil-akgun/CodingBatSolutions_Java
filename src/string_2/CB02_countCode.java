package string_2;

/*

Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter
for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */
public class CB02_countCode {
    public static void main(String[] args) {
        System.out.println(countCode("codexxcode"));
    }

    public static int countCode(String str) {
        str = str.toLowerCase().replaceAll("[^coe]", "d");
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("code", i)) count++;
        }
        return count;
    }
}
