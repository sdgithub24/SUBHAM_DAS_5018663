CREATE OR REPLACE PACKAGE EmployeeManagement IS
    FUNCTION CalculateYearlySalary(p_emp_id IN NUMBER) RETURN NUMBER;

    PROCEDURE HireEmployee(
        p_emp_id IN NUMBER,
        p_first_name IN VARCHAR2,
        p_last_name IN VARCHAR2,
        p_salary IN NUMBER
    );

    PROCEDURE UpdateEmployeeDetails(
        p_emp_id IN NUMBER,
        p_new_salary IN NUMBER
    );
END EmployeeManagement;
/