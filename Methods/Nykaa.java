class Myntra{
	static int idNum; 
	static String eId;
	static String fName;
	static String secName;
	static String uPassword;
	static String cPassword;
	static String gen;
	
  public static boolean createAccount(int idNumber,String emailId,String firstName,String secondName,String userPassword,String confirmPassword,String gender){
    boolean isAccountCreated = false;
   
        idNum      = idNumber;
	    eId        = emailId;
	    fName      = firstName;
        secName      = secondName;
        uPassword =userPassword;
		cPassword = confirmPassword;
        gen       = gender;
	
    return isAccountCreated;	
  }
    public static void getDetails(){
		   System.out.println("the mobile Number is:" +idNum);
           System.out.println("the emai Id is:" +eId);
           System.out.println("the user Name is" +fName);
           System.out.println("the sur Name is" +secName);
           System.out.println("the user password is:" +uPassword);
		   System.out.println("the confirm  password is:" +cPassword);
           System.out.println("the gender is:" +gen);
	}
}