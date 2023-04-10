# [1차] 캐시
풀이일자 : 2023. 04. 07.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/17680
    
2018 KAKAO BLIND RECRUITMENT 문제

풀이방식

    으어... 어쩌다보니 코드가 길어...
    ArrayList를 사용했는데
    캐시를 담을 List, LRU인지 판단하기 위한 시간을 담은 List 두개를 사용

    캐시에 있으면 캐시에 있는 것만 시간을 초기화하고 나머지는 시간 증가

    캐시에 없으면
    사이즈가 꽉찼으면 시간 확인해서 길이가 가장 긴 것을 새 것으로 교체해주고 시간 증가
    아니면 새로 추가하고 시간 증가
    이때 cache size가 0이면 아예 아무것도 안하고 시간만 증가하도록 설정해주어야 함


기억해둘 것  
    
    ArrayList method
    .add(value): value를 List에 새로 추가
    .set(index, value): List의 index에 있는 값을 value로 수정
    .get(index): List의 index에 있는 값을 받아옴
    .contains(value): List에 value가 있는지 T/F로 반환
    .size(): List의 크기 반환
    .remove(index): index에 있는 값 제거 -> 이후 index들은 앞으로 당겨짐
    .clear(): List 전부 비우기
    .isEmpty(): List가 null인지 T/F로 반환
    .indexOf(value): List에 있는 value의 index를 반환 