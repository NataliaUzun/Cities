package Recursion2;

public class groupSumClump {
    public static void main(String[] args) {}
        public boolean groupSumClump(int start, int[] nums, int target) {
            altArray(nums);
            if (start >= nums.length)
                return target == 0;
            if (groupSumClump(start+1, nums, target-nums[start]))
                return true;
            return groupSumClump(start + 1, nums, target);
        }
        private void altArray(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i-1]) {
                    nums[i-1] += nums[i];
                    if (i+1 < nums.length && nums[i] != nums[i+1])
                        nums[i] = 0;
                    else if (i == nums.length-1)
                        nums[i] = 0;
                }
            }
        }
    }

