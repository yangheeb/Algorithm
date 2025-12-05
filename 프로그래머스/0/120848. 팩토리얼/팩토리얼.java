class Solution {
    public int solution(int n) {
        int i = 0;
        int result1 = 1;
        
        for (int a = 1; a <= n ; a++){
            result1 *= a;
            if (result1 <= n && (result1 * (a+1)) > n){
                i = a;
                break;
            }
        }
        return i;
    }
}