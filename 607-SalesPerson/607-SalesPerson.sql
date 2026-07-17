-- Last updated: 7/17/2026, 3:07:19 PM


SELECT name 
FROM salesperson s
where s.sales_id
NOT IN(
    SELECT sales_id    
    FROM company c
    INNER JOIN orders o
    ON o.com_id=c.com_id
        WHERE c.name='Red'
)