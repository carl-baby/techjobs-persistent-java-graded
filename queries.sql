-- Part 1: Test it with SQL
--CREATE TABLE job (
SELECT * FROM jobs;
-- Part 2: Test it with SQL
SELECT name FROM employer WHERE location = "St. Louis City";
-- Part 3: Test it with SQL
DROP TABLE job;
-- Part 4: Test it with SQL
SELECT * FROM skill
LEFT JOIN job_skills
ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL

ORDER BY name ASC;


--SELECT column_name(s)
--FROM table1
--FULL OUTER JOIN table2
--ON table1.column_name = table2.column_name
--WHERE condition;
