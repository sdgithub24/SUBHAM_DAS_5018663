DECLARE
    v_customer_id NUMBER;
    v_balance NUMBER;
    IsVIP varchar2(10);
    
BEGIN
    FOR customer_rec IN (SELECT CustomerID, Balance FROM customers) LOOP
        v_customer_id := customer_rec.CustomerID;
        v_balance := customer_rec.Balance;
        
        IF v_balance > 10000 THEN
            IsVIP := 'TRUE';
        END IF;
    END LOOP;
END;
/
