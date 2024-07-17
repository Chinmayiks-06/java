class MyntraRunner {
    public static void main(String[] args) {
        System.out.println("Main method started");

        Myntra.createMyntraAccount("puttu", "puttu@gmail.com", "poiuyt", "789087906", "nehru road nmt");
		Myntra.getAccountData();
        System.out.println("Main method ended");
    }
}