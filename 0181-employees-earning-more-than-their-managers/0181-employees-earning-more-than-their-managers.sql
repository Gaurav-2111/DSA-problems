# Write your MySQL query statement below
select e.name Employee
from employee e
join employee f
on e.managerId = f.id
where e.salary > f.salary
;