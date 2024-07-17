class Factorial{
	
	//method Declaration
	                             //factNumber=0
	public static int toGetFact(int factNumber){
		System.out.println("Fact method started ");
	   int fact = 1;
	   for(int num=1;num <=factNumber; num++ ){
		   fact = num*fact;
	   }
	 
	   System.out.println("Fact method ended ");
	   
	   
	   //it will come here and return 1
	   return fact;
	}
		   
}  

