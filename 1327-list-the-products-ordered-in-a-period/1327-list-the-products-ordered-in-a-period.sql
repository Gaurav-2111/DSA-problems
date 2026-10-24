# Write your MySQL query statement below
select product_name, sum(unit) unit
from Products p
inner join Orders o
on p.product_id = o.product_id  
where extract(year from order_date) = 2020 and extract(month from order_date) = 2
group by product_name 
having sum(unit) >= 100