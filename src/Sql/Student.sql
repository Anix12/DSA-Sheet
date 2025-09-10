-- Students Table
+-----------+----------------+-------------+------------+---------+
| StudentId | FullName       | Department  | JoinDate   | City    |
+-----------+----------------+-------------+------------+---------+
| 1         | Aman Verma     | Computer    | 2021-01-15 | Mumbai  |
| 2         | Riya Sharma    | Mechanical  | 2020-07-23 | Pune    |
| 3         | Mohit Agarwal  | Electrical  | 2019-09-12 | Delhi   |
| 4         | Neha Patil     | Computer    | 2022-11-05 | Nagpur  |
| 5         | Rajesh Gupta   | Civil       | 2021-03-30 | Mumbai  |
+-----------+----------------+-------------+------------+---------+


-- Marks Table
+-----------+---------+-------+-------+
| StudentId | Subject | Marks | Grade |
+-----------+---------+-------+-------+
| 1         | DBMS    | 85    | A     |
| 1         | DSA     | 78    | B     |
| 2         | DBMS    | 92    | A+    |
| 2         | DSA     | 88    | A     |
| 3         | DBMS    | 67    | C     |
| 3         | DSA     | 72    | B     |
| 4         | DBMS    | 95    | A+    |
| 5         | DSA     | 56    | D     |
+-----------+---------+-------+-------+

Q1. Print all records in Students.

Select * from Student;

Q2. Print all records where StudentId = 1.
Select * from StudentTable
Where StudentId=1;

Q3. Print details of all students whose StudentId = 100 and City = 'Pune'.
Select * from StudentTable
Where StudentId=100 and city='Pune';

Q4. Print all subjects available in Marks.
Select DISTINCT(Subject) from MarksTable

Q5. Fetch count of students who appeared in DBMS.
Select count(Subject) from MarksTable
Where Subject='DBMS'

Q6. Write a query to find the maximum, minimum, and average marks in Marks.
Select MAX(Marks), MIN(Marks), AVG(Marks)
From MarksTable;

Q7. Write a query to find StudentIds whose Marks lie between 70 and 90.
Select StudentId from MarksTable
Where Marks BETWEEN 70 and 90

Q8. Print all StudentIds who live in Mumbai and are in Mechanical department.
Select StudentId from StudentTable
Where city='Mumbai' and Department='Mechanical'

Q9. Write a query to fetch all students who appeared in subjects other than DSA.
Select * from MarksTable
Where Subject != 'DSA'

Q10. Display StudentId and total marks (Marks column only, assume Grade is bonus later).
Select StudentId, Sum(Marks)
from MarksTable
Group BY StudentId;
