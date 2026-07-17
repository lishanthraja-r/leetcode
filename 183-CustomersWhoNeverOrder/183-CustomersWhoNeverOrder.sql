-- Last updated: 7/17/2026, 3:08:20 PM
# Write your MySQL query statement below
SELECT name as Customers FROM Customers 
WHERE id NOT IN (SELECT CustomerID FROM Orders);