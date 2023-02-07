class Solution {
    public int solution(int[] numbers) {
        int first = numbers[0] > numbers[1] ? numbers[0] : numbers[1];
        int second = numbers[0] < numbers[1] ? numbers[0] : numbers[1];
        
        for(int i = 2; i < numbers.length; i++) {
            if(numbers[i] > second) {
                if(numbers[i] > first) {
                    second = first;
                    first = numbers[i];
                }
                else{
                    second = numbers[i];
                } 
            }
            
        }
        
        return first * second;
    }
}