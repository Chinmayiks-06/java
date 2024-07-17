class Amazon {
    static String uname;
    static String mail;
    static String pwd;
    static String phNum;
    static String addr;

    public static boolean createAmazonAccount(String userName, String email, String password, String phoneNumber, String address) {
        boolean isAccountCreated = false;
        boolean isuserNameValid = false;
        boolean isemailValid = false;
        boolean ispasswordValid = false;
        boolean isphoneNumberValid = false;
        boolean isaddressValid =false;

       if(userName!=null)
			{
				uname=userName;
				isuserNameValid=true;
			}
			else{
				System.out.println("please provide the valid userName");
			}
       if(email!=null )
			{
				mail=email;
				isemailValid=true;
			}
			else{
				System.out.println("please provide valid email");
			}

        if(password!=null)
			{
				pwd=password;
				isphoneNumberValid=true;
			}
			else{
				System.out.println("please provide valid password");
			}

        if(phoneNumber!=null)
			{
				phNum=phoneNumber;
				isphoneNumberValid=true;
			}
			else{
				System.out.println("please provide the valid mblNum");
			}

        if(address!=null)
			{
				addr=address;
				isaddressValid=true;
			}
			else{
				System.out.println("please provide the address");
			}


        if (isuserNameValid && isemailValid && ispasswordValid && isphoneNumberValid && isaddressValid) {
           isAccountCreated=true;
			}
			else
			{
				
				System.out.println("pls enter valid details");
			}
			return isAccountCreated;
	}
			
    public static void getAccountData() {
        System.out.println("Amazon Account Details:");
        System.out.println("Username: " + uname);
        System.out.println("Email: " + mail);
        System.out.println("Password: " + pwd);
        System.out.println("Phone Number: " + phNum);
        System.out.println("Address: " + addr);
        System.out.println("Amazon Account Successfully Created.");
    }
}
