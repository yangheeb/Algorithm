class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int rank = 1; // 가장 크면 1등
            for (int j = 0; j < n; j++) {
                if (emergency[j] > emergency[i]) {
                    rank++;
                }
            }
            result[i] = rank;
        }

        return result;
    }
}