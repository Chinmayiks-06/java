class Xworkz{
    static String nm;
    static String mail;
    static String usnn;
    static String phNum;
    static String addr;

    public static boolean createApplication(String name, String email, String usn, String phoneNumber, String address) {
        boolean isApplicationCreated = false;
        boolean isnameValid = false;
        boolean isemailValid = false;
        boolean isusnValid = false;
        boolean isphoneNumberValid = false;
        boolean isaddressValid =false;

       if(name!=null)
			{
				nm=name;
				isnameValid=true;
			}
			else{
				System.out.println("please provide the valid name");
			}
       if(email!=null )
			{
				mail=email;
				isemailValid=true;
			}
			else{
				System.out.println("please provide valid email");
			}

        if(usn!=null)
			{
				usnn=usn;
				isusnValid=true;
			}
			else{
				System.out.println("please provide valid usn");
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


        if (isnameValid && isemailValid && isusnValid && isphoneNumberValid && isaddressValid) {
           isApplicationCreated=true;
			}
			else
			{
				
				System.out.println("pls enter valid details");
			}
			return isApplicationCreated;
	}
			
    public static void getApplicationData() {
        
        System.out.println("Username: " + nm);
        System.out.println("Email: " + mail);
        System.out.println("USN: " + usnn);
        System.out.println("Phone Number: " + phNum);
        System.out.println("Address: " + addr);
      
    }
}

