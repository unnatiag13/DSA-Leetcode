# Write your MySQL query statement below
SELECT e.name as Employee from Employee e
WHERE  e.salary > (SELECT e2.salary From Employee e2 WHERE e2.id = e.managerId);