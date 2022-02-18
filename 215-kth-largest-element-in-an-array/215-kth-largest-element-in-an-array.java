class Solution {
    public int findKthLargest(int[] arr, int k) {
        // Arrays.sort(nums);
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i =0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                // System.out.println(pq.peek());
                pq.remove();
            }
            // int ans = 
        }
        return pq.peek();
       
    }
    
}