class Solution {
    public int solution(int[] array) {
        int[] target = new int[1000];
        for(int i = 0; i < array.length; i++) {
            target[array[i]]++;
        }
        
        int answer = 0;
        int index = 0;
        for(int i = 0; i < 1000; i++) {
            if(target[index] < target[i]){ index = i; answer = i; }
            else if(target[index] == target[i] && i != 0){ answer = -1; }
        }
        
        return answer;
    }
}