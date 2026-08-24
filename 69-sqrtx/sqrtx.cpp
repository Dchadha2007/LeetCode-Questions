class Solution {
public:
    int mySqrt(int x) {
    int low=0,high=x,sqrt=0;
    while(low<=high){
       long long int mid=low+(high-low)/2;
        if(mid*mid<=x){
            sqrt=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return sqrt;
    }     
};