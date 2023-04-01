# n의 배수 고르기
풀이일자 : 2023. 01. 19.  
    
레벨 : 0   

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120905  
    
풀이방식    

    List, ArrayList 쓸려고 했는데 배열로 변환하는거 까먹...
    그래서 임시 배열을 만들어서 새로운 배열을 만드는 방식으로 코딩해봄
    알고리즘 자체는 간단하게 입력받은 배열을 순회하면서 n과 나눴을 때
    나머지가 0인 것들만 배열에 담아주는 방식으로 풀이

기억해둘 것  
    
    ArrayList => int[]로 변환
    List<Integer> aryList = new ArrayList<Integer>();
    aryList.add(value);
    int[] intArray = aryList.stream().mapToInt(i -> i).toArray();
