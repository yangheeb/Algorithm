class Solution {
    public int[][] solution(int[] num_list, int n) {
        int a = num_list.length;
        int[][] answer = new int[a/n][n];
        
        for (int x = 0; x < a/n ; x++){
            for(int y = 0; y < n; y++){
                answer[x][y] += num_list[x * n + y];
            }
        }
        
        return answer;
    }
}

// 시도 1. 이중 반복문에서 사용하는 x,y의 초기값 설정을 다르게 지정하기 -> 실패?
// 시도 2. num_list[]에서 인덱스를 a/n 형태를 이용해서 할당해보기 