-- Last updated: 7/17/2026, 3:07:18 PM
# Write your MySQL query statement below
select *, case when x+y>z and x+z>y and y+z>x then "Yes" Else "No" 
end as triangle
from triangle