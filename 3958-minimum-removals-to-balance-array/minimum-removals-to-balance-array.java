class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int l = 1;

        int min = nums[0];
        int max = nums[0];

        while(j < n){
            min = nums[i];
            max = nums[j];

            while(i < j && max > (long)k * min){
                i++;
                min = nums[i];
            }

            l = Math.max(l, j - i + 1);
            j++;
        }
        return n - l;       
    }
}