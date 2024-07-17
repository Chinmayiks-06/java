class Televisionn{
	
	static boolean isConnected = false;
	static int currentVolume=0;
	static int minVolume=0;
	static int maxVolume=10;
	
		public static void onOrOff(){
		
		System.out.println("onOrOff started");
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("Telivision is on");
		}else if(isConnected == true){
			     isConnected = false;
				 System.out.println("Telivision is off");
		}
		
		System.out.println("onOrOff ended");
		
		return;
		
    }
	
	    public static void increaseVolume(){
		
	    System.out.println("Increase volume started");
	
	    if(isConnected == true){
		    if(currentVolume < maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("The current Volume is "+currentVolume);
		 } else{
			System.out.println("Maximum Volume reached");
		    }
		 }else{
			System.out.println("on the televisionn");
		 }
		System.out.println("Increase the volume ended");
		
		return;
	}
	
}