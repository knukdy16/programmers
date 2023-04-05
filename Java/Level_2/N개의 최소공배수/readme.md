# N개의 최소공배수
풀이일자 : 2023. 04. 05.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12953
    
풀이방식

    최대공약수, 최소공배수가 여러개인 경우에 어떻게 하는지 몰라서 인터넷에 검색해봤는데
    간단하게 설명하면 먼저 두 수에 대한 GCD를 구하고 이에 대한 LCM을 구한 다음
    남은 수랑 LCM에 대해 다시 GCD를 계산하고 이를 반복하는 방식이었음
    LCM도 마찬가지
    (참고: https://fbtmdwhd33.tistory.com/248)

    처음에는 GCD에 대해 계산할 때 이전에 계산한 GCD랑 남은 수들이랑 계산한다고 생각했었는데
    다시 곰곰히 보면 GCD에 대한 GCD는 일정하거나 1이 되거나 둘 중 하나가 됨
    그래서 계산하는 의미가 없을 뿐더러 LCM이 제대로 계산되지 않음
    그러므로 GCD 계산 시, 남은 수랑 계산되는 건 LCM이어야 하고 그래야 다음 LCM이 제대로 계산됨


기억해둘 것  
    
    GCD, LCM 계산 (단, a < b인 경우)
    public int gcd_func(int a, int b) {
        if(a % b == 0) return b;
        else return gcd_func(b, a % b);
    }
    public int lcm_func(int a, int b, int gcd) {
        return a * b / gcd;
    }

    N개의 수에 대한 GCD, LCM 계산

    int lcm = first_value;
    for(int i = 1; i < arr.length; i++) {
            int gcd = gcd_func(lcm, arr[i]);
            lcm = lcm_func(lcm, arr[i], gcd);
    }