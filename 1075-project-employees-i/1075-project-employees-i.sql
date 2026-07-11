# Write your MySQL query statement below
select project_id ,  ROUND(avg(experience_years),2) average_years 
from employee e
join project p
on e.employee_id = p.employee_id
group by project_id
order by project_id
;