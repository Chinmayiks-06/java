class Bill{
	
	static int billId = 101;
	static String billIssueDate = "28/06/2024";
	static String billDueDate="03/07/2024";
		
	public static void main(String airtellBill []){
		
		boolean isBillPaid=false;
		boolean isLatestBill=true;
		
		System.out.println("The Bill id is: "+billId);
		System.out.println("The Bill is issued on :"+billIssueDate);
		System.out.println("The bill due date on :"+billDueDate);
		System.out.println("The bill was paid:"+isBillPaid);
	}
}