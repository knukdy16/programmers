SELECT MONTH(START_DATE) AS MONTH, CAR_ID, 
COUNT(CAR_ID) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE CAR_ID IN (
    SELECT CAR_ID FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
    WHERE START_DATE BETWEEN "2022-08-01" AND "2022-10-31" 
    GROUP BY CAR_ID HAVING COUNT(*) >= 5
) 
    AND START_DATE BETWEEN "2022-08-01" AND "2022-10-31"
GROUP BY MONTH, CAR_ID
HAVING COUNT(CAR_ID) >= 1
ORDER BY MONTH ASC, CAR_ID DESC;