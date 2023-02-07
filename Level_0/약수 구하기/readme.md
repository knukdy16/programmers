# 약수 구하기
풀이일자 : 2023. 01. 17.  
    
레벨 : 0   

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120897  
    
풀이방식    

    흐음... 아직 ArrayList => array로 변환하는게 익숙하진 않네...
    풀이 자체는 간단함
    그냥 1부터 n까지 나눴을 때 나머지가 0이 되는 수들만 따로 모아주면 됨

기억해둘 것  
    
    ArrayList => int[]로 변환
    List<Integer> aryList = new ArrayList<Integer>();
    int[] intArray = aryList.stream().mapToInt(i -> i).toArray();
