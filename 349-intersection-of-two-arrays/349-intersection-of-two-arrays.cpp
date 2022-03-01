class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> r;
        int m[1001] = {0};
        for(int i = 0; i < nums1.size(); ++i) {
            if(m[nums1[i]] == 0) {
                m[nums1[i]]++;
            }
        }
        
        for(int i = 0; i < nums2.size(); ++i) {
            if(m[nums2[i]] == 1) {
                m[nums2[i]]++;
            }
        }
        
        for(int i = 0; i < 1001; ++i) {
            if(m[i] == 2) {
                r.push_back(i);
            }
        }
        return r;
    }
};