class AxisBankRunner{
	
	public static void main(String bank[]){
		System.out.println("main method started..");
		
		AxisBank.credit(50000.00);
	    double finalValue = AxisBank.getBalance();
        System.out.println("Amount after credit: " + finalValue);
		
		AxisBank.credit(40000.00);
	    finalValue = AxisBank.getBalance();
        System.out.println("Amount after credit: " + finalValue);
		
		AxisBank.credit(20000.00);
	    double anyThing = AxisBank.getBalance();
        System.out.println("Amount after credit: " + anyThing);
		
		AxisBank.debit(1000.00);
	    anyThing = AxisBank.getBalance();
        System.out.println("Amount after credit: " + anyThing);
		
		
	}
}