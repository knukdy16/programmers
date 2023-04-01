# 최대공약수와 최소공배수 
풀이일자 : 2023. 03. 16.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12940  
    
풀이방식    

    gcd 알고리즘을 자주 쓰진 않으니까 계속 까먹네... 외우던지 해야지 흑흑
    밑에 적혀있는 공식과 sudo 코드를 써서 구현하면 됨
    이게 기억 안니면 조지는거임

기억해둘 것  
    
    유클리드 호제법을 활용한 최대공약수 sudo code
    int gcd(int a, int b) {
        if(a % b == 0) return b;
        else return gcd(b, a % b);
    }
    최소공배수 공식
    최소공배수 = 두 수의 곱 / 최대공약수
