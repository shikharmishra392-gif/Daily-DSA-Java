import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int resultIndex = 0;


        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // 1. Remove indices that are out of the current window bound
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // 2. Remove elements from back that are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // 3. Add current element's index to the back of the deque
            deque.offerLast(i);

            // 4. The first element in deque is the largest for the current window
            // Only start adding to results once we have completed the first window
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Window Size: " + k);

        int[] output = maxSlidingWindow(nums, k);
        System.out.println("Sliding Window Maximums: " + Arrays.toString(output));
    }
}
