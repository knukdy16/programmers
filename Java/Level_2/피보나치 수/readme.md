# 피보나치 수
풀이일자 : 2023. 04. 02.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12945
    
풀이방식    

    방법 자체는 세 가지가 있지만 한 가지 방법은 시간이 오래 걸리는 방식이라 비추(주석으로 표시해둠)

    첫번째는 무식하게 푸는 방법인데,
    for문 돌려서 피보나치 수를 계산하고 이를 1234567로 나눈 나머지를 다시 구해서 출력함
    문제는 10만번째 까지 계산하면 수가 더럽게 커짐
    그래서 BigInteger를 써서 풀어주는 방식으로 구현했음
    재귀보단 낫지만 메모리랑 시간을 더 쓰는건 아쉬운 풀이임

    두번째는 메모리를 훨씬 덜 잡아먹는 방식인데
    어차피 나머지를 출력하는 방식이니까 아예 처음부터 피보나치 수를 계산할 때 % 1234567을 전부 해줌 
    이러면 숫자 길이가 무식하게 커지지도 않고, 어차피 나머지를 더하기만 할 뿐이라
    계산 결과에 영향이 가지 않아서 이렇게 풀면 리소스를 아낄 수 있음
    와... 이건 상상도 못 했네 ㄷㄷ
    
    여담이지만 두번째 방법이 이해가 안 되면 분배법칙을 생각해보면 됨
    (a + b) / c는 분배 법칙에 의해서 a / c + b / c랑 똑같음
    그래서 마지막에 % 1234567을 한번만 넣어주는 거랑
    더하기되는 수에 전부 % 1234567을 해주는 거랑 둘 다 똑같이 계산될 수 있음

    /*****************************************************************************************
    
    비추천 방식은 재귀로 푸는 방식
    public long fibonacci(int num) {
        long answer = 0;
        
        if(num < 2) { answer = num; }
        else { answer = fibonacci((num - 1)) + fibonacci((num - 2)); }
        
        return answer;
    }
    이런 식으로 코드를 사용하는데, 처음 method 실행할 때 n번째 수를 num으로 넣는다고 보면 됨
    근데 이건 수가 커질수록 시간이 급격하게 커지므로 패스(실행되는 횟수가 제곱수로 늘어나기 때문)
    참고로 이번 문제도 재귀로는 못 품
    
    *****************************************************************************************/

기억해둘 것  
    
    BigInteger 변수 선언
    import java.math.BigInteger;
    BigInteger value1 = BigInteger.valueOf(0); BigInteger value2 = new BigInteger("0");

    BigInteger 사칙연산 method
    add, subtract, multiply, divide, reminder

    BigInteger 변수 비교
    value1.compareTo(BigInteger.ONE); value1.compareTo(value2);
    0이면 같고. -1이면 괄호 안의 변수보다 작고, 1이면 괄호 안의 변수보다 크다

