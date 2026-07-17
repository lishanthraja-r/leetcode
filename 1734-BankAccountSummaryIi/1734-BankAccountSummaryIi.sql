-- Last updated: 7/17/2026, 3:06:35 PM
# Write your MySQL query statement below
select u.name, sum(t.amount)as balance  
from Users u 
join 
Transactions t
on u.account = t.account        
group by u.account 
having balance > 10000