CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE open_account(p_account_number NUMBER, p_customer_id NUMBER);

    PROCEDURE close_account(p_account_number NUMBER);

    FUNCTION get_total_balance(p_customer_id NUMBER) RETURN NUMBER;
END accountoperations;
/
