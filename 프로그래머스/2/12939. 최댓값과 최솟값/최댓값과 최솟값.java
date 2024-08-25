class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sChange = s.split(" ");
        int min = Integer.parseInt(sChange[0]);
        int max = Integer.parseInt(sChange[0]);
        for(int i=1; i<sChange.length; i++) {
            if(Integer.parseInt(sChange[i])<min) {
                min = Integer.parseInt(sChange[i]);
            }
            if(Integer.parseInt(sChange[i])>max) {
                max = Integer.parseInt(sChange[i]);
            }
        }
        answer = min + " " + max;
        
        return answer;
    }
}