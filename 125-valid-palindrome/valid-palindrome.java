class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String reverse = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                reverse += ch;
            }
        }
        String original = reverse;
        String rev = "";
        for(int i = original.length()-1; i >= 0; i--) {
            rev += original.charAt(i);
        }
        if(original.equals(rev)) {
            return true;
        }
        else {
            return false;
        }
    }
}