# 약수의 갯수

     public int cal_div(int n) {
        int count = 0;
        
        for (int i = 1; i * i <= n; i++) {
	        if (i * i == n) count++;
	        else if (n % i == 0) count += 2;
        }
        
        return count;
     }

# 최대공약수(GCD, 유클리드 호제법)

   public int gcd(int a, int b) {
      if(a % b == 0) return b;
      else return gcd(b, a % b);
   }

# 최소공배수(GCD, 유클리드 호제법)

   최소공배수 공식
   최소공배수 = 두 수의 곱 / 최대공약수

   int lcm - a * b / gcd(a, b);

# 소수 확인 sudo코드

   for(int i = 2; i <= sqrt(n); i++) { if(a % i == 0) break; }
   or
   for(int i = 2; i * i <= n; i++) { if(a % i == 0) break; }

