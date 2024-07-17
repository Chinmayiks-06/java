class MicrowaveOven{
	
	static boolean isConnected = false;
	static int currentTemperature=0;
	static int minTemperature=0;
	static int maxTemperature=25;
	
		public static void onOrOff(){
		
		System.out.println("onOrOff started");
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("oven is on");
		}else if(isConnected == true){
			     isConnected = false;
				 System.out.println("oven is off");
		}
		
		System.out.println("onOrOff ended");
		
		return;
		
    }
	
	    public static void increaseTemperature(){
		
	    System.out.println("Increase temperature started");
	
	    if(isConnected == true){
		    if(currentTemperature < maxTemperature){
			currentTemperature=currentTemperature+1;
			System.out.println("The current Temperature is "+currentTemperature);
		 } else{
			System.out.println("Maximum Temperature reached");
		    }
		 }else{
			System.out.println("on oven");
		 }
		System.out.println("Increase Temperature ended");
		
		return;
	}
	
}