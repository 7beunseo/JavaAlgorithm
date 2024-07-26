-- 코드를 작성해주세요
SELECT ITEM_ID,	ITEM_NAME,	RARITY
FROM ITEM_INFO A
WHERE NOT EXISTS (SELECT *
             FROM ITEM_TREE B
             WHERE A.ITEM_ID = B.PARENT_ITEM_ID)
ORDER BY ITEM_ID DESC