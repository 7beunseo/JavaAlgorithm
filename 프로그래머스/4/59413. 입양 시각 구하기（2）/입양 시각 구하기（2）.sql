-- 코드를 입력하세요

SELECT (@SEQ:=@SEQ+1) HOUR, (SELECT COUNT(*) 
                             FROM ANIMAL_OUTS
                            WHERE HOUR(DATETIME) LIKE @SEQ) COUNT
FROM ANIMAL_OUTS, (SELECT @SEQ:=-1) R
WHERE @SEQ<23