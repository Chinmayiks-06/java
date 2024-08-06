class Dmart{

      static String vegetables[] ={"Carrot","Beans","Potato","Tomato","CauliFlower","Ladies Finger"};
	  static String groceries[] = {"Spices","Dals","Pulses","Dry Fruits","Cooking Oil"};
	  static String packagedFoods[] = {"Biscuits and Cookies","Snacks and Farsans","Breakfast Cereals","Chocolates and Candies","Ketchup & Sauce"};
      static String fruits[] ={"Pomogranate","Mango","Apple","Banana","Grapes"};
	  static String cosmetics[] = {"Nail Polish","Lipstick","LipBalm","Concealer"};
	  static String appliances[] = {"Air conditioners", "dishwashers","clothes dryers","drying cabinets","freezers"};
	  static String beverages[] ={"soda pop","sparkling water","iced tea","lemonade","root beer"};
	  static String dairies[] = {"Milk","Cream","Butter","Yogurt","Cheese"};
	  static String womenCloths[] = {"Skirts","shirts","sweaters","trousers","coats"};
	  static String handbags[] = {"Purse","Tote bag","Shoulder Bag","Hobo Bag","Bucket Bag"};
	  static String electricalGadgets[] ={"Digital Watches","Robots","Mobile Phones","Computers"};
	  static String skinCare[] ={"Face wash","Moisturizer","SunScreen","Serum","LipBalm"};
	  static String footwear[] = {"Casual Shoes","Ethnic Shoes","Formal Shoes","Party Shoes","Sports Shoes"};
	  static String babycare[] ={"Baby Shampoo","Baby Wipes","Pampers","Baby Monitor","Baby Oil"};
	  static String kidsEssentials[] = {"Notebooks","Diary","Glue","Drawing Accessories","Stationery Sets"};

	 
	   public static void main(String newCollection[]){
		
	    System.out.println("Vegetables Available are: ");
		for(int index=0;index <= vegetables.length -1; index++){
		System.out.println(vegetables[index]);
		}	
  
        System.out.println("Groceries available for: ");
        for(int index=0;index <= groceries.length-1;index++){
        System.out.println(groceries[index]);
		}

        System.out.println("packagedFoods available for: ");
        for(int index=0;index <= packagedFoods.length-1;index++){
        System.out.println(packagedFoods[index]);
		}
		
        System.out.println("Fruits available for: ");
        for(int index=0;index <= fruits.length-1;index++){
        System.out.println(fruits[index]);
		}
		
        System.out.println("cosmetics available for: ");
        for(int index=0;index <= cosmetics.length-1;index++){
        System.out.println(cosmetics[index]);		
		}
		
		System.out.println("Appliances available for: ");
        for(int index=0;index <=appliances.length-1;index++){
        System.out.println(appliances[index]);
		}
		
		System.out.println("beverages available for: ");
        for(int index=0;index <= beverages.length-1;index++){
        System.out.println(beverages[index]);
		}
		
		System.out.println("dairies available for: ");
        for(int index=0;index <= dairies.length-1;index++){
        System.out.println(dairies[index]);
		}
		
		System.out.println("womenCloths available for: ");
        for(int index=0;index <= womenCloths.length-1;index++){
        System.out.println(womenCloths[index]);
		}
		
		System.out.println("handbags available for: ");
        for(int index=0;index <= handbags.length-1;index++){
        System.out.println(handbags[index]);
		}
		
		System.out.println("electricalGadgets available for: ");
        for(int index=0;index <= electricalGadgets.length-1;index++){
        System.out.println(electricalGadgets[index]);
		}
		
		System.out.println("skinCare available for: ");
        for(int index=0;index <= skinCare.length-1;index++){
        System.out.println(skinCare[index]);
		}
	   }
} 
