#include <stdio.h>
#include <math.h>

int main() {
    // Create all the variables we need
    double loanAmount, interestRate, monthlyRate, monthlyPayment, balance, principal, interest;
    int numPayments, paymentNum;

    // Prompt for original loan amount
    printf("Enter the loan amount: $ ");
    scanf("%lf", &loanAmount);

    // Promt for interest rate
    printf("Enter the interest rate per year(in percent): %% ");
    scanf("%lf", &interestRate);

    // Prompt for number of payments
    printf("Enter the number of payments: ");
    scanf("%d", &numPayments);

    // Calculate the monthly interest rate
    monthlyRate = interestRate / 1200;

    // Calculate the monthly payment
    monthlyPayment = (loanAmount * monthlyRate) / (1 - pow(1 + monthlyRate, -numPayments));

    // Print the table header
    printf("\nMonthly payment should be $%.2lf\n", monthlyPayment);
    printf("======================AMORITIZATION SCHEDULE======================");
    printf("\n#\tPayment\t\tPrincipal\tInterest\tBalance\n");

    // Set the initial balance to the loan amount
    balance = loanAmount;

    // Print each row of the table
    for (paymentNum = 1; paymentNum <= numPayments; paymentNum++) {
        // Calculate the interest and principal for the current payment
        interest = balance * monthlyRate;
        principal = monthlyPayment - interest;

        // Calculate the new balance
        balance -= principal;

        // Print the row
        printf("%d\t$%.2lf\t\t$%.2lf\t\t$%.2lf\t\t$%.2lf\n", paymentNum, monthlyPayment, principal, interest, balance);
    }

    return 0;
}