class Solution {
    public String solution(String rsp) {
        char[] new1 = rsp.toCharArray();
        String answer = "";
        
        for(int i = 0; i < new1.length; i++){
            if(new1[i]=='0'){
                answer += "5";
            }else if(new1[i]=='5'){
                answer += "2";
            }else if(new1[i]=='2'){
                answer += "0";
            }
        }
        
        return answer;
    }
}