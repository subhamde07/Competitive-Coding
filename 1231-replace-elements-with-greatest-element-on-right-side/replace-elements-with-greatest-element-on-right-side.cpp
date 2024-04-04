class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int maxi=-1;
        vector<int> ans(arr.size(),0);
       // ans.push_back(-1);
        for(int i=arr.size()-1;i>=0;i--){
            ans[i]=maxi;
            maxi=max(maxi,arr[i]);
        }
        // reverse(ans.begin(),ans.end());
        return ans;
    }
};