class Zepto{
	public static double toTakeOrder(String foodName){
		if(foodName == "Masala Dosa"){
			return 70.00;
		}
		if(foodName =="Noodles"){
			return 130.00;
		}
		if(foodName == "Cake"){
			return 60.00;
		}
		if(foodName == "Shawarma"){
			return 140.00;
		}
		if(foodName == "Milkshake"){
			return 120.00;
		}
		if(foodName == "Paneer"){
			return 230.00;
		}
		if(foodName == "Idli"){
			return 40.00;
		}
		if(foodName == "Pastry"){
			return 120.00;
		}
		if(foodName == "Pav Bhaji"){
			return 100.00;
		}
		if(foodName == "Juice"){
			return 60.00;
		}
		if(foodName == "Coffee"){
			return 40.00;
		}
		if(foodName == "Falooda"){
			return 50.00;
		}
		if(foodName == "Kachori"){
			return 50.00;
		}else{
			System.out.println("not found");
			return 0.0;
		}
		
	}
}
	
