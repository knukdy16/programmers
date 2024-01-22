import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // 가장 작은게 밑으로 가도록 세팅
        
        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]); // 어차피 알아서 sorting되니까 일단 집어넣고
            if(priorityQueue.size() > k) // 사이즈 초과하면
                priorityQueue.poll(); // 가장 작은 값부터 제거
            answer[i] = priorityQueue.peek(); // 가장 작은 값만 저장(Queue에는 남음)
        }
        
        return answer;
    }
}