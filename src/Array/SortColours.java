package Array;

public class SortColours {class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = 0, k = 0;

        while (k < nums.length) {
            int val = nums[k];
            nums[k] = 2;
            k++;

            if (val < 2) {
                nums[j] = 1;
                j++;
            }

            if (val == 0) {
                nums[i] = 0;
                i++;
            }
        }
    }
}
}
