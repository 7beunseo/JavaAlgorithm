-- 코드를 입력하세요
SELECT BOOK_ID,	DATE_FORMAT(PUBLISHED_DATE, "%Y-%m-%d") PUBLISHED_DATE
FROM BOOK
WHERE BOOK_ID IN (SELECT BOOK_ID
                  FROM BOOK
                  WHERE PUBLISHED_DATE LIKE "2021%"
                        AND CATEGORY="인문"
                  );
