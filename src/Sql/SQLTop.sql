*Its a Practice Set For Top 50 Sql Queries which ask in Technical Assesment *

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


1.Print All Records in Sql EmployeeDetails Table
    SELECT * FROM Table_Name;

2.Print All Records Who Employee ID 1
    SELECT * FROM Table_Name
    WHERE EmpId =1;

3. Print Details of all Employee whose EmpID is 100 and city is jhasi
    Select * from Employee_Details_Table
    where EmpId=100 and city='jhasi';

4.Print All Project Available in Employee_Salary_Table
    Select DISTINCT(Project) from Employee_Salary_Table; {Distinct=All different}

5.Fetch count of Employee who working on Project p1
    select count(*) from Employee_Salary_Table
    where project='p1';

6.Write a Sql query to find the maximum, minimum and average Salary of Employee
    Select MAX(Salary), MIN(Salary), AVG(Salary) from Employee_Salary_Table;

7.Write Sql Query to find employee_id whose Salary lies in the range of 9000 and 15000
    Select EmpId, Salary from Employee_Salary_Table
    where Salary between 9000 and 15000;

8. Print All employee id who live in jahasi and Manger_id is 100
    Select EmpId from Employee_Details_Table
    where city="jhasi" and MangerId=100;

9.Write A sql query to fetch all employee who work on Project other than P2
    Select project from Employee_Salary_Table
    where Not Project="P2";

10.Write a Sql query to display the total salary of each employee adding the salary with variable value
    Select EmpId, Salary+Variable as total_salary
    From Employee_Salary_Table;

11.Write a Sql query to display the names of the employee where second letter of the name is a
    Select FullName from Employee_Details_Table
    where FullName Like '_a%';

12.Write a sql query to fetch all Emp_id which present in either of the table - Employee_Details_Table and Employee_Salary_Table
    select Emp_id from Employee_Details_Table
    Union
    select Emp_id from Employee_Salary_Table;

13.