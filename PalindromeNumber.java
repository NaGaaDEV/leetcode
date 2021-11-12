class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int y = x;
        int z = 0;
        while(y != 0) {
            z *= 10;
            z += y % 10;
            y /= 10;
        }
        return (z == x) ? true : false;
    }
}
