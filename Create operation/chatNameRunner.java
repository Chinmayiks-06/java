class chatShopRunner{
	
	public static void main(String chat[]){
		System.out.println("main started..");

      
		boolean ischatAdded = chatName.createChatName("Bhel puri");
		System.out.println("the chat name is: "+ischatAdded);
		boolean ispriceAdded = chatName.createChatPrice(40.00);
		System.out.println("the price is: "+ispriceAdded);
		
		ischatAdded = chatName.createChatName("sev puri");
		System.out.println("the chat name is: "+ischatAdded);
		ispriceAdded = chatName.createChatPrice(30.00);
		System.out.println("the price is: "+ispriceAdded);
		
	    ischatAdded = chatName.createChatName("masala puri");
		System.out.println("the chat name is: "+ischatAdded);
		ispriceAdded = chatName.createChatPrice(40.00);
		System.out.println("the price is: "+ispriceAdded);
		
		ischatAdded = chatName.createChatName("pani puri");
		System.out.println("the chat name is: "+ischatAdded);
		ispriceAdded = chatName.createChatPrice(35.00);
		System.out.println("the price is: "+ispriceAdded);
		
		ischatAdded = chatName.createChatName("Tikka puri");
		System.out.println("the chat name is: "+ischatAdded);
		ispriceAdded = chatName.createChatPrice(60.00);
		System.out.println("the price is: "+ispriceAdded);
		
		ischatAdded = chatName.createChatName("Dhahi puri");
		System.out.println("the chat name is: "+ischatAdded);
		ispriceAdded = chatName.createChatPrice(50.00);
		System.out.println("the price is: "+ispriceAdded);

	    chatName.getChatNames();
		
		chatName.getChatPrices();
		
		
		
		System.out.println("main started..");
	}
}