import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] numbers, int target) {
        //  전달받은 numbers를 너비우선탐색으로 탐색
        //  다음 갈 수 있는 길은 +, - 가지이기 때문에 2가지의 계산 결과를 모두 큐에 넣는다
        //  방문 체크는 필요없음
        // 4,1,2,1

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        for(int i=0; i<numbers.length; i++) {
            Integer size = queue.size();
            for(int j=0; j<size; j++) {
                int node = queue.poll();
//                System.out.println(node+" ");

                queue.add(node+numbers[i]);
                queue.add(node-numbers[i]);
            }
        }

        int answer=0;
        while (!queue.isEmpty()) {
            if(queue.poll() == target) {
                answer++;
            }
        }

        return answer;
    }
}