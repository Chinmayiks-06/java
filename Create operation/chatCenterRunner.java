class chatCenterRunner{
	
	public static void main(String chat[]){
		System.out.println("main started..");
     
	    chatCenter.shopDetails();
      
		boolean ischatAdded = chatCenter.createChatName("Bhel puri");
		System.out.println("the chat name is: "+ischatAdded);
		//boolean ispriceAdded = chatName.createChatPrice(40.00);
		//System.out.println("the price is: "+ispriceAdded);
		
		ischatAdded = chatCenter.createChatName("sev puri");
		System.out.println("the chat name is: "+ischatAdded);
	
		
	    ischatAdded = chatCenter.createChatName("masala puri");
		System.out.println("the chat name is: "+ischatAdded);
		
		
		ischatAdded = chatCenter.createChatName("pani puri");
		System.out.println("the chat name is: "+ischatAdded);
		
		
		ischatAdded = chatCenter.createChatName("Tikki puri");
		System.out.println("the chat name is: "+ischatAdded);
		
		
		ischatAdded = chatCenter.createChatName("Dhahi puri");
		System.out.println("the chat name is: "+ischatAdded);
		

	    chatCenter.getChatNames();
		
		//chatCenter.getChatPrices();
		
		boolean newName=chatCenter.updateChatName(" puri","Mix puri");
		System.out.println("updated name is: "+newName);
		
		System.out.println("main started..");
		
		chatCenter.getChatNames();
		
	}
}