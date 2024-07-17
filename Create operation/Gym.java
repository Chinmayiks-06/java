class Gym{
	
	
    static String gymEquipments[]={null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean createGymEquipment(String equipmentsName){
		System.out.println("createGymEquipment started");
	    boolean isGymEquipmentCreated =false;
            if(	equipmentsName!=null && gymEquipments.length>0){
				gymEquipments[index]= equipmentsName;
			    index++;
                isGymEquipmentCreated=true;
	        }else System.out.println("Equipment name is cannot be determined");  
		
	     System.out.println("createGymEquipment ended");
		 
		 return isGymEquipmentCreated;
	}
	
	public static void getGymEquipments(){
		System.out.println("Gym Equipments are");
		for(String equipmentsName:gymEquipments){
			System.out.println(equipmentsName);
		}
	return;
	}
	
	public static boolean updategymAquipment(String oldGymEquipment,String newGymEquipment){
		System.out.println("updategymAquipment started");
		boolean isupdategymAquipment = false;
		for(int index=0;index < gymEquipments.length;index++){
			if(oldGymEquipment == gymEquipments[index]){
		    gymEquipments[index]= newGymEquipment;
			isupdategymAquipment =true;
			}
		}
		if(isupdategymAquipment =false){
			System.out.println(oldGymEquipment+"not found");
		}
		System.out.println("updategymAquipment started");
		
    return isupdategymAquipment;
}
}

