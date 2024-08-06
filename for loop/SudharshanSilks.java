//Array concept+for loop

class SudharshanSilks {
	
	static String silkName ="Banaras Silk";
    static String silkName1 ="Mysore Silk";
	static String silkName2 ="Kanchi Silk";
    static String silkSarees[] ={silkName,silkName1,silkName2};
	
	public static void main(String []silks){
		
		System.out.println("The Silk Sarees Available are:" + silkSarees.length);
          for(String silkSareeName : silkSarees){
			  System.out.println(silkSareeName);
		  }
	}
}