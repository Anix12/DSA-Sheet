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

12.Write a Sql query to fetch all Emp_id which present in either of the table - Employee_Details_Table and Employee_Salary_Table
    select Emp_id from Employee_Details_Table
    Union
    select Emp_id from Employee_Salary_Table;

13.Write a Sql query to fetch the EmpId that are present in both the table -Employee_Details_Table and Employee_Salary_Table
    Select Emp_id from Employee_Details_Table
    where EmpId In (select empId from Employee_Salary_Table)

14.Write a Sql query that are Present in Employee_Details_Table but Not in Employee_Salary_Table
    Select Emp_id from Employee_Details_Table
    where EmpId Not In (select EmpId from Employee_Salary_Table)

*15.Write a Sql query that fetch full name of all employee and Replace " " with -
   Select REPLACE(FullName, ' ', '-') from Employee_Details_Table;

*16.Write a Sql query EmpId and ManagerId togther
    Select CONCAT(EmpID, ManagerId) as NewId
    from Employee_Details_Table;

*17.Write a sql query to fetch only the first name(String before Space )from the fullName colum from Employee_Details_Table
    Select MID(FullName, 1, LOCATE('', FullName))
    From Employee_Details_Table;

18.Write a Sql Query which Upper Case the Employee FullName and LowerCase the City NAMES
    Select UPPER(FullName), LOWER(City)
    From Employee_Details_Table

19.//21

*20.Write a sql query in which the employee Name having salary Greater than or equal to 5000 and less than and equal to 10000
    Select FullName from Employee_Details_Table
    where EmpId In (
    Select EmpId from Employee_Salary_Table
    Where Salary between 5000 and 10000
    );


21(2).Write a sql query to fetch all the employee details from the EmployeeDetails table Who joined in year 2022
    Select * from Employee_Details_Table
    where YEAR(DateOfJoining) ='2022';

**22.Write a sql query to fetch all employee records from the EmployeeDetails table who have a salary record in Employee_Salary_Table
    Select * from Employee_Details_Table E
    Where EXISTS (
    Select * from Employee_Salary_Table S
    where E.EmpId = s.EmpId
    )

**23.Write a Sql query to fetch all employee who are also manager from Employee_Details_Table
    Select DISTINCT E.FullName
    from Employee_Details_Table E
    INNER Join
    Employee_Details_Table M
    On E.EmpId = M.MangerId;

24.Write a Sql query to fetch records from Employee_Details_Table where ManagerId is Coming More than Once
    Select * from Employee_Details_Table
    Where ManagerId In (
    Select ManagerId from Employee_Details_Table
    Group By ManagerId
    Having count(ManagerId)>1
    );

25.Write a Sql query to fetch only odd rows from the table
    Select EmpId, Project, Salary
    From (
    Select *, ROW_NUMBER() OVER(Order By EmpId) as RowNumber
    ) E
    Where E.RowNumber % 2 = 1;

   //If Question say find odd even based on any particular parameter like in this they sort based on EmpId
    Select * from Employee_Salary_Table
    Where MOD(EmpId, 2)=1;

26.Write a Sql Query to fetch only Even Number From table
    Select EmpId, Project, Salary
    From (
    Select *, ROW_NUMBER() OVER(Order By EmpId) as RowNumber
    ) E
    Where E.RowNumber % 2 = 0;

   //If Question say find even based on any particular parameter
    Select * from Employee_Salary_Table
    Where MOD(EmpId, 2)=0;

27. Write an Sql query to create a new table with data structure copied from another table
    Create table NewTable
    Select * from Employee_Details_Table;

28.Write a Sql query to fetch Top 3 records from table //Top 3
    Select * from Employee_Details_Table
    Order By Salary DESC Limit 3;
    //what if they ask lower 3

29.Write Sql query to find the 3rd highest Salary from table
    //with keyword
    Select DISTINCT Salary
    from Employee_Salary_Table
    Order by Salary DESC
    Limit 1 OFFSET 1; //Skip the first once and return 2

30.Order Employee Names Based on Alphabetical Order
    Select FullName from Employee_Details_Table
    Order By FullName;

31.Order Employee Names And Salary Based on Salary
    Select FullName, Salary from Employee_Details_Table E, Employee_Salary_Table ES
    Where E.EmpId = ES.EmpId
    Order By ES.Salary;

    //best
    SELECT E.FullName, S.Salary
    FROM Employee_Details_Table E
    JOIN Employee_Salary_Table S ON E.EmpId = S.EmpId
    ORDER BY S.Salary;

33.Print Total Salary Going From Each project
    Select Es.Project, Es.Salary from Employee_Salary_Table ES
    Group by Es.Project;

34.Print All Employee details Whose Joining Data is Not in Last YEAR
    Select * from Employee_Details_Table
    Where (DateOfJoining < current_Date - INTERVAL 1 year);

35.Print All Employee Who gets Paid Above Average Salary
    Select * from Employee_Details_Table E, Employee_Salary_Table ES
    Where E.EmpId=ES.EmpId
    and ES.salary > (Select avg(salary) from Employee_Salary_Table);

    Select * from Employee_Details_Table E
    Join Employee_Salary_Table ES
    On E.EmpId = Es.EmpId
    and ES.salary > (Select avg(salary) from Employee_Salary_Table);
