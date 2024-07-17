class chatShop{
	static String shopName="Sri";
	static	String shopOwner="chin";
	static  String chatNames[]={null,null,null,null,null,null};
	static int chatNameIndex;
	static int chatPriceIndex;
	static double chatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
	
	public static boolean createChatName(String chatName){
		
		System.out.println("createChatName started...");
		   boolean ischatNameCreated = false;
		   //validation
		   chatNameIndex < )
		   if(chatName != null){
			   chatNames[chatNameIndex]=chatName;
			   chatNameIndex++;
			   ischatNameCreated=true;
		   }else System.out.println("chat is null cannot be determined");
		   
		System.out.println("createChatName ended...");
	
    return ischatNameCreated;
	}
	
	public static boolean createChatPrice(double chatPrice){
		System.out.println("createChatPrice started...");
		boolean ischatPriceCreated =false;
		
		if(chatPrice > 0.0){
			chatPrices[chatPriceIndex] = chatPrice;
			chatPriceIndex++;
			
			ischatPriceCreated=true;
		}else System.out.println("price cannot be determined");
		

		System.out.println("createChatPrice ended...");
		return ischatPriceCreated;
	}
  
	
	public static void getChatNames(){
		System.out.println("the available chats are: ");
		for(String chatName:chatNames){
		System.out.println(chatName);
		}
	}
	
	public static void getChatPrices(){
		System.out.println("the prices are: ");
		for(double chatPrice:chatPrices){
			System.out.println(chatPrice);
		}
	}
	
}
	

	
		
		
`																																														                                                                                        			