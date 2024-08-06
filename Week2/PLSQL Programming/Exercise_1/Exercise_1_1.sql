DECLARE
    v_customer_id NUMBER;
    v_customer_age NUMBER;
    v_loan_interest_rate NUMBER;
BEGIN
    FOR customer_rec IN (SELECT Customers.CustomerID ,round((current_date-Customers.DOB)*0.00273973) as age, Loans.InterestRate FROM customers,Loans where Customers.CustomerID = Loans.CustomerID)
    LOOP
        v_customer_id := customer_rec.CustomerID;
        v_customer_age := customer_rec.age;
        v_loan_interest_rate := customer_rec.InterestRate;

        IF v_customer_age > 60 THEN
            v_loan_interest_rate := v_loan_interest_rate * 0.99;
        END IF;

        UPDATE Loans
        SET InterestRate = v_loan_interest_rate
        WHERE CustomerID = v_customer_id;
    END LOOP;
END;
