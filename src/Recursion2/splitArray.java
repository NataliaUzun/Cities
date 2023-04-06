package Recursion2;

public class splitArray {
    public static void main(String[] args) {}
        public boolean splitArray(int[] nums) {
            if(nums.length == 1)
                return false;
            if(nums.length == 0)
                return true;
            int total = totalSum(nums , nums.length);
            if(total % 2 == 0)
            {
                if(groupSum(0, nums.length, nums, total/2))
                    return true;
            }
            return false;

        }
        public int totalSum(int [] nums, int n)
        {
            if (n == 1)
                return nums[0];
            else
                return totalSum(nums, n-1) + nums[n-1];
        }
        public boolean groupSum(int start, int end, int[] nums, int target) {
            if (start >= end)
                return target == 0;
            if (groupSum(start + 1, end, nums, target - nums[start])) return true;
            if (groupSum(start + 1, end, nums, target)) return true;
            return false;}
    }

