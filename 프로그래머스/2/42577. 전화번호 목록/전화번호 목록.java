import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 맵을 쓰는 이유? 값이 필요없지않나
        Map<String, Integer> map = new HashMap<>();
		
        // 전화번호 맴에 넣기
        for(int i = 0; i < phone_book.length; i++) {
	        map.put(phone_book[i], 0);
        }
        
        // 한 인덱스로 시작하는 다른 키가 배열에 있는지 반복하여 확인하기
        // 전화번호 수만큼 돌려서, 
        for(String s : phone_book) { // 각각의 번호를 =스트링
	        for(int i = 1; i < s.length(); i++) { // 그 번호의 문자열길이 -1만큼
		        if(map.containsKey(s.substring(0, i))) {
                    // 특정 키가 맵에 있는지 체크 .containsKey
                    // 번호의 한자한자씩 잘라서 그 번호로 시작하는 키가 있는지 확인해야함
			        return false;
		        }
	        }
        }
        
        return answer;
    }
}