class Solution {
    public int solution(int hp) {
        int answer = 0;
        int jang = 5;
        int byeong = 3;
        int il = 1;
        
        // 1. 5로 나눌 수 있을 때까지 나누려고 함
        while(hp / jang != 0){
            answer += hp/jang;
            hp = hp%jang;
        }
        
        // 2. 3으로 나눌 수 있을 때까지 나누려고 함
        while(hp / byeong != 0){
            answer += hp/byeong;
            hp = hp%byeong;
        }
        
        // 3. 1으로 나눌 수 있을 때까지 나누려고 함
        while(hp / il != 0){
            answer += hp/il;
            hp = hp%il;
        }
        
        return answer;
    }
}