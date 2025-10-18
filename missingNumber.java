class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
    int sum2 = 0;
        for(int val : nums){
            sum2 += val;
        }

        return sum-sum2;

    }
}
