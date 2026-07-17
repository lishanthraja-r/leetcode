-- Last updated: 7/17/2026, 3:06:19 PM
select transaction_date, 
sum(case when amount % 2 != 0 then amount else 0 end) as odd_sum, 
sum(case when amount % 2 = 0 then amount else 0 end) as even_sum
from transactions 
group by transaction_date
order by transaction_date;