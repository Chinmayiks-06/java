class Aadhar{
	
	static String givenNm;
	static String dateOfBirth;
	static int   aNum;
	static String captchaa;
	
	 public static boolean createAccount(String givenName,String dob,int aadharNum,String captcha ){
		boolean isPasswordDataCreated = false;
		
				givenNm      = givenName;
				dateOfBirth  =dob;
				aNum     = aadharNum;
				captchaa     =captcha;
				
	    return isPasswordDataCreated;			
		 
		 }

	public static void getDetails(){ 
		 
		
         System.out.println("Given name is: "+givenNm);
         System.out.println("Date of Birth is: "+dateOfBirth);
		 System.out.println("Aadhar number is: "+aNum);
		 System.out.println("Captcha: "+captchaa);
		 
	 }
}