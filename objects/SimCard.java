class SimCard{
String name;
int id;
String plan;

public boolean communication(String name,int id,String plan){
	 boolean isSimCard=false;
	 if(name != null && id>0 && plan!=null){
		 this.name=name;
		 this.id=id;
		 this.plan=plan;
		 isSimCard=true;
	 }

return isSimCard;
}
public void display(){
	System.out.println("the name of the card is:"+this.name);
System.out.println("the id is:"+this.id);
System.out.println("the plan is:"+this.plan);
System.out.println("");
}
}