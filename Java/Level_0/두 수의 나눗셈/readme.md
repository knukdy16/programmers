# 두 수의 나눗셈
풀이일자 : 2023. 01. 02.  
    
레벨 : 0    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120806  
    
풀이방식    

    적절하게 형변환을 해줍시다
    단순하게 int로 나누면 int형이라 소숫점 부분이 남질 않으니 킹쩔수 없이 입력값을 double로 형변환
    그러면 계산결과가 double로 나올텐데, 실제 return은 int로 하니까 거기에 맞추기 위해
    return에서 다시 int로 형변환함
    형변환이 오랜만이라서 잘 기억나질 않았었네... 파이썬마냥 자꾸 toInt 이러고 있었음 ㅋㅋㅋ


기억해둘 것  
    
    자바에서의 int <-> double 간 형변환
    double variable = (double) intVariable;
    int variable = (int) doubleVariable;

    자바에서의 String <-> int 간 형변환
    int variable = Integer.valueOf(stringVariable);
    String variable = String.valueOf(intVariable);

