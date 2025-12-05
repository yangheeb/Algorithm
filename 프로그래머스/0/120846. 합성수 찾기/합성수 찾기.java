class Solution {
    public int solution (int n){
        int[] num = new int[n+1];
        int answer = 0;
        for (int i = 1; i <= n; i++){              // i의 약수의 개수 count를 위해서
            for (int j = i; j <= n; j += i){       // 해당 i의 배수를 파악하고
                num[j]++;                          // 그에 맞게 count 증가
            }
        }
        for (int i = 1; i <= n; i++){
            if (num[i] >=3){
                answer++;
            }
        }
        return answer; 
    }
}