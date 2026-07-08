# Write your MySQL query statement below
select x , y , z ,
CASE
    WHEN x + y <= z THEN 'No'
    WHEN x + z <= y THEN 'No'
    WHEN y + z <= x THEN 'No'
    ELSE 'Yes'
END triangle
from triangle
;