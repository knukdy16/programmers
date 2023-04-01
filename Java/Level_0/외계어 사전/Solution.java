class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i = 0; i < dic.length; i++) {
            int j;
            for(j = 0; j < spell.length; j++) {
                if(!dic[i].contains(spell[j])) break;
            }
            if(j == spell.length) { answer = 1; break; }
        }
        
        return answer;
    }
}