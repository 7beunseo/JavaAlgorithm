-- 코드를 작성해주세요
SELECT ID, (SELECT COUNT(*) FROM ECOLI_DATA e2 WHERE e1.ID = e2.PARENT_ID) CHILD_COUNT
FROM ECOLI_DATA  e1
ORDER BY ID;