class DominosRunner{
	public static void main(String food[]){
		
		 String foodName = "Paneer pizza";
		double foodPrice = Dominos.toTakeOrder(foodName);
		System.out.println("Price of "+foodName+" is "+foodPrice);
	    
		foodPrice = Dominos.toTakeOrder(foodName,3);
		System.out.println("Price of "+foodName+" is "+foodPrice);
		
		
		
	}
}
