class Bill {
    int billId;
    String billDueDate;
    String billIssueDate;
    boolean isBillPaid;
    boolean isLatestBillPaid;


    public boolean createBill(int billId, String billIssueDate, String billDueDate, boolean isBillPaid, boolean isLatestBillPaid) {
        boolean isBillCreated = false;
        if (billId > 0 && billIssueDate != null && billDueDate != null) {
            this.billId = billId;
            this.billIssueDate = billIssueDate;
            this.billDueDate = billDueDate;
            this.isBillPaid = isBillPaid;
            this.isLatestBillPaid = isLatestBillPaid;
            isBillCreated = true;
        }
        return isBillCreated;
    }

    public void displayBillInfo() {
        System.out.println("The Bill Id is " + this.billId);
        System.out.println("The Bill Issue Date is " + this.billIssueDate);
        System.out.println("The Bill Due Date is " + this.billDueDate);
        System.out.println("Is Bill Paid: " + this.isBillPaid);
        System.out.println("Is Latest Bill Paid: " + this.isLatestBillPaid);
    }

   
}
