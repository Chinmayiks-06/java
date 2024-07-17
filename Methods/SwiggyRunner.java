class SwiggyRunner{
	
	public static void main(String foo[]){
	
	System.out.println("main method started");
	
	    String foodName = "Biryani";
		double foodPrice = Swiggy.takeOrder(foodName);
		System.out.println("Price of "+foodName+" is "+foodPrice);
	    
		//System.out.println("Price of Pizza: " + Swiggy.takeOrder("Pizza"));
        //System.out.println("Price of Burger: " + Swiggy.takeOrder("Burger"));
        //System.out.println("Price of Pasta: " + Swiggy.takeOrder("Pasta"));
        
		foodPrice = Swiggy.takeOrder(foodName,3);
		System.out.println("Price of "+foodName+" is "+foodPrice);
		
		

		
	System.out.println("main method ended");

		
	}
}