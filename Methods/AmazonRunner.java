class AmazonRunner {
    public static void main(String[] args) {
        System.out.println("Main method started");

        Amazon.createAmazonAccount("chinnns", "chin@gmail.com", "cgib2837", "8976738475", "Btm ss");
		Amazon.getAccountData();
        System.out.println("Main method ended");
    }
}