CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
    VALUES (4, 4, SYSDATE, 200, 'Deposit');

   
    --INSERT INTO AuditLog (TransactionId)
	--VALUES(4);
    END;
