class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int rep = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                rep = nums[i];
            }
        }
        return rep;
    }
}