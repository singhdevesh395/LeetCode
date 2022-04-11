class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();
        
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                li.add(nums[i]);
            }
        }
        return li;
    }
}