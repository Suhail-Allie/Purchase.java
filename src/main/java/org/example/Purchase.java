package org.example;

    public class Purchase {
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


