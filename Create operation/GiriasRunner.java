class GiriasRunner{
	
	public static void main(String gir[]){
		
		System.out.println("main started");
		
		boolean isaddName=Girias.createhomeAppliance("Washing Machine");
		System.out.println("The Appliances name is: "+isaddName);
		
		isaddName=Girias.createhomeAppliance("Chimney");
		System.out.println("The Appliances name is: "+isaddName);
		
		isaddName=Girias.createhomeAppliance("Aqua Guard");
		System.out.println("The Appliances name is: "+isaddName);
		
		isaddName=Girias.createhomeAppliance("Grinder");
		System.out.println("The Appliances name is: "+isaddName);
		
		isaddName=Girias.createhomeAppliance("Fan");
		System.out.println("The Appliances name is: "+isaddName);
		
		isaddName=Girias.createhomeAppliance("Refrigerator");
		System.out.println("The Appliances name is: "+isaddName);
		
		isaddName=Girias.createhomeAppliance("Vaccum Cleaner");
		System.out.println("The Appliances name is: "+isaddName);
		
		isaddName=Girias.createhomeAppliance("Flask");
		System.out.println("The Appliances name is: "+isaddName);
		
		isaddName=Girias.createhomeAppliance("Chopper");
		System.out.println("The Appliances name is: "+isaddName);
		
		isaddName=Girias.createhomeAppliance("Iron Box");
		System.out.println("The Appliances name is: "+isaddName);
		
		isaddName=Girias.createhomeAppliance("Stove");
		System.out.println("The Appliances name is: "+isaddName);
		
		isaddName=Girias.createhomeAppliance("Electric Stove");
		System.out.println("The Appliances name is: "+isaddName);
		Girias.getHomeAppliances();
		
		
		boolean isupdated = Girias.updateHomeAppliances("Stove","Glass Stove");
	    System.out.println("updated name is"+isupdated);
		
		Girias.getHomeAppliances();
	}
}