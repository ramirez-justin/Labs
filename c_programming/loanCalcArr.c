#include <stdio.h>
#include <math.h>

int main() {
    // Create all the variables we need
    double loanAmount, interestRate, monthlyRate, monthlyPayment;
    int numPayments, paymentNum;

    // Prompt for original loan amount
    printf("Enter the loan amount: $ ");
    scanf("%lf", &loanAmount);

    // Promt for interest rate
    printf("Enter the interest rate per year (in percent): %% ");
    scanf("%lf", &interestRate);

    // Prompt for number of payments
    printf("Enter the number of payments: ");
    scanf("%d", &numPayments);

    // Calculate the monthly interest rate
    monthlyRate = interestRate / 1200;

    // Calculate the monthly payment
    monthlyPayment = (loanAmount * monthlyRate) / (1 - pow(1 + monthlyRate, -numPayments));

    // Create arrays to store the interest, principal, and balance for each payment
    double interest[numPayments], principal[numPayments], balance[numPayments];

    // Set the initial balance to the loan amount
    balance[0] = loanAmount;

    // Print the table header
    printf("\nMonthly payment should be $%.2lf\n", monthlyPayment);
    printf("======================AMORITIZATION SCHEDULE======================");
    printf("\n#\tPayment\t\tPrincipal\tInterest\tBalance\n");

    // Calculate the interest, principal, and balance for each payment and store them in arrays
    for (paymentNum = 1; paymentNum <= numPayments; paymentNum++) {
        // Calculate the interest and principal for the current payment
        interest[paymentNum-1] = balance[paymentNum-1] * monthlyRate;
        principal[paymentNum-1] = monthlyPayment - interest[paymentNum-1];

        // Calculate the new balance
        balance[paymentNum] = balance[paymentNum-1] - principal[paymentNum-1];

        // Print the row
        printf("%d\t$%.2lf\t\t$%.2lf\t\t$%.2lf\t\t$%.2lf\n", paymentNum, monthlyPayment, principal[paymentNum-1], interest[paymentNum-1], balance[paymentNum]);
    }

    return 0;
}