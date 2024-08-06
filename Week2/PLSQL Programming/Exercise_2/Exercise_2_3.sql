CREATE OR REPLACE PROCEDURE AddNewCustomer(v_CustomerId NUMBER ,CustomerName VARCHAR) AS 
	v_data NUMBER ;
BEGIN 
    SELECT CustomerId INTO v_data FROM customers WHERE CustomerId = v_CustomerId;
    IF v_data !=NULL THEN
	DBMS_OUTPUT.PUT_LINE('Customer already exists'); 
    END IF;

END;
