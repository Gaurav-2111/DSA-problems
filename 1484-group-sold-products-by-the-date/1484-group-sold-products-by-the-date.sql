# Write your MySQL query statement below
select sell_date, count(distinct product) num_sold, GROUP_CONCAT(distinct product ORDER BY product ASC SEPARATOR ',') AS products
from Activities
group by sell_date