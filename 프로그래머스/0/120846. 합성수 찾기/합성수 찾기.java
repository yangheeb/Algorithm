class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (isComposite(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    // 합성수 판별 함수
    private boolean isComposite(int x) {
        if (x <= 3) return false; // 1,2,3은 합성수 X
        
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return true; // 약수가 있으면 합성수
            }
        }
        return false; // 나눠지는 수 없으면 소수
    }
}
