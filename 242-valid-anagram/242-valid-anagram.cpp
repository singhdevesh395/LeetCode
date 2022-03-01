class Solution {
public:
bool isAnagram(string s, string t) {
int arr[2][26];
for(int j=0; j<2; j++){
for(int i=0; i<26; i++){
arr[j][i] = 0;
}
}
for(int i=0; i<s.size(); i++){
arr[0][s[i]- 'a']++;
}
for(int i=0; i<t.size(); i++){
arr[1][t[i]- 'a']++;
}
int ans = 0;
for(int i=0; i<26; i++){
ans += abs(arr[0][i] - arr[1][i]);
}
if(ans == 0){
return true;
}
else{
return false;
}
}
};