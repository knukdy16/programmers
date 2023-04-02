# 다음 큰 숫자
풀이일자 : 2023. 04. 02.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12911
    
풀이방식    

    그냥 귀찮아서 주어진 숫자 1의 갯수 구하고 n부터 1씩 증가한 수들에서
    1의 갯수 count해서 일치하는 숫자 나오는 지 봤음

    그러다가 다른 사람 풀이도 궁금해서 봤는데 홀리? bitCount()라는게 있네
    Integer class에 있는 함수인데 이걸로 1인 bit들의 갯수들을 바로 다 count해줌
    와... ㄹㅇ 짱 신세계다 ㄷㄷ

기억해둘 것  
    
    bitCount() 사용법
    countResult = Integer.bitCount(countTarget);
