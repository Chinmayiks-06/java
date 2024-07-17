class Passport{
	
	static String cpvLoc;
	static int dcdrLoc;
	static String sName;
	static String givenNm;
	static String dateOfBirth;
	static String emaill;
	static String logId;
	static boolean isLoginSame;
	static String pass;
	static String confirmPass;
	static String hintQn;
	static String hintAs;
	static String captchaa;
	
	 public static boolean createPassport(String cpvLocation,int dcdrLocation,String surName,String givenName,String dob,String email
	                                   ,String loginId ,boolean isEmailLoginSame,String password,String confirmPassword,String hintQues,
									   String hintAns,String captcha ){
		boolean isPasswordDataCreated = false;
		if(cpvLocation !=null && dcdrLocation >0 && surName !=null && givenName !=null && email !=null && password !=null && dob !=null
		&& loginId !=null && isEmailLoginSame != false && confirmPassword!=null && hintQues !=null && hintAns !=null && captcha !=null){
		
				cpvLoc       = cpvLocation;
				dcdrLoc      = dcdrLocation;
				sName        = surName;
				givenNm      = givenName;
				dateOfBirth  =dob;
				emaill       =email;
				logId        =loginId;
				isLoginSame  =isEmailLoginSame;
				pass         =password;
				confirmPass  =confirmPassword;
				hintQn       =hintQues;
		        hintAs       =hintAns;
				captchaa     =captcha;
				
				isPasswordDataCreated = true;
				
                }else{
					System.out.println("please give valid details....");
				}
				
	    return isPasswordDataCreated;			
		 
		 }

	public static void getPasswordDetails(){ 
		 
		 
		 System.out.println("cpv location is: "+cpvLoc);
         System.out.println("dcdr location is: "+dcdrLoc);
         System.out.println("sur name is: "+sName);
         System.out.println("Given name is: "+givenNm);
         System.out.println("Date of Birth is: "+dateOfBirth);
         System.out.println("email is: "+emaill);
		 System.out.println("loginId is: "+logId);
		 System.out.println("isEmailLoginSame is: "+isLoginSame);
		 System.out.println("password is: "+pass);
		 System.out.println("confirm Password is: "+confirmPass);
		 System.out.println("hint question is: "+hintQn);
		 System.out.println("hint Answer is: "+hintAs);
		 System.out.println("Captcha: "+captchaa);
		 
	 }
}  