class AirConditioner{
	
	static boolean isConnected = true;
	static int currentTemperature;
	static int minTemperature;
	static int maxTemperature=6;
	
	//method declaration
	public static void getFeatures(){
		System.out.println("getFeatures started");
		
		String name="Samsung";
		double price=8000.00;
		
		System.out.println("getFeatures ended");
		
	System.out.println("AirConditioner name is: "+name);
    System.out.println("AirConditioner price is: "+price);
	
	return;
	}
	

	public static void onOrOff(){
		
		System.out.println("onOrOff started");
		
		if(isConnected == false){
		  //!isConnected--this can be used instead of false we can optimize
			isConnected = true;
			System.out.println("AirConditioner is on");
		}else if(isConnected == true){
			     //here--(isConnected)-only
			     isConnected = false;
				 System.out.println("AirConditioner is off");
		}
		
		System.out.println("onOrOff ended");
		
		return;
		
    }
    
//increaseTemperature
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
			System.out.println("AC on madu");
		 }
		System.out.println("Increase Temperature ended");
		
		return;
	}
		
//decreaseTemperature
public static void decreaseTemperature(){
		
	    System.out.println("decrease temperature started");
	
	    if(isConnected == true){
		    if(currentTemperature > minTemperature){
			currentTemperature=currentTemperature-1;
			System.out.println("The current Temperature is "+currentTemperature);
		 } else{
			System.out.println("Minimum Temperature reached");
		    }
		 }else{
			System.out.println("AC on madu");
		 }
		System.out.println("decrease Temperature ended");
		
		return;
	}
}
