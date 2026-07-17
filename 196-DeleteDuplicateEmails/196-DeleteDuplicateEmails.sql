-- Last updated: 7/17/2026, 3:08:12 PM
DELETE p FROM Person p
JOIN Person p2 
ON p.Email = p2.Email AND p.Id > p2.Id;