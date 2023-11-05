--Part 1
-- id (int PK), employer (varchar255), name (varchar255), skills (varchar255)
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