DECLARE
    v_due_date DATE;
    v_customer_id NUMBER;
BEGIN
      FOR loan_rec IN (SELECT CustomerID, EndDate FROM loans WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30) LOOP
        v_customer_id := loan_rec.CustomerID;
        v_due_date := loan_rec.EndDate;
        DBMS_OUTPUT.PUT_LINE('Reminder for customer ' || v_customer_id || ': Loan due on ' || v_due_date);
    END LOOP;
END;
/
