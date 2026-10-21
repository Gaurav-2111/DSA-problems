# Write your MySQL query statement below
select Students.student_id, student_name, Subjects.subject_name , COUNT(Examinations.student_id) AS attended_exams
from Students
cross join Subjects
left join Examinations
on students.student_id = Examinations.student_id 
AND Subjects.subject_name = Examinations.subject_name
group by student_id , student_name , subject_name
order by student_id , subject_name
;

