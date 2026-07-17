-- Last updated: 7/17/2026, 3:06:38 PM
select * from Patients 
where conditions like ('DIAB1%') 
OR conditions LIKE ('% DIAB1%');