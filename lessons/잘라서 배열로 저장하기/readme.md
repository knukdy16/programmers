# 잘라서 배열로 저장하기
풀이일자 : 2023. 01. 21.  
    
레벨 : 0   

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120913  
    
풀이방식    

    배열 크기가 애매했네...
    일단 답을 저장할 배열 크기를 String 길이를 n으로 나눴을 때 나머지 유무에 따라 조정해주고
    자르는 건 간단하게 substring method를 사용해서 분리
    이때, 그냥 길이만큼 자르면 index 침범 문제가 생기니까 또 자르는 길이가 최대 길이랑 일치하는지 확인해줌

기억해둘 것  
    
    null
