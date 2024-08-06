CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loan_amount NUMBER,
    p_interest_rate NUMBER,
    p_loan_duration_years NUMBER
) RETURN NUMBER IS
    v_loan_duration_months NUMBER;
    v_monthly_interest_rate NUMBER;
    v_monthly_payment NUMBER;
BEGIN
    v_loan_duration_months := p_loan_duration_years * 12;

    v_monthly_interest_rate := p_interest_rate / 12;

    v_monthly_payment := (p_loan_amount * v_monthly_interest_rate) /
                         (1 - POWER(1 + v_monthly_interest_rate, -v_loan_duration_months));

    RETURN v_monthly_payment;
END;
/
