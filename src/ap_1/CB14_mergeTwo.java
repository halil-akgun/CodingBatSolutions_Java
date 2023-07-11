package ap_1;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
Start with two arrays of strings, A and B, each with its elements in alphabetical order and
without duplicates. Return a new array containing the first N elements from the two arrays.
The result array should be in alphabetical order and without duplicates. A and B will both have
a length which is N or more. The best "linear" solution makes a single pass over A and B, taking
advantage of the fact that they are in alphabetical order, copying elements directly to the new array.

mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
 */
public class CB14_mergeTwo {
    public static void main(String[] args) {
        String[] arr1 = {"a", "c", "z"};
        String[] arr2 = {"b", "f", "z"};
        System.out.println(Arrays.toString(mergeTwo(arr1, arr2, 3)));
    }

    public static String[] mergeTwo(String[] a, String[] b, int n) {
//        TreeSet<String> allChars = new TreeSet<>(Arrays.stream(a).toList());
//        allChars.addAll(Arrays.stream(b).toList());
//        String[] ans = new String[n];
//        for (int i = 0; i < n; i++)
//            ans[i] = allChars.pollFirst();
//        return ans;

//        for primitive codingbat: (not accepting toList)
        TreeSet<String> allChars = Arrays.stream(a).collect(Collectors.toCollection(TreeSet::new));
        allChars.addAll(Arrays.stream(b).collect(Collectors.toSet()));
        String[] ans = new String[n];
        for (int i = 0; i < n; i++)
            ans[i] = allChars.pollFirst();
        return ans;
    }
}
