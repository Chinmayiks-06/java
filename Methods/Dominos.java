class Dominos{
    public static double toTakeOrder(String foodName){
		
		double price;
		if(foodName == "Paneer pizza"){
			price= 70.00;
			return price;
		}
		if(foodName =="farmhouse pizza"){
			price=130.00;
			return price;
		}
		if(foodName == "veg loaded pizza"){
			price =60.00;
			return price;
		}
		if(foodName == "non-veg loaded pizza"){
			price=40.00;
			return price;
		}
		if(foodName == "Golden Corn"){
			price=120.00;
			return price;
		}
		if(foodName == "Garlic Breadsticks"){
			price= 230.00;
			return price;
		}
		if(foodName == "Indi Chicken Pizza"){
			price=40.00;
			return price;
		}
		if(foodName == "Capcicum pizza"){
			price= 120.00;
			return price;
		}
		if(foodName == "Fresh Veggie pizza"){
			price=100.00;
			return price;
		}
		if(foodName == "Party combo pizza"){
			price= 60.00;
			return price;
		}
		if(foodName == "Mexican Taco"){
			price=40.00;
			return price;
		}
		if(foodName == "Pepper BBQ Chicken"){
			price= 50.00;
			return price;
		}
		if(foodName == "Chicken Wings"){
			price= 50.00;
			return price;
		}else{
			System.out.println("not found");
			return 0.0;
		}
		
		
		
	}
	
	public static double toTakeOrder(String foodName,int quantity){
		double price=0.0;
		if(foodName == "Paneer pizza"){
			price= 70.00*quantity;
			return price;
		}
		if(foodName =="farmhouse pizza"){
			price=130.00*quantity;
			return price;
		}
		if(foodName == "veg loaded pizza"){
			price =60.00*quantity;
			return price;
		}
		if(foodName == "non-veg loaded pizza"){
			price=40.00*quantity;
			return price;
		}
		if(foodName == "Golden Corn"){
			price=120.00*quantity;
			return price;
		}
		if(foodName == "Garlic Breadsticks"){
			price= 230.00*quantity;
			return price;
		}
		if(foodName == "Indi Chicken Pizza"){
			price=40.00*quantity;
			return price;
		}
		if(foodName == "Capcicum pizza"){
			price= 120.00*quantity;
			return price;
		}
		if(foodName == "Fresh Veggie pizza"){
			price=100.00*quantity;
			return price;
		}
		if(foodName == "Party combo pizza"){
			price= 60.00*quantity;
			return price;
		}
		if(foodName == "Mexican Taco"){
			price=40.00*quantity;
			return price;
		}
		if(foodName == "Pepper BBQ Chicken"){
			price= 50.00*quantity;
			return price;
		}
		if(foodName == "Chicken Wings"){
			price= 50.00*quantity;
			return price;
		}
		return price;
	}
		
		
}


