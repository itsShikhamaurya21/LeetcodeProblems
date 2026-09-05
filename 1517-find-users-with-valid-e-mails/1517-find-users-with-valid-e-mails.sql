# Write your MySQL query statement below
Select *
from Users
Where REGEXP_LIKE(mail, '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com$', 'c');