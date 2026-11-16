
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // Case 1: use houses from 0 to n - 2
        int[] memo1 = new int[n];
        Arrays.fill(memo1, -1);
        int case1 = robMemo(nums, 0, n - 2, memo1);

        // Case 2: use houses from 1 to n - 1
        int[] memo2 = new int[n];
        Arrays.fill(memo2, -1);
        int case2 = robMemo(nums, 1, n - 1, memo2);

        return Math.max(case1, case2);
    }

    private int robMemo(int[] nums, int index, int end, int[] memo) {
        if (index > end) {
            return 0;
        }

        if (memo[index] != -1) {
            return memo[index];
        }

        int robCurrent = nums[index] + robMemo(nums, index + 2, end, memo);
        int skipCurrent = robMemo(nums, index + 1, end, memo);

        memo[index] = Math.max(robCurrent, skipCurrent);

        return memo[index];
    }
}