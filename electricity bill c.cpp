#include <stdio.h>

int main() {
    int customerId;
    char customerName[50];
    float units, bill;

    printf("Enter Customer ID: ");
    scanf("%d", &customerId);

    printf("Enter Customer Name: ");
    scanf("%s", customerName);

    printf("Enter Units Consumed: ");
    scanf("%f", &units);

    if (units <= 100) {
        bill = units * 1.5;
    }
    else if (units <= 300) {
        bill = (100 * 1.5) + ((units - 100) * 2.5);
    }
    else {
        bill = (100 * 1.5) + (200 * 2.5) + ((units - 300) * 4.0);
    }

    printf("\n----- Electricity Bill -----\n");
    printf("Customer ID   : %d\n", customerId);
    printf("Customer Name : %s\n", customerName);
    printf("Units Used    : %.2f\n", units);
    printf("Bill Amount   : Rs. %.2f\n", bill);

    return 0;
}
