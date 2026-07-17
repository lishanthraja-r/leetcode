-- Last updated: 7/17/2026, 3:07:04 PM
# Write your MySQL query statement below
select p.product_name , s.year , s.price
from Sales as s
Left Join Product as p
ON s.product_id = p.product_id