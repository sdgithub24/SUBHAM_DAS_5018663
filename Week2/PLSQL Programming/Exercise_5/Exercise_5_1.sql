CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
AFTER INSERT ON customers
FOR EACH ROW
BEGIN
    INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
    VALUES (1, 'John Doe', TO_DATE('1985-05-15', 'YYYY-MM-DD'), 1000, SYSDATE);

END;
