class Solution {
    public int solution(int[] numbers, int k) {

        int index = 0; // 첫 시작: numbers[0] = 1번 사람

        // 공을 k번째로 던지는 사람을 찾으려면 (k - 1)번 이동
        for (int i = 0; i < k - 1; i++) {
            index += 2;  
            if (index >= numbers.length) {
                index %= numbers.length; // 원형 순환
            }
        }

        return numbers[index];
    }
}
