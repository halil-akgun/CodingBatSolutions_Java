package String_2;

/*
A sandwich is two pieces of bread with something in between. Return the string that is between the first and
last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 */
public class CB19_getSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
    }

    public static String getSandwich(String str) {
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");
        if (firstBread != lastBread) return str.substring(firstBread + 5, lastBread);
        else return "";
    }
}
