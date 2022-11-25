# Write your MySQL query statement below
select ver2.id
from Weather ver1 , Weather ver2
where ver1.recordDate + interval '1' day = ver2.recordDate
and ver1.temperature    < ver2.temperature