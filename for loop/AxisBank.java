class AxisBank{
	
	static double balance;
	
	public static void debit(double amount){
		System.out.println("debit started..");
		if(amount <= balance){
		balance=balance-amount;
		}else{
		System.out.println("Insufficient balance");
		}
	    System.out.println("debit ended..");
    return;	
	}
	
	public static void credit(double amount){
		System.out.println("credit started..");
		if(amount > 0){
        	balance=balance+amount;
		}else{
			System.out.println("Amount can't be zero");
		} 
		System.out.println("credit ended..");
	return;
	}
	
	public static double getBalance(){
		
		System.out.println("Fetching balance...");
		
		return balance;
	}
}
		