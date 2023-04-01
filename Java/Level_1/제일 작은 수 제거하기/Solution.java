class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        if(arr.length == 1) { answer = new int[1]; answer[0] = -1; return answer; }
        
        answer = new int[arr.length - 1];
        
        int min = 0;
        for(int i = 1; i < arr.length; i++) if(arr[min] > arr[i]) min = i;
        
        int index = 0;
        for(int i = 0; i < arr.length; i++) if(i != min) { answer[index] = arr[i]; index++; }
            
        return answer;
    }
}