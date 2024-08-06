CREATE OR REPLACE PROCEDURE UpdateSalary(p_emp_id IN NUMBER, p_percentage IN NUMBER) AS
    v_new_salary NUMBER;
BEGIN
    SELECT Salary * (1 + p_percentage / 100) INTO v_new_salary
    FROM employees
    WHERE EmployeeID  = p_emp_id;

    UPDATE employees
    SET Salary = v_new_salary
    WHERE EmployeeID = p_emp_id;

    COMMIT;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Employee with ID ' || p_emp_id || ' not found.');
    END;
/
