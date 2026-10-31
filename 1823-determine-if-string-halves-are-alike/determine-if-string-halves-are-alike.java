class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        int a=mid-1;
        int b=mid;

        int countA=0;
        int countB=0;
        for(int i=0;i<mid;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                countA++;
            }
            if(s.charAt(i+mid)=='a'||s.charAt(i+mid)=='e'||s.charAt(i+mid)=='i'||s.charAt(i+mid)=='o'||s.charAt(i+mid)=='u'||s.charAt(i+mid)=='A'||s.charAt(i+mid)=='E'||s.charAt(i+mid)=='I'||s.charAt(i+mid)=='O'||s.charAt(i+mid)=='U'){
                countB++;
            }

        }
        return countA==countB;
    }
}