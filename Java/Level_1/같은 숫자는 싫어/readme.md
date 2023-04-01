# 같은 숫자는 싫어 
풀이일자 : 2023. 03. 17.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12906  
    
풀이방식    

    살짝 큐를 쓰는 듯한 느낌으로 푸는 문제
    들어온 배열을 큐라고 생각하고 FIFO 방식으로 처리하게끔 구현
    배열에서 FIFO로 꺼낸 값을 임시로 저장해두고 같은지 달라졌는지 비교해서 달라졌으면 새로 넣고 아니면 안 넣고 요렇게 해줌
    
    근데 정답을 array로 해야 하는 문제 때문에 골치아픈데 두가지 방법이 있음
    
    array의 크기를 for문으로 미리 계산해서 푸는 방식
    for문으로 돌려서 정답 배열의 size를 찾은 다음 그 size만큼의 배열을 다시 만들어서 size 찾던 방식대로 다시 array에 대입
    이러면 속도는 빠르긴 하지만 번거로움

    ArrayList를 써서 푸는 방식
    배열 size를 몰라도 되고 가변 size다 보니까 임시로 저장해서 비교하는 for문을 두번 쓰지 않아도 됨
    대신 위의 방법과 비교했을 때 속도가 좀 더 느렸음
    (Object를 선언해서 따로 활용하다보니 for문만 쓰는 방식보다 내부 구조가 복잡해서 그런듯)


기억해둘 것  
    
    ArrayList => array로 변환
    ArrayList<Integer> answer_list = new ArrayList<Integer>();
    int[] answer = answer_list.stream().mapToInt(Integer::intValue).toArray();
