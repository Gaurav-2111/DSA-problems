# Write your MySQL query statement below
select name, COALESCE(SUM(distance), 0) travelled_distance
from Users u
left join Rides r
on u.id = r.user_id
group by name, u.id
order by sum(distance) desc, name asc
