package Chapter11Assingment;
import java.util.Scanner; 

public class Main {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter numerator: ");
            double numerator = scanner.nextDouble();
    
            System.out.print("Enter denominator: ");
            double denominator = scanner.nextDouble();
    
            try {
                double result = divide(numerator, denominator);
                System.out.println("Result: " + result);
            } catch (DivisionException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        public static double divide(double numerator, double denominator) throws DivisionException {
            if (denominator == 0) {
                throw new DivisionException();
            } else {
                return numerator / denominator;
            }
        }
    }
