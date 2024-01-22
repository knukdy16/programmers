# 기사단원의 무기  
풀이일자 : 2024. 01. 21.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/136798
    
풀이방식    

    약수의 갯수만 구할 수 있으면 끝나는 문제
    각 숫자의 약수 갯수를 구한 다음 limit 안쪽이면 약수의 갯수를 그대로 추가하고
    넘으면 power를 추가

    근데 약수 구하는거도 기억 안남... 진짜 한참 안 풀었긴 했네 ㄷㄷ


기억해둘 것  
    
    약수 갯수 count sudo코드
    int count = 0;
    
    for(int i = 1; i * i <= n; i++) {
        if (i * i == n) count++;
	    else if (n % i == 0) count += 2;
    }
