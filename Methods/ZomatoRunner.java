class ZomatoRunner{
	public static void main(String food[]){
		
		String foodName="Cake";
		double price = Zomato.toTakeOrder(foodName);
		
		System.out.println("Cake price is: "+price);
		
		price =Zomato.toTakeOrder(foodName,4);
		System.out.println("Cake price is: "+price);
		
		
	}
}