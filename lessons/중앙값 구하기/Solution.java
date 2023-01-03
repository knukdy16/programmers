class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            int index = i;
            for(int j = i; j < array.length; j++) {
                if(array[index] > array[j]) index = j;             
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        
        return array[array.length/2];
    }
}