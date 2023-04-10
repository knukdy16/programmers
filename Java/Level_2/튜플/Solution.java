import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> ary = new ArrayList<Integer>();
        
        s = s.substring(1, s.length() - 1);
        s = s.replaceAll("\\{", ""); s = s.replaceAll("\\},", " "); s = s.replaceAll("\\}", "");
        String[] splited = s.split(" ");
        int[] answer = new int[splited.length];
        
        int[] count = new int[splited.length];
        int index = 0;
        for(String a : splited) {
            String[] temp = a.split(",");
            count[index] = temp.length; index++;
        }
        
        for(int i = 0; i < count.length; i++) {
            index = i;
            for(int j = i + 1; j < count.length; j++) {
                if(count[index] > count[j]) index = j;
            }
            
            int count_temp = count[i]; String str_temp = splited[i];
            count[i] = count[index]; splited[i] = splited[index];
            count[index] = count_temp; splited[index] = str_temp;
        }
        
        for(String a : splited) {
            String[] temp = a.split(",");
            for(String b : temp) {
                if(!ary.contains(Integer.valueOf(b))) ary.add(Integer.valueOf(b));
            }
        }
        
        for(int i = 0; i < ary.size(); i++) answer[i] = ary.get(i);
        
        return answer;
    }
}