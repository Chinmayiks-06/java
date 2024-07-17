class FiveStarChicken{
	public static double toTakeOrder(String foodName){
		if(foodName == "Chicken Strips"){
			return 70.00;
		}
		if(foodName =="Noodles"){
			return 130.00;
		}
		if(foodName == "Chicken Crunchy Masala"){
			return 60.00;
		}
		if(foodName =="Chicken roll"){
			return 140.00;
		}
		if(foodName == "Krisper roll"){
			return 120.00;
		}
		if(foodName == "Seekh roll"){
			return 230.00;
		}
		if(foodName == "Cheese Chicken shots"){
			return 40.00;
		}
		if(foodName == "Chicken Fingers"){
			return 120.00;
		}
		if(foodName == "Chicken nuggets"){
			return 100.00;
		}
		if(foodName == "Chicken Popcorn"){
			return 60.00;
		}
		if(foodName == "Chicken sticks"){
			return 40.00;
		}
		if(foodName == "nachos"){
			return 50.00;
		}
		if(foodName == "Burger"){
			return 50.00;
		}else{
			System.out.println("not found");
			return 0.0;
		}
		
	}
}