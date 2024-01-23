class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int one = 0; int two = 0;
        for(int i = 0; i < goal.length; i++) {
            if(one < cards1.length && goal[i].equals(cards1[one])) one++;
            else if(two < cards2.length && goal[i].equals(cards2[two])) two++;
            else return "No";
        }
            
        return "Yes";
    }
}