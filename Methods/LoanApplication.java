class LoanApplication{
static String bkAccNum;
static String bkNm;
static String crSco;
static double rateOfInt;
static String loanTyp;


			public static boolean createLoan(String bankAccountNumber,String bankName,String creditScore,double rateOfInterest,String loanType){
			boolean isbankAccountNumberValid=false;
			boolean isbankNameValid=false;
			boolean iscreditScoreValid=false;
			boolean israteOfInterestValid=false;
			boolean isloanTypeValid=false;
			boolean isLoanDataCreated=false;
			if(bankAccountNumber!=null)
			{
				bkAccNum=bankAccountNumber;
				isbankAccountNumberValid=true;
			}
			else{
				System.out.println("please provide the valid bankAccountNumber");
			}
			if(bankName!=null )
			{
				bkNm=bankName;
				isbankNameValid=true;
			}
			else{
				System.out.println("please provide valid bankName");
			}
			if(creditScore!=null)
			{
				crSco=creditScore;
				iscreditScoreValid=true;
			}else
			{
				System.out.println("please provide valid creditScore");
			}
			if(rateOfInterest!=0.0)
			{
				rateOfInt=rateOfInterest;
				israteOfInterestValid=true;
			}
			else{
				System.out.println("please provide valid rateOfInterest");
			}
			if(loanType!=null) 
			{
				loanTyp=loanType;
				isloanTypeValid=true;
			}
			else{
				System.out.println("please provide valid loanType");
			}
			if(isbankAccountNumberValid && isbankNameValid && iscreditScoreValid && israteOfInterestValid&& isloanTypeValid){
			isLoanDataCreated=true;
			}
			else
			{
				
				System.out.println("pls enter valid details");
			}
			return isLoanDataCreated;
	}
			
			
			public static void getInfo(){
			System.out.println("Bank Account Num is "+bkAccNum);
			System.out.println("Bank name is "+bkNm);
			System.out.println("Creidt Score is "+crSco);
			System.out.println("Rate Of Interest is "+rateOfInt);
			System.out.println("Loan Type "+loanTyp);
			}
		}