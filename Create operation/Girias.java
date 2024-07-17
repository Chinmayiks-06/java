class Girias{
	
	static String homeAppliances[]={null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean createhomeAppliance(String applianceName){
		System.out.println("createhomeAppliance started");
		boolean isapplianceNameCreated = false;
		if(applianceName !=null && homeAppliances.length>0){
			homeAppliances[index] = applianceName;
			index++;
			isapplianceNameCreated=true;
		}else System.out.println("applianceName invalid");
		
		System.out.println("createhomeAppliance started");
		
		return isapplianceNameCreated;
		
	}
	
	public static void getHomeAppliances(){
		System.out.println("The available homeAppliances are: ");
		for(String applianceName:homeAppliances){
			System.out.println(applianceName);
		}
    return;
	}
	
	public static boolean updateHomeAppliances(String oldhomeAppliances,String newhomeAppliances){
		System.out.println("updateHomeAppliances started");
		boolean isupdateHomeappliances = false;
		for(int index=0;index < homeAppliances.length;index++){
			if(oldhomeAppliances == homeAppliances[index]){
		    homeAppliances[index]= newhomeAppliances;
			isupdateHomeappliances =true;
			}
		}
		if(isupdateHomeappliances =false){
			System.out.println(oldhomeAppliances+"not found");
		}
		System.out.println("updateHomeAppliances started");
		
    return isupdateHomeappliances;
	
	}
}
