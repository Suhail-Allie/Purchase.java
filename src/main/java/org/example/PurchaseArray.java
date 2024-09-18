package org.example;
import java.util.Scanner;

    public class PurchaseArray {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Purchase[] purchases = new Purchase[5];

            for (int i = 0; i < purchases.length; i++) {
                int invoiceNumber = getValidInvoiceNumber(input);
                double saleAmount = getValidSaleAmount(input);
                purchases[i] = new Purchase(invoiceNumber, saleAmount);
            }

            // Display details for all purchases
            System.out.println("\nPurchase Details:");
            for (Purchase purchase : purchases) {
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


