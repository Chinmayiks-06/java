class Ncr{
	
	public static void main(String np[]){
		
		int n=7;
		int r=5;
		int ncrValue = Factorial.toGetFact(n)/(Factorial.toGetFact(n-r)*Factorial.toGetFact(r));
		System.out.println("7c5 is "+ncrValue);
	}
}                                                                