class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcan=0;
        for(int a: candies)
        {
            maxcan=Math.max(maxcan,a);
        }
        List<Boolean> list=new ArrayList();
        for(int a:candies)
        {
            list.add(a+extraCandies>=maxcan);
        }
        return list;
    }
}