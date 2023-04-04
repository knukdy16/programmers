# 두 개 뽑아서 더하기
풀이일자 : 2023. 04. 04.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/68644
    
풀이방식    

    원래라면 중복되는 숫자 없애고 하던가 해서 더 효율적이게 만들 수 있긴 한데
    귀찮아서 다 생략하고 그냥 ArrayList에 담아가면서 중복인지 확인하고 넣는 방식으로 구현함
    ArrayList에 넣고 다시 int[]로 반환해야 하는데
    순서는 생각하지 않고 담았기 때문에 정렬을 해줘야 함
    근데 방법을 몰라서 찾아보니까 Collecitons.sort()를 호출하는 방식으로 해줬음
    그래서 그렇게 해주고 mapToInt 쓰는 방법 까먹어서 그냥 for문 돌려서 int[]로 만들어서 반환해줌

기억해둘 것  
    
    ArrayList 정렬
    import java.util.*;
    Collections.sort(arrayListValue);

    ArrayList -> Array 변환
    int[] ary = arrayListValue.stream().mapToInt(Integer::intValue).toArray();
