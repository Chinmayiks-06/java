class chatCenter{
	static String shopName="Sri";
	static	String shopOwner="chin";
	static  String chatNames[]={null,null,null,null,null,null};
	static int chatNameIndex;
	//static int chatPriceIndex;
	static int index;
	//static double chatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
	
	public static void shopDetails(){
		System.out.println("Shop name is: "+shopName);
		System.out.println("Shop owner is: "+shopOwner);
	return;	
	}
	
	public static boolean createChatName(String chatName){
		
		System.out.println("createChatName started...");
		   boolean ischatNameCreated = false;
		   //validation
		   if(chatName != null && chatNames.length>0){
			   chatNames[chatNameIndex]=chatName;
			   chatNameIndex++;
			   ischatNameCreated=true;
		   }else System.out.println("chat is null cannot be determined");
		   
		System.out.println("createChatName ended...");
	
    return ischatNameCreated;
	}
	public static void getChatNames(){
		System.out.println("the available chats are: ");
		for(String chatName:chatNames){
		System.out.println(chatName);
		}
		return;
	}
	
	/*public static boolean createChatPrice(double chatPrice){
		System.out.println("createChatPrice started...");
		boolean ischatPriceCreated =false;
		
		if(chatPrice > 0.0 && chatPriceIndex.length>0){
			chatPrices[chatPriceIndex] = chatPrice;
			chatPriceIndex++;
			
			ischatPriceCreated=true;
		}else System.out.println("price cannot be determined");

		System.out.println("createChatPrice ended...");
		return ischatPriceCreated;
	}*/
  
    public static boolean updateChatName(String oldChatName,String newChatName){
		System.out.println("updateChatName created");
		boolean isupdateChatName=false;
		for(int index=0;index < chatNames.length;index++){
			if(oldChatName == chatNames[index]){
				chatNames[index] = newChatName;
				isupdateChatName = true;
			}
		}
			if(isupdateChatName = false){
			System.out.println(oldChatName+"not found");
		}
	
		System.out.println("updateChatName ended");
		return isupdateChatName;
	
	}
}


	/*public static void getChatPrices(){
		System.out.println("the prices are: ");
		for(double chatPrice:chatPrices){
			System.out.println(chatPrice);
		}*/
	
