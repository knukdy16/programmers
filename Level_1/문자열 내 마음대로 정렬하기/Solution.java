class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i = 0; i < strings.length; i++) {
            int index = i;
            for(int j = i; j < strings.length; j++) {
                if((strings[index].charAt(n) > strings[j].charAt(n)) ||
                  (strings[index].charAt(n) == strings[j].charAt(n) && strings[index].compareTo(strings[j]) > 0)) {
                    index = j;
                }
            }
            
            String temp = strings[i];
            strings[i] = strings[index];
            strings[index] = temp;
        }
        
        return strings;
    }
}