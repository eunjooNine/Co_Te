import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        
        boolean[] visited = new boolean[N];
        int[] costs = new int[N]; // 0 1 2 3 4 ... N-1
        int[] path = new int[N];

        Arrays.fill(costs, Integer.MAX_VALUE);
        Arrays.fill(path, -1);

        int startNode = 0; // 1번 마을
        costs[startNode] = 0; // 1번 마을부터 시작하니까 거리값은 0

        for (int i = 0; i < N; i++) {
            int minNode = findMinNode(costs, visited);
            visited[minNode] = true;

            for (int[] edge : road) {
                int from;
                int to;
                int cost;
                from = 0;
                to = 0;
                cost = 0;

                // 양방향이라서 이런가
                // 처음 시작 노드를 0을 줬는디 표에는 1로 찾는다 (마을 이름을 기준으로 찾아서)
                int newMinNode = minNode;
                // if(minNode != N-1) { // 아예 다 크게하면 마지막에서 인덱스크기 오류가 난다
                //     newMinNode = minNode+1;
                // } else {
                //     newMinNode = minNode;
                // }
                
                if (newMinNode == edge[0]-1) {
                    from = edge[0]-1;
                    to = edge[1]-1;
                    cost = edge[2];
                } else if (newMinNode == edge[1]-1) {
                    from = edge[1]-1;
                    to = edge[0]-1;
                    cost = edge[2];
                }
                
                // if (minNode == edge[0]) {
                //     from = edge[0];
                //     to = edge[1];
                //     cost = edge[2];
                // } else if (minNode == edge[1]) {
                //     from = edge[1];
                //     to = edge[0];
                //     cost = edge[2];
                // }
                
                // 민노드가 0으로 시작하면 한번도 들어가지 앟음??
                if (!visited[to] && from == newMinNode && costs[from] + cost < costs[to]) {
                    costs[to] = costs[from] + cost;
                }
            }
        }
        
        // 최단거리가 k보다 작은 경우 구하기
        int answer = 0;
        for(int i=1; i<costs.length; i++) {
            if(costs[i] <= K) {
                answer += 1;
            }
        }
        
        return answer+1;
    }
    
    // 갈수있는 노드 중에서 제일작은 노드 찾기
    private int findMinNode(int[] costs, boolean[] visited) {
        int minCost = Integer.MAX_VALUE;
        int minNode = 0; // 

        // 한번도 들어가지 않았다?
        for (int i = 0; i < costs.length; i++) {
            if (!visited[i] && costs[i] < minCost) { // 방문하지 않았고 값이 무한보다 작은경우
                minCost = costs[i];
                minNode = i;
            }
        }

        return minNode; // 거리값이 제일 작은 노드 인덱스 반환
    }
}