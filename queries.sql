-- Part 1: Test it with SQL
--CREATE TABLE job (
SELECT * FROM jobs;
-- Part 2: Test it with SQL
SELECT name FROM employer WHERE location = "St. Louis City";
-- Part 3: Test it with SQL
DROP TABLE job;
-- Part 4: Test it with SQL
SELECT * FROM skill
INNER JOIN job ON skill.name = job.name;
WHERE job.skill IS NOT NULL
ORDER BY name ASC;

