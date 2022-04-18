/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        dfs(root,res);
        return findk(res,k);
    }
	//Traversing the Binary Tree using dfs Inorder Traversal
	// T.C - O(n)
    public void dfs(TreeNode root,ArrayList<Integer> res) {
        if(root == null) {return;}
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);
    }
	// Using PriorityQueue (i.e. Heap) for finding the kth element. 
	// T.C - O(nlogk) 
    public int findk(ArrayList<Integer> res,int k) {
        PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<res.size();i++) {
            maxh.add(res.get(i));
            while(maxh.size()>k) {
                maxh.poll();
            }
        }
        return maxh.peek();
    }
}