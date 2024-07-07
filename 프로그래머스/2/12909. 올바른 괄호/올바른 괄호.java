import java.util.*;

class Solution {
    boolean solution(String s) {
//         boolean answer = true;

//         char leftC = '(';
//         char rightC = ')';
//         int leftCint = (int) leftC;
//         int rightCint = (int) rightC;
        
//         Queue<Character> charQueue = new LinkedList<>();
        
//         for(int i=0; i<s.length i++) {
//             charQueue.add(s.charAt(i)); // 하나씩 큐에 넣기
//         }
    
//         // 큐에서 하나씩 꺼내서 괄호 정상인지 확인하기
//         while() {
//         } // 잠깐.. 스택으로 먼저 짜보기

//         return answer;
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; // 스택이 비어있거나 짝이 맞지 않는 경우
                }
            }
        }

        return stack.isEmpty(); // 스택이 비어있으면 모든 괄호가 짝이 맞음
    }
}