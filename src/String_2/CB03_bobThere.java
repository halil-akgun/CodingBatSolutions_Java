package String_2;

/*
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
 */
public class CB03_bobThere {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));
    }

    public static boolean bobThere(String str) {
        return str.matches(".*b.b.*");
    }
}