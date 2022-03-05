/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
   TreeNode* helper(vector<int>& input,int si,int ei){
        if(si>ei){
            return NULL;
        }
        TreeNode* root=new TreeNode(input[(si+ei)/2]);
        root->left=helper(input,si,(si+ei)/2-1);
        root->right=helper(input,(si+ei)/2+1,ei);
        return root;
    }
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        return helper(nums,0,nums.size()-1);
    }
};