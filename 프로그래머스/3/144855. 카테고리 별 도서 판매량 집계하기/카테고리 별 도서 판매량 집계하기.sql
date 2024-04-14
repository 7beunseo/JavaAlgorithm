-- 코드를 입력하세요
SELECT CATEGORY, SUM(SALES) TOTAL_SALES
FROM (SELECT BOOK_ID, CATEGORY FROM BOOK) BOOK, BOOK_SALES 
WHERE BOOK.BOOK_ID=BOOK_SALES.BOOK_ID
AND SALES_DATE LIKE "2022-01%"
GROUP BY CATEGORY
ORDER BY CATEGORY