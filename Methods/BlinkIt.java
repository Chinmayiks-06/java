class BlinkIt{
	public static double toTakeOrder(String foodName){
		if(foodName == "Soya Chunks"){
			return 70.00;
		}
		if(foodName =="Makhana"){
			return 130.00;
		}
		if(foodName == "Chia Seeds"){
			return 60.00;
		}
		if(foodName == "Pumpkin Seeds"){
			return 140.00;
		}
		if(foodName == "Frozen Green Peas"){
			return 120.00;
		}
		if(foodName == "Paneer Pakoda"){
			return 230.00;
		}
		if(foodName == "Chicken Nuggets"){
			return 40.00;
		}
		if(foodName == "Coconut Biscuits"){
			return 120.00;
		}
		if(foodName == "veg biryani"){
			return 100.00;
		}
		if(foodName == "wraps"){
			return 60.00;
		}
		if(foodName == "masalpuri"){
			return 40.00;
		}
		if(foodName == "bhelpuri"){
			return 50.00;
		}
		if(foodName == "Ground nuts"){
			return 50.00;
		}
		if(foodName == "Somosa"){
			return 50.00;
		}else{
			System.out.println("not found");
			return 0.0;
		}
		
	}
}
	

	