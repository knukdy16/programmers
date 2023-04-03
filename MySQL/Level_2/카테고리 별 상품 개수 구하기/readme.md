# 카테고리 별 상품 개수 구하기
풀이일자 : 2023. 04. 03.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131529
    
풀이방식    

   아... 문장 자르는 게 생각이 안났네 저거도 LoS 때 했는데 ㅠ
   카테고리에서 앞 부분만 잘라내기 위해서
   LEFT(PRODUCT_CODE, 2) AS CATEGORY로 써줬고
   GROUP BY LEFT(PRODUCT_CODE, 2)를 써서 각 카테고리별 재고 갯수를
   COUNT(*)에서 세도록 해줬음

기억해둘 것  
    
   문장 자르기
   SUBSTR(attr1, i, j) or MID(attr1, i, j): i부터 j까지 문장 자르기
   LEFT(attr2, i): 왼쪽부터 길이 i만큼 자르기
   RIGHT(attr3, j): 오른쪽부터 길이 j만큼 자르기
   