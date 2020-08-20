class Solution {
    public boolean isPalindrome(int x) {
        char[] chars = ("" + x).toCharArray();
        int len = chars.length;
        int half = (len/2);
        System.out.print(len);
        if ( len % 2 == 0 ){
            for(int i = 0; i < (half); i++){
                if((chars[half + i]) != (chars[half-1 - i])){
                    return false;
                }
            }
            return true;
        }else{
            for(int i = 1; i <= (half); i++){
                if((chars[half + i]) != (chars[half - i])){
                    return false;
                }
            }
            return true;
        }
    }
}