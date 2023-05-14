package Chapter6Assingmnet;
public class CustomerCreator {
            public static void main(String[] args) {
            Customer customer = new Customer("Bob Smith", 640);
            System.out.println("Name: " + customer.getName());
            System.out.println("Credit Score: " + customer.getCreditScore());
            System.out.println("Credit Rating: " + customer.getCreditRating());
        }
    }
