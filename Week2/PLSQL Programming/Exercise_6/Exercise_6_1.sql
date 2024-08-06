DECLARE
    CURSOR GenerateMonthlyStatements  IS
        SELECT TransactionID, Amount 
        FROM transactions
        WHERE TransactionDate >= TRUNC(SYSDATE, 'MONTH')
          AND TransactionDate < ADD_MONTHS(TRUNC(SYSDATE, 'MONTH'), 1);

    v_transaction_id transactions.TransactionID%TYPE;
    v_transaction_amount transactions.Amount%TYPE;
BEGIN
        DBMS_OUTPUT.PUT_LINE('Transaction ' || v_transaction_id || ': $' || v_transaction_amount);
    
    END;
/
