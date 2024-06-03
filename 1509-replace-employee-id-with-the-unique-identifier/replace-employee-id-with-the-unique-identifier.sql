# Write your MySQL query statement below


SELECT EU.unique_id, E.name
FROM EmployeeUNI EU
RIGHT JOIN Employees E
ON EU.id = E.id