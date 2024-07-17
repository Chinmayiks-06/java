class Mixer{
	
	static boolean isConnected = false;
	static int currentLevel=0;
	static int minLevel=0;
	static int maxLevel=5;
	
		public static void onOrOff(){
		
		System.out.println("onOrOff started");
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("Mixer is on");
		}else if(isConnected == true){
			     isConnected = false;
				 System.out.println("Mixer is off");
		}
		
		System.out.println("onOrOff ended");
		
		return;
		
    }
	
	    public static void increaseLevel(){
		
	    System.out.println("Increase of Level started");
	
	    if(isConnected == true){
		    if(currentLevel < maxLevel){
			currentLevel=currentLevel+1;
			System.out.println("The current Level is "+currentLevel);
		 } else{
			System.out.println("Maximum level reached");
		    }
		 }else{
			System.out.println("on the switch");
		 }
		System.out.println("Increasing of level ended");
		
		return;
	}
	
}