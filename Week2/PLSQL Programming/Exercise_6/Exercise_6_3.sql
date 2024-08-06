DECLARE
    CURSOR UpdateLoanInterestRates IS
        SELECT  LoanID , InterestRate
        FROM loans
        FOR UPDATE OF InterestRate; 

    v_loan_id loans.LoanID%TYPE;
    v_new_interest_rate NUMBER := 10.0;
BEGIN
    UPDATE loans
    SET InterestRate = v_new_interest_rate
    WHERE LoanID = v_loan_id;
    COMMIT;
END;
/
