DECLARE
    CURSOR ApplyAnnualFee IS
        SELECT AccountID, Balance
        FROM accounts;
    v_account_number accounts.AccountID%TYPE;
    v_balance accounts.Balance%TYPE;
    v_annual_fee CONSTANT NUMBER := 100; 
BEGIN
    FOR rec IN ApplyAnnualFee
    LOOP
        v_account_number := rec.AccountID;
        v_balance := rec.Balance;
        
        v_balance := v_balance - v_annual_fee;
        
        UPDATE accounts
        SET balance = v_balance
        WHERE AccountID = v_account_number;
        
    END LOOP;
END;
/
