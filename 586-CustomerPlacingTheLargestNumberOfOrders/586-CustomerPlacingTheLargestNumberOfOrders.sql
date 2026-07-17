-- Last updated: 7/17/2026, 3:07:23 PM
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY count(order_number) DESC
LIMIT 1;