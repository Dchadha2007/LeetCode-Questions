class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int count=0;
        for(int num=0;num<nums.size();num++){
             int n=nums[num];
            int digit=0;
        while(n>0){
             n=n/10;
            digit++;
        }
        if(digit%2==0){
            count++;
        }
        }
    return count;
    }
};