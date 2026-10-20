# Write your MySQL query statement below
Select id 
from (select id, recordDate, temperature,
        lag(recordDate) over (order by recordDate) as prev_date,
        lag(temperature) over (order by recordDate) as prev_temp
    from Weather) as t
where temperature>prev_temp and datediff(recordDate,prev_date)=1;