# 모스부호 (1)
풀이일자 : 2023. 01. 09.  
    
레벨 : 0    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120838  
    
풀이방식    

    자바코딩 인생 최대 위기(?) Dictionary가 아니라 여긴 Map이구나
    아무튼 주어진 모스부호를 HashMap 형태로 담아두고, 입력된 모스부호 letter는 " "로 split해줘서 배열 형태로 따로 담아준다
    그러면 HashMap의 key가 모스부호 코드고 value가 글자니까, get을 사용해서 해당 모스부호에 대한 글자로 가져온다



기억해둘 것  
    
    자바에서 (key, value) 형태의 변수 선언
    HashMap을 사용

    HashMap 변수 선언 및 사용
    import java.util.Map;
    import java.util.HashMap;
    
    Map<String, String> morse = new HashMap<>();
    morse.put(".-", "a");
    morse.get(".-"); // == "a"

    문자열 분리
    split 사용
    String[] newStringValue = stringValue.split(" "); // 정규식 사용 가능 
