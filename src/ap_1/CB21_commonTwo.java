package ap_1;

/*
Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
Return the count of the number of strings which appear in both arrays. The best "linear" solution
makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
 */
public class CB21_commonTwo {
    public static void main(String[] args) {
        String[] arr1 = {"a", "c", "x"};
        String[] arr2 = {"b", "c", "d", "x"};
        System.out.println(commonTwo(arr1, arr2));
    }

    public static int commonTwo(String[] a, String[] b) {
        int count = 0;
        char temp = '*';
        int idxA = 0;
        int idxB = 0;
        while (idxA < a.length && idxB < b.length) {
            if (a[idxA].charAt(0) == b[idxB].charAt(0)) {
                if (temp != a[idxA].charAt(0)) count++;
                temp = a[idxA].charAt(0);
                idxA++;
                idxB++;
            } else if (a[idxA].charAt(0) < b[idxB].charAt(0)) idxA++;
            else if (a[idxA].charAt(0) > b[idxB].charAt(0)) idxB++;
        }
        return count;
    }
}
