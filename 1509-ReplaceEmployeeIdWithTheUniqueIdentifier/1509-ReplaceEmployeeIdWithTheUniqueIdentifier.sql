-- Last updated: 7/17/2026, 3:06:44 PM
SELECT euni.unique_id, e.name 
FROM Employees e  
LEFT JOIN EmployeeUNI euni  
ON e.id = euni.id;