class Swiggy{
	
	public static double takeOrder(String foodName){
		double price=0.0;
	//	if (foodName.equalsIgnoreCase("Pizza")){
		
		if(foodName=="Pizza"){
			price =99.00;
			return price;
		}
		
		//another method to do 
		//if(foodName=="Burger")	return 120.00;
		//if(foodName=="Chocolate Ice Cream") return 80.00;
		
		if(foodName=="Biryani"){
			price=250.00;
			return price;
		}
		if(foodName=="Grill Chicken"){
		price= 360.00;
		return price;
		}
		if(foodName=="Dairy Milk"){
		price= 200.00;
		return price;
		}
		if(foodName=="Momos"){
		price = 160.00;
		return price;
		}
		if(foodName=="Chicken Popcorn"){
		price = 360.00;
		return price;
		}
		if(foodName=="Potato Chips"){
		price = 60.00;
		return price;
		}
		if(foodName=="French Fries"){
		price = 90.00;
		return price;
		}
		if(foodName=="Gobi Manchurian"){
		price= 120.00;
		return price;
		}
		if(foodName=="Paneer Manchurian"){
		price=140.00;
		return price;
		}
		if(foodName=="Veg fried Rice"){
		price = 100.00;
		return price;
		}
		if(foodName=="Curd Rice"){
		price=260.00;
		return price;
		}
		if(foodName=="Non-veg Combo"){
	    price= 560.00;
		return price;
		}else{
			System.out.println(foodName + " Not Found");
		}
		   return 0.0;
	}
	
	
	public static double takeOrder(String foodName,int quantity){
		double price=0.0;
		if(foodName=="Pizza"){
			price=99.00 * quantity;
			return price;
		}
		
		if(foodName=="Biryani"){
			price=250.00*quantity;
			return price;
		}
		
		if(foodName =="Non-veg Combo"){
			price=560.00*quantity;
			return price;
		}
		if(foodName=="Biryani"){
			price=250.00*quantity;
			return price;
		}
		if(foodName=="Grill Chicken"){
		price= 360.00*quantity;
		return price;
		}
		if(foodName=="Dairy Milk"){
		price= 200.00*quantity;
		return price;
		}
		if(foodName=="Momos"){
		price = 160.00*quantity;
		return price;
		}
		if(foodName=="Chicken Popcorn"){
		price = 360.00*quantity;
		return price;
		}
		if(foodName=="Potato Chips"){
		price = 60.00*quantity;
		return price;
		}
		if(foodName=="French Fries"){
		price = 90.00*quantity;
		return price;
		}
		if(foodName=="Gobi Manchurian"){
		price= 120.00*quantity;
		return price;
		}
		if(foodName=="Paneer Manchurian"){
		price=140.00*quantity;
		return price;
		}
		if(foodName=="Veg fried Rice"){
		price = 100.00*quantity;
		return price;
		}
		if(foodName=="Curd Rice"){
		price=260.00*quantity;
		return price;
		}
	return price;
	}	
}