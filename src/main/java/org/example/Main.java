package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Purchase
        class Purchase {
            private int invoiceNumber;
            private double saleAmount;
            private double salesTax;

            // Constructor
            public Purchase(int invoiceNumber, double saleAmount) {
                this.invoiceNumber = invoiceNumber;
                setSaleAmount(saleAmount); // This will also set the sales tax
            }

            // Set method for invoice number
            public void setInvoiceNumber(int invoiceNumber) {
                this.invoiceNumber = invoiceNumber;
            }

            // Set method for sale amount and calculate sales tax
            public void setSaleAmount(double saleAmount) {
                this.saleAmount = saleAmount;
                calculateSalesTax(); // Calculate sales tax whenever sale amount is set
            }

            // Calculate sales tax (5% of sale amount)
            private void calculateSalesTax() {
                this.salesTax = 0.05 * saleAmount;
            }

            // Display method for purchase details
            public void display() {
                System.out.printf("Invoice Number: %d%n", invoiceNumber);
                System.out.printf("Sale Amount: $%.2f%n", saleAmount);
                System.out.printf("Sales Tax: $%.2f%n", salesTax);
            }
        }

        //PurchaseArray
        class PurchaseArray {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                org.example.Purchase[] purchases = new org.example.Purchase[5];

                for (int i = 0; i < purchases.length; i++) {
                    int invoiceNumber = getValidInvoiceNumber(input);
                    double saleAmount = getValidSaleAmount(input);
                    purchases[i] = new org.example.Purchase(invoiceNumber, saleAmount);
                }

                // Display details for all purchases
                System.out.println("\nPurchase Details:");
                for (org.example.Purchase purchase : purchases) {
                    purchase.display();
                    System.out.println(); // New line for better readability
                }

                input.close();
            }

            // Method to get a valid invoice number from user
            private static int getValidInvoiceNumber(Scanner input) {
                int invoiceNumber;
                while (true) {
                    System.out.print("Enter invoice number (1000 to 8000): ");
                    invoiceNumber = input.nextInt();
                    if (invoiceNumber >= 1000 && invoiceNumber <= 8000) {
                        break;
                    } else {
                        System.out.println("Invalid invoice number. Please enter a number between 1000 and 8000.");
                    }
                }
                return invoiceNumber;
            }

            // Method to get a valid sale amount from user
            private static double getValidSaleAmount(Scanner input) {
                double saleAmount;
                while (true) {
                    System.out.print("Enter sale amount (non-negative): ");
                    saleAmount = input.nextDouble();
                    if (saleAmount >= 0) {
                        break;
                    } else {
                        System.out.println("Invalid sale amount. Please enter a non-negative value.");
                    }
                }
                return saleAmount;
            }
        }



    }
}