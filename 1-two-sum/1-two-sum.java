class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i=0;i<nums.length;i++){
            int bachahua = target-nums[i];
            if(hm.containsKey(bachahua)){
                ans[0]=hm.get(bachahua);
                ans[1] = i;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return ans;
    }
}