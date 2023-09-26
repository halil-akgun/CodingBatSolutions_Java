package recursion_2;

/*
Given an array of ints, is it possible to divide the ints into two groups, so that
the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int
must be in one group or the other. Write a recursive helper method that takes whatever arguments
you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)

splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true
 */
public class CB03_splitOdd10 {
    public static void main(String[] args) {
        System.out.println(splitOdd10(new int[]{2, 5, 10, 4}));
    }

    public static boolean splitOdd10(int[] nums) {
        return helperMethod(nums, 0, 0, 0);
    }

    public static boolean helperMethod(int[] nums, int index, int sum1, int sum2) { // chatGPT:
        // Temel durum: Tüm elemanlar işlendiğinde kontrol edilir.
        if (index == nums.length) {
            // Bir grup toplamı 10'un katı ve diğer grup toplamı tek sayı ise true döndürülür.
            return (sum1 % 10 == 0 && sum2 % 2 != 0) || (sum2 % 10 == 0 && sum1 % 2 != 0);
        }

        // Şu anki elemanı ilk gruba ekleyerek devam et.
        if (helperMethod(nums, index + 1, sum1 + nums[index], sum2)) {
            return true;
        }

        // Şu anki elemanı ikinci gruba ekleyerek devam et.
        if (helperMethod(nums, index + 1, sum1, sum2 + nums[index])) {
            return true;
        }

        // Şu anki elemanı her iki gruba da eklemezsen false döndür.
        return false;
    }
}
