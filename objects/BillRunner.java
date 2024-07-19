class BillRunner{
	
	public static void main(String paid[]){
		
		Bill bill=new Bill();
		boolean billCreated = bill.createBill(2345,"17-06-2024","17-07-2024",true,false);
		
		bill.displayBillInfo();
		
		Bill bill1 = new Bill();
		billCreated=bill.createBill(2345,"17-06-2024","17-07-2024",false,true);
		
		bill.displayBillInfo();
		
		
	}
	}