CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department VARCHAR2,
    p_bonus_percentage IN NUMBER
) AS
BEGIN
    UPDATE employees
    SET Salary = Salary * (1 + p_bonus_percentage / 100)
    WHERE Department = p_department;
END;
/
