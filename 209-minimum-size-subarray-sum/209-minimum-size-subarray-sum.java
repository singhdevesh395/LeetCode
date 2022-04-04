class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int count=1;int sum=nums[i];int flag=0;
            if(sum>=target){
                min=1;continue;
            }
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];count++;
                if(sum>=target){
                    flag=1;
                    break;
                }
            }
            if(flag==1 && count<min)
                min=count;
        }
        if(nums[nums.length-1]>=target)
            return 1;
        if(min==Integer.MAX_VALUE)
            return 0;
        return min;
    }
}