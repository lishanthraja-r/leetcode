-- Last updated: 7/17/2026, 3:08:10 PM
SELECT today.id
FROM Weather yesterday 
CROSS JOIN Weather today

WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1
    AND today.temperature > yesterday.temperature
;