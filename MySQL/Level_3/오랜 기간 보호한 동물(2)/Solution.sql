SELECT A.ANIMAL_ID, A.NAME FROM ANIMAL_INS A JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID ORDER BY (B.DATETIME - A.DATETIME) DESC LIMIT 2;