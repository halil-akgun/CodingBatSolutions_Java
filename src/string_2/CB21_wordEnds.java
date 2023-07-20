package string_2;

/*
Given a string and a non-empty word string, return a string made of each char just before and
just after every appearance of the word in the string. Ignore cases where there is no char before or
after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */
public class CB21_wordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("XY1XY", "XY"));
    }

    public static String wordEnds(String str, String word) {

        // way1:
        int slen = str.length();
        int wlen = word.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < slen - wlen + 1; i++) {
            String tmp = str.substring(i, i + wlen);
            if (i > 0 && tmp.equals(word))
                result.append(str.charAt(i - 1));
            if (i < slen - wlen && tmp.equals(word))
                result.append(str, i + wlen, i + wlen + 1);
        }
        return result.toString();


        // way2:
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            if (i == str.length() - word.length() + 1) break;
//            if (str.substring(i, i + word.length()).equalsIgnoreCase(word)) {
//                result.append(getLetter(str, i - 1));
//                result.append(getLetter(str, i + word.length()));
//            }
//        }
//        return result.toString();
    }

//    static String getLetter(String a, int i) {
//        try {
//            return String.valueOf(a.charAt(i));
//        } catch (Exception e) {
//            return "";
//        }
//    }
}
