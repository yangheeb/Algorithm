class Solution {
    public String solution(String letter) {
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] alphabet = {
            "a","b","c","d","e","f","g","h",
            "i","j","k","l","m","n","o","p",
            "q","r","s","t","u","v","w","x","y","z"
        };
        
        String answer = "";
        
        // 1. letter 글자를 공백 기준으로 분할
        String[] result = letter.split(" ");
        
        // 2. morse 배열 index 순서와 일치하는 alphabet 배열 index 값 출력
        for (int i = 0; i < result.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(result[i].equals(morse[j])){
                    answer += alphabet[j];
                }
            }
        }
        
        // 3. 해당하는 글자를 조합해서 결과값 출력
        return answer;
    }
}