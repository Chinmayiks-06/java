class GymRunner{
	
    public static void main(String gym[]){
	
	System.out.println("main started");
	
	boolean isaddGym=Gym.createGymEquipment("Threadmill");
	System.out.println("Gym equipment name is: "+isaddGym);
	
	isaddGym=Gym.createGymEquipment("Dumbbells");
	System.out.println("Gym equipment name is: "+isaddGym);
	
	isaddGym=Gym.createGymEquipment("Spin Bike");
	System.out.println("Gym equipment name is: "+isaddGym);
	
	isaddGym=Gym.createGymEquipment("StairMaster");
	System.out.println("Gym equipment name is: "+isaddGym);
	
	isaddGym=Gym.createGymEquipment("Dipping Bars");
	System.out.println("Gym equipment name is: "+isaddGym);
	
	isaddGym=Gym.createGymEquipment("Leg Extension machine");
	System.out.println("Gym equipment name is: "+isaddGym);
	
	isaddGym=Gym.createGymEquipment("Chest press machine");
	System.out.println("Gym equipment name is: "+isaddGym);
	
	isaddGym=Gym.createGymEquipment("Leg Press machine");
	System.out.println("Gym equipment name is: "+isaddGym);
	

	
	Gym.getGymEquipments();
	
	System.out.println("main ended");
	
	boolean isupdated = Gym.updategymAquipment("Dumbbells","Power rack");
	System.out.println("updated name is: "+isupdated);
	
    Gym.getGymEquipments();
 }
}