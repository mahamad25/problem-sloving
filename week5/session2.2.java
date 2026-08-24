class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0];
        int currMax = 0;
        int minSum = nums[0];
        int currMin = 0;

        for (int num : nums) {
            // Kadane for max subarray
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);

            // Kadane for min subarray
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);

            totalSum += num;
        }

        // If all numbers are negative, totalSum == minSum, so totalSum - minSum = 0 (empty array)
        // In that case we must return maxSum
        if (maxSum < 0) {
            return maxSum;
        }

        // Max of normal max and circular max
        return Math.max(maxSum, totalSum - minSum);
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1,-2,3,-2};
        System.out.println(sol.maxSubarraySumCircular(nums1)); // 3

        int[] nums2 = {5,-3,5};
        System.out.println(sol.maxSubarraySumCircular(nums2)); // 10 -> [5,5]

        int[] nums3 = {-3,-2,-3};
        System.out.println(sol.maxSubarraySumCircular(nums3)); // -2
    }
}
output
  3
