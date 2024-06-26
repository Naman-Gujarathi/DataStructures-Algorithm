# Write your MySQL query statement below

SELECT
 p.project_id, Round(Avg(experience_years), 2) as average_years 
FROM
 Project p 
JOIN
 Employee e  on p.employee_id = e.employee_id 
GROUP BY
 p.project_id;

