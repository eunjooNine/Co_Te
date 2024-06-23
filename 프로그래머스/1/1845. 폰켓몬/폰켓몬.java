import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 고를 포켓몬 수
        int bbobgi= nums.length/2;
        
        // 포켓몬은 모든 조합을 확인하기때문에 각각의 조합 결과가 중요한게 아니고 
        // 한 조합 안에 종류가 몇 개 포함되어 있는가가 중요하다 
        // (예를 들어 10포켓몬.3종류 중 2개 뽑는데 골고루 뽑히는가?하는 걱정 ㄴㄴ)
        // @ @ @ # # # # $ $ $ 일 때 -> @ @ 만 확인하면 어쩌지? 생각 ㄴㄴ
        // @ # 또는 # $ 도 다 확인하는 조합이기 때문에 우리는 종류만 신경쓰면 된다
        
        // 일단 중복을 없애기 위해 해시셋 써주기, 해시셋은 중복값 없도록 넣어준다
        HashSet <Integer> nums2 = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            nums2.add(nums[i]);
        }
        
        if(bbobgi <= nums2.size()) {
            return bbobgi;
        } else {
            return nums2.size();
        }
    
    }
}