-- Last updated: 7/17/2026, 3:07:17 PM
SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS unique_numbers;