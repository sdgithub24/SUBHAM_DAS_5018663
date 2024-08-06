CREATE OR REPLACE PACKAGE CustomerManagement IS
    FUNCTION get_customer_balance(p_customer_id NUMBER) RETURN NUMBER;
       
     PROCEDURE update_customer(
        p_customer_id NUMBER,
        p_name VARCHAR2,
	p_dob DATE,
	p_balance NUMBER,
	p_lastmodified DATE

    );

 END CustomerManagement;
/
