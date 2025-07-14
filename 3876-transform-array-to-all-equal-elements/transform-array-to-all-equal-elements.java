class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        return canMakeAllEqual(nums.clone(), k, 1) || canMakeAllEqual(nums.clone(), k, -1);
    }

    private boolean canMakeAllEqual(int[] nums, int k, int target) {
        int operations = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != target) {
                // Flip nums[i] and nums[i+1]
                nums[i] *= -1;
                nums[i + 1] *= -1;
                operations++;
            }
        }

        // Check if all are equal to target
        for (int num : nums) {
            if (num != target) return false;
        }

        return operations <= k;
    }
}
