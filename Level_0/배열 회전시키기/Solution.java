class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        int start = 0, end = numbers.length, index = 0;
        if(direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
            start = 1;
        }
        if(direction.equals("left")) {
            answer[numbers.length - 1] = numbers[0];
            end = numbers.length - 1;
            index = 1;
        }
        
        for(int i = start; i < end; i++, index++) {
            answer[i] = numbers[index];
        }
        return answer;
    }
}