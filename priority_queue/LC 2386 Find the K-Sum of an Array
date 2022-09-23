using LL = long long;
class Solution {
public:
    long long kSum(vector<int>& nums, int k) {
        LL max = 0;
        for (auto x : nums) {
            if (x > 0) max += x;
        }
        if (k == 1) return max;
        
        for (auto &x : nums) {
            x = abs(x);
        }
        sort(nums.begin(), nums.end());
        priority_queue<pair<LL, int>, vector<pair<LL, int>>, greater<>>pq;
        
        pq.push({nums[0], 0});
        
        for (int i = 0 ; i < k - 1; i++) {
            auto [curr, idx] = pq.top();
            pq.pop();
            if (i == k - 2) return max - curr;
            if (idx + 1 < nums.size()) {
                pq.push({curr + nums[idx+1], idx+1});
                pq.push({curr - nums[idx] + nums[idx+1], idx+1});
            }
        }
        return -1;
    }
};
