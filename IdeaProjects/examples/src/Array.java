import lombok.ToString;

public class Array {
    public static void main(String[] args) {

        Object[] object=new Customer[2];

        Customer customer=new Customer();
        customer.setCustomerId(1);
        object[0]=customer;


        Customer customer1=new Customer();
        customer1.setCustomerId(2);
        object[1]=customer1;

        System.out.println(object[0]+" "+object[1]);
    }
}
