-- 코드를 입력하세요
SELECT BOOK.AUTHOR_ID,	AUTHOR_NAME,	CATEGORY,	SUM(SALES*PRICE) TOTAL_SALES
FROM BOOK 
JOIN AUTHOR
ON BOOK.AUTHOR_ID=AUTHOR.AUTHOR_ID
JOIN BOOK_SALES
ON BOOK.BOOK_ID=BOOK_SALES.BOOK_ID
WHERE SALES_DATE LIKE "2022-01%"
GROUP BY AUTHOR_NAME, CATEGORY
ORDER BY BOOK.AUTHOR_ID, CATEGORY DESC;

