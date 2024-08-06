
CREATE OR REPLACE PROCEDURE  SafeTransferFunds(sender_id NUMBER,receiver_id NUMBER,amount NUMBER) AS	
    sender_balance NUMBER;
BEGIN    
    SELECT Balance INTO sender_balance FROM accounts WHERE CustomerID = sender_id;
    IF sender_balance < amount THEN
       	DBMS_OUTPUT.PUT_LINE('Insufficient balance');
    END IF;

    UPDATE accounts SET Balance  = Balance - amount WHERE CustomerID = sender_id;
    UPDATE accounts SET Balance  = Balance + amount WHERE CustomerID = receiver_id;

    COMMIT;
END;




