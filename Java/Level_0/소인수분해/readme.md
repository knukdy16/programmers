# 소인수분해
풀이일자 : 2023. 01. 12.  
    
레벨 : 0(이게...?)    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120852  
    
풀이방식    

    무친 이게 어딜봐서 0단계냐
    간단하게 소인수분해만 하면 되는 문제인데, 그 과정에 상당히 더러움
    대부분의 소인수분해는 말 그대로 소인수 분해를 하면 되는 문제인데 예를 들어서 12의 소인수분해면
    2 * 2 * 3으로, 이걸 통으로 출력하면 됨
    하지만 이 문제는 정확하게는 소인수분해되는 "소수"들을 찾는 문제임
    그래서 나누어질 수 있는 모든 소수를 찾아야 하니까 2부터 n까지 전부 순회해주어야 하고
    순회하면서 찾은 수가 과연 소수인지도 체크를 따로 해주어야 함
    소수인지 체크하는 건 2부터 해당 수까지 나누어서 나머지가 0이 되는 경우가 한번이라도 존재하면
    합성수로 판단해서 제외하는 방식으로 구현
    주어진 수 n에 대해서 증가시키면서, 딱 맞게 나누어 떨어지면 n / i로 나누어 준 다음 나눈 수에 대해
    다시 딱 맞게 나누어 떨어지는지 확인했음  

기억해둘 것  
    
    소인수분해 sudo code
    for(int i = 2; i <= n; i++) {
        while(n % i == 0) {
            n /= i; print(i);
        }
    }
    소인수분해 최적화
    제곱근을 활용해서 최적화하는 것이 가능한데 이는 sqrt(n) 이후로는 값들이 중복되어서 나타나기 때문
    따라서 위의 sudo code에 대해, 반복문을 주어진 n에 대한 제곱근 값만큼 반복해주도록 작성하면
    최적화가 가능함 (단, 안정성을 위해 비교되는 n은 별도로 계산해서 활용하는 것을 추천)
    a = n
    for(int i = 2; i * i <= a; i++) { // or i <= sqrt(a)
        while(n % i == 0) {
            n /= i; print(i);
        }
    }
    간단한 소수 확인
    for(int i = 2; i <= n; i++) {
        int j = 2;
        while(j <= i) { if (i % j == 0) break; j++; } // 합성수이면 break됨
    }
    List 선언과 배열로의 변환
    import java.util.List;
    import java.util.ArrayList;

    List<Integer> list = new ArrayList<>();

    int[] ary = list.stream().mapToInt(i -> i).toArray();
