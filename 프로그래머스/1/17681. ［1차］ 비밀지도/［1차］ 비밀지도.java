class Solution {
    public String[] addZero(String bin, int n) {
        if(bin.length() != n) {
            String zero = "";
            for(int i=0; i<n-bin.length(); i++) {
                zero += "0";
            }
            bin = zero + bin;
        }

        return bin.split("");
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
            String row = "";
            
            //돌라면서 2진수 스트링 만들기
            String bin1 = Integer.toBinaryString(arr1[i]);
            String bin2 = Integer.toBinaryString(arr2[i]);
            
            //숫자 모자르면 앞에 0 붙이고 스트링배열에 넣기
            String[] a1 = addZero(bin1, n);
            String[] a2 = addZero(bin2, n);
            
            
            for(int j=0; j<n; j++) {
                if("1".equals(a1[j]) || "1".equals(a2[j])) row += "#";
                else row += " ";
            } //예를 들어 "## # " 5개 짜리 한 변이 완성됨 = row
            
            //그 한 변을 스트링 배열에 넣기
            answer[i] = row;
        }
        
        return answer;
    }
}