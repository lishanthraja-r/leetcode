-- Last updated: 7/17/2026, 3:07:12 PM
UPDATE salary SET sex =
CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;