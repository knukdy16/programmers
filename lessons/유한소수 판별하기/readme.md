# 유한소수 판별하기
풀이일자 : 2023. 01. 25.  
    
레벨 : 0   

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120878  
    
풀이방식    

    기약분수로 만들어준 다음, 기약분수의 분모를 소인수해서 2, 5만 있는지 확인
    기약분수로 만들기 위해 분자, 분모의 최대공약수를 찾아냄
    그런 다음, 어차피 분모만 따지면 되니까 분모를 최대공약수로 나눠주고
    분모를 소인수분해 했을 때 2, 5 이외의 값이 나오는지 확인해줌

    문제는 소인수분해랑 최대공약수 구하는거 하나도 기억 안났었음;;
    다시 외워야지 뭐 하...

    이와중에 테스트케이스 왜저래 많음... 무섭구로 ㄷㄷ


기억해둘 것  
    
    소인수분해 sudo code
    for(int i = 2; i <= n; i++) {
        while(n % i == 0) {
            n /= i; print(i);
        }
    }
    
    재귀 형태의 유클리드 호제법 sudo code
    int getGCD(num1, num2) {
        if(num1 % num2 == 0) return num2;
        else return getGCD(num2, num1 % num2);
    }
