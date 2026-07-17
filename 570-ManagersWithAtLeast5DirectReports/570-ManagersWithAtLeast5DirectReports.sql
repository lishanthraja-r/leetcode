-- Last updated: 7/17/2026, 3:07:26 PM
SELECT name 
FROM Employee 
WHERE id IN (
    SELECT managerId 
    FROM Employee 
    GROUP BY managerId 
    HAVING COUNT(*) >= 5
)

-- Low performance. Why? Read below.