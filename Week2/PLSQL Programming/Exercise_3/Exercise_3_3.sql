CREATE OR REPLACE PROCEDURE TransferFunds (sender_id NUMBER,receiver_id NUMBER,amount NUMBER) AS
balance_var NUMBER;
BEGIN
    SELECT Balance INTO balance_var FROM accounts WHERE CustomerID = sender_id;
    IF balance_var >=amount  THEN
        UPDATE accounts SET Balance  = balance - amount WHERE CustomerID = sender_id;
        UPDATE accounts SET Balance  = balance + amount WHERE CustomerID = receiver_id;
        COMMIT;
    END IF;
END;
