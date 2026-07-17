-- Last updated: 7/17/2026, 3:06:22 PM
# Write your MySQL query statement below
select teacher_id,Count(distinct subject_id)  as cnt from teacher group by teacher_id;