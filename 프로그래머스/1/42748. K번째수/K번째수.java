import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 1.자르기, 2.정렬하기, 3.숫자 뽑기, 4.배열에 넣기
        
        int[] answer = new int[commands.length]; // 커맨즈 배열 크기만큼만
        
        for(int i=0; i<commands.length; i++) {
            // 배열 생성을 포문 밖에다 하니까 원래 있던 원소들에 +로 들어가서 안으로 옮김
            List<Integer> cut = new ArrayList<>();
            
            // 1 배열 자르는 함수 안 쓸 때
            for(int j=commands[i][0]; j<=commands[i][1]; j++) {
                cut.add(array[j-1]);
            }
            // 2 오름차순
            Collections.sort(cut);
            // 3 k번쨰 숫자, 4 넣기
                // 리스트 문법 까먹지 말자..
            answer[i] = cut.get(commands[i][2]-1);
        }
        
        return answer;
    }
}