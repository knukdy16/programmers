# 구슬을 나누는 경우의 수
풀이일자 : 2023. 01. 09.  
    
레벨 : 0    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120840  
    
풀이방식    

    어쩐지 공식은 맞았는데 왜 틀렸나 했더니 변수 값 범위 문제였네...
    일단 순서 상관없이 pick하니까 조합(Combination) 공식을 사용하면 되고, 해당 공식은 n! / (r! * (n-r)!) 로 사용한다
    여기서 문제가... 주어진 테스트 케이스가 int, long의 범위를 넘어간다는 것
    그래서 자바에선 이를 해결하기 위해 BigInteger type의 Object들을 활용해야 한다
    java.math 내부에 있으며 이걸 불러온 다음 계산해주면 되는데, 이게 단순 사칙연산 기호를 쓸 수 없고 일일이 method로
    add, subtract, multiply, divide를 사용해서 사칙연산을 해줘야한다
    심지어 비교하는 것도 compareTo method를 활용해야 함
    그거까지 다 고려해서 하다보면 음... 코드가 상당히 더러워짐;


기억해둘 것  
    
    BigInteger 변수 선언
    import java.math.BigInteger;
    BigInteger value1 = BigInteger.valueOf(0); BigInteger value2 = new BigInteger("0");

    BigInteger 사칙연산 method
    add, subtract, multiply, divide, reminder

    BigInteger 변수 비교
    value1.compareTo(BigInteger.ONE); value1.compareTo(value2);
    0이면 같고. -1이면 괄호 안의 변수보다 작고, 1이면 괄호 안의 변수보다 크다
