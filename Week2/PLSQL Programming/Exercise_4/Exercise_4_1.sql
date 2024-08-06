CREATE OR REPLACE FUNCTION CalculateAge(date_of_birth DATE) RETURN NUMBER IS
    age NUMBER;
BEGIN
    age := TRUNC(MONTHS_BETWEEN(SYSDATE, date_of_birth) / 12);
    RETURN age;
END;
/
