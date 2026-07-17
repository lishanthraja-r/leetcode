-- Last updated: 7/17/2026, 3:07:01 PM
select player_id,min(event_date) as first_login
from Activity
group by player_id