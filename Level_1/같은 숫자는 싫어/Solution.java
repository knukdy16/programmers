import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int size = 0; int temp = -1;
        for(int i = 0; i < arr.length; i++) {
            if(temp != arr[i]) { size++; temp = arr[i]; }
        }
        
        int[] answer = new int[size];
        
        temp = -1; int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(temp != arr[i]) { temp = arr[i]; answer[index] = temp; index++; }
        }
        

        return answer;
    }
}