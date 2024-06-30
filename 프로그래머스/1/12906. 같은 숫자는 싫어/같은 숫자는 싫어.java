import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 스택큐 사용해보기 일단 배열로 함
        
        
        List<Integer> resultList = new ArrayList<>();
        
        // 첫 번째 원소는 무조건 추가
        resultList.add(arr[0]);
        
        // 두 번째 원소부터 비교하여 추가
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                resultList.add(arr[i]);
            }
        }
        
        // List를 배열로 변환하여 반환
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}