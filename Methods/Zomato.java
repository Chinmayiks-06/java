class Zomato{
	
	public static double toTakeOrder(String foodName){
		double price = 0.0;
		if(foodName == "Masala Dosa"){
			price=70.00;
			return price;
		}
		if(foodName =="Noodles"){
			price= 130.00;
			return price;
		}
		if(foodName == "Cake"){
			price=60.00;
			return price;
		}
		if(foodName == "Shawarma"){
			price=140.00;
			return price;
		}
		if(foodName == "Milkshake"){
			price=120.00;
			return price;
		}
		if(foodName == "Paneer"){
			price = 230.00;
			return price;
		}
		if(foodName == "Idli"){
			price= 40.00;
			return price;
		}
		if(foodName == "Pastry"){
			price= 120.00;
			return price;
		}
		if(foodName == "Pav Bhaji"){
			price=100.00;
			return price;
		}
		if(foodName == "Juice"){
			price= 60.00;
			return price;
		}
		if(foodName == "Coffee"){
			price=40.00;
			return price;
		}
		if(foodName == "Falooda"){
			price=50.00;
			return price;
		}
		if(foodName == "Kachori"){
			price=50.00;
			return price;
		}else{
			System.out.println("not found");
			return 0.0;
		}		
	}
	
	public static double toTakeOrder(String foodName,int quantity){
		
		double price = 0.0;
		if(foodName=="Masala Dosa"){
			price = 70*quantity;
			return price;
		}
		if(foodName =="Noodles"){
			price= 130.00*quantity;
			return price;
		}
		if(foodName == "Cake"){
			price=60.00*quantity;
			return price;
		}
		if(foodName == "Shawarma"){
			price=140.00*quantity;
			return price;
		}
		if(foodName == "Milkshake"){
			price=120.00*quantity;
			return price;
		}
		if(foodName == "Paneer"){
			price = 230.00*quantity;
			return price;
		}
		if(foodName == "Idli"){
			price= 40.00*quantity;
			return price;
		}
		if(foodName == "Pastry"){
			price= 120.00*quantity;
			return price;
		}
		if(foodName == "Pav Bhaji"){
			price=100.00*quantity;
			return price;
		}
		if(foodName == "Juice"){
			price= 60.00*quantity;
			return price;
		}
		if(foodName == "Coffee"){
			price=40.00*quantity;
			return price;
		}
		if(foodName == "Falooda"){
			price=50.00*quantity;
			return price;
		}
		if(foodName == "Kachori"){
			price=50.00*quantity;
			return price;
		}
     return  price;
	}
	
}
	

	
	
	
	
	
	
	
	
	
	
	