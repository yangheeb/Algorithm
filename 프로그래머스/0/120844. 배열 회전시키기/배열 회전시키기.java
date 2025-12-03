class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] result = new int[len];

        if (direction.equals("left")) {
            for (int i = 0; i < len - 1; i++) {
                result[i] = numbers[i + 1];
            }
            result[len - 1] = numbers[0];  // 첫 번째 요소를 마지막으로 이동
        } else { // direction == "right"
            for (int i = 1; i < len; i++) {
                result[i] = numbers[i - 1];
            }
            result[0] = numbers[len - 1];  // 마지막 요소를 맨 앞으로 이동
        }

        return result;
    }
}
