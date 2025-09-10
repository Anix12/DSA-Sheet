Employee_Details_Table
+--------+----------------+-----------+--------------+-----------+
| EmpId  | FullName       | ManagerId | DateOfJoining| City      |
+--------+----------------+-----------+--------------+-----------+
| 1      | Praful Sharma  | 100       | 01/31/2019   | Jhansi    |
| 2      | Manglam Sen    | 105       | 01/30/2023   | Kolkata   |
| 3      | Mohit Agarwal  | 107       | 27/11/2022   | New Delhi |
+--------+----------------+-----------+--------------+-----------+

Employee_Salary_Table
+--------+---------+--------+----------+
| EmpId  | Project | Salary | Variable |
+--------+---------+--------+----------+
| 1      | P1      | 8000   | 400      |
| 3      | P2      | 7000   | 1000     |
| 4      | P1      | 12000  | 0        |
+--------+---------+--------+----------+

Select CONCAT(EmpId, ManagerId) as EmployeeManager from Employee_Details_Table

select UPPER(FullName), LOWER(City) from Employee_Details_Table

Select FullName from Employee_Details_Table
where EmpId In(
                Select EmpId from Employee_Salary_Table
                Where Salary between 5000 and 10000
                )

Select MID(FullName , 1 , LOCATE('', FullName ))
from Employee_Details_Table