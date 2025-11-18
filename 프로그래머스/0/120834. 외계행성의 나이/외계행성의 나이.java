class Solution {
    public String solution(int age) {
        String answer = "";
        char[] age_chr = String.valueOf(age).toCharArray();
        String[] al = {"a","b","c","d","e","f","g","h","i","j"};
        for (int i = 0; i < age_chr.length; i++) {
            int a = Integer.parseInt(String.valueOf(age_chr[i]));
            answer += al[a];
        }
        return answer;
    }
}