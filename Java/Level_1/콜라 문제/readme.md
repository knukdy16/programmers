# 콜라 문제
풀이일자 : 2023. 04. 05.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/132267
    
풀이방식    

    일반화는 간단했음
    n병 있는데 a병 단위로 교환할 수 있으니까 남은 병수는 n % a가 되고
    바꿀 수 있는 병 수는 (n / a) * b 가 된다
    그러면 최종적으로 n은 n % a + (n / a) * b가 됨
    이걸 n < a가 될 때까지 반복함

기억해둘 것  
    
    null