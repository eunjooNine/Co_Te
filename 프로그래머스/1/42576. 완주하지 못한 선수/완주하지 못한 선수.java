import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 완주자 명단 한번 확인하고 다 뺀 다음 남아있는 사람 누구인지 확인하기
        
        Map<String, Integer> map = new HashMap<>();
        
        // 참가자를 맵에 넣고 
        // .get()으로 키나 키값이 없으면 null 대신 기본값을 반환하는 함수 .getOrDefault
        for (String pp : participant) {
            map.put(pp, map.getOrDefault(pp, 0)+1); // 같은 이름 있으면 값을 +1 해주기
        }
        
        // 완주자에 있으면 맵의 각 참가자 값 -1씩 감소
        for (String cp : completion) {
            map.put(cp, map.get(cp) - 1);
        }
        
        // 동명이인이 이씅면 이름 추출
        for (String key : map.keySet()) {
        if (map.get(key) != 0) {
            answer = key;
            break;
            }
        }
        
        return answer;
    }
}