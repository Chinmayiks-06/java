class SimCardRunner{

public static void main(String [] args){
SimCard ref=new SimCard();
ref.communication("jio",1,"2 month");
ref.display();

SimCard ref1=new SimCard();
ref1.communication("verizon",2,"Verizon Play More Unlimited Plan");
ref1.display();

SimCard ref2=new SimCard();
ref2.communication("AT&T",3,"5 month");
ref2.display();

SimCard ref3=new SimCard();
ref3.communication("T-Mobile",4,"7 month");
ref3.display();

SimCard ref4=new SimCard();
ref4.communication("Sprint",5,"6 month");
ref4.display();

SimCard ref5=new SimCard();
ref5.communication("BSNL",6,"2 month");
ref5.display();


SimCard ref6=new SimCard();
ref6.communication("Airtel",7,"8 month");
ref6.display();

SimCard ref7=new SimCard();
ref7.communication("vodafone",8," 10 month");
ref7.display();

SimCard ref8=new SimCard();
ref8.communication("vodafone idea",9,"1 year");
ref8.display();

SimCard ref9=new SimCard();
ref9.communication("AIRCEL",10,"2 month");
ref9.display();

SimCard ref10=new SimCard();
ref10.communication("Telenor",11,"2 year");
ref10.display();

SimCard ref12=new SimCard();
ref12.communication("corparate sim card",8,"6 month");
ref12.display();

SimCard ref13=new SimCard();
ref13.communication("jio corparate sim card",5,"2 month");
ref13.display();

SimCard ref14=new SimCard();
ref14.communication("tata docomo",10,"2 year");
ref14.display();

}
}