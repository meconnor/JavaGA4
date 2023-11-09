--Part 1
-- List the columns and their respective data types in the job table that was created
-- id (int PK), employer (varchar255), name (varchar255), skill/s (varchar255)
--Part 2
SELECT name
 FROM employer
 WHERE location = "St. Louis City";
--Part 3
DROP TABLE job;
--Part 4
SELECT *
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;
--