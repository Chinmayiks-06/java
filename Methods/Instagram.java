class Instagram{
static String mobileNum;
static String fullName;
static String userName;
static String password;
static String email;
static boolean isMblNumValid;
//static boolean isInstaDataCreated;

			public static boolean createAcc(String mblNum,String fName,String uName,
			String emailId,String pwd){
			boolean  isEmailIdValid=false;
			boolean  isMblNumValid=false;
			boolean  isPwdValid=false;
			boolean isfNameValid=false;
			boolean isuNameValid=false;
			boolean isInstaDataCreated=false;
			if(mblNum==null){
				System.out.println("please provide the valid mblNum");
			}
			else if(mblNum!=null)
			{
				mobileNum=mblNum;
				isMblNumValid=true;
			}
			if(fName!=null )
			{
				fullName=fName;
				isfNameValid=true;
			}
			else{
				System.out.println("please provide valid fullName");
			}
			if(uName!=null)
			{
				userName=uName;
				isuNameValid=true;
			}else
			{
				System.out.println("please provide valid username");
			}
			if(pwd!=null)
			{
				password=pwd;
				isPwdValid=true;
			}
			else{
				System.out.println("please provide valid password");
			}
			if(emailId!=null) 
			{
				email=emailId;
				isEmailIdValid=true;
			}
			else{
				System.out.println("please provide valid email");
			}
			if(isEmailIdValid && isMblNumValid && isPwdValid && isfNameValid && isuNameValid){
			isInstaDataCreated=true;
			}
			else
			{
				
				System.out.println("pls enter valid details");
			}
			return isInstaDataCreated;
	}
			
			
			public static void getInfo(){
			System.out.println("Mobilr Num is "+mobileNum);
			System.out.println("Full name is "+fullName);
			System.out.println("User name is "+userName);
			System.out.println("Password is "+password);
			System.out.println("Email id "+email);
			}
		}