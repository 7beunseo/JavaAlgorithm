-- 코드를 입력하세요

SELECT A.ANIMAL_ID, B.NAME
FROM ANIMAL_INS A, (SELECT NAME, ANIMAL_ID, DATETIME FROM ANIMAL_OUTS) B
WHERE A.ANIMAL_ID=B.ANIMAL_ID
ORDER BY DATEDIFF(B.DATETIME, A.DATETIME) DESC
LIMIT 2