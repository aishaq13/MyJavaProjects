/// This program create a Month creator class  to test all the methods in your class. 
//Aisha Qureshi 03/26/2023 JDK 17.0.1

package Chapter8Assingment;

public class MonthCreator {
    public static void main(String[] args) {
        Month month1 = new Month(10);
        Month month2 = new Month(11);

        System.out.println(month1.toString());
        System.out.println(month2.toString());

        if (month1.equals(month2)) {
            System.out.println("Months are equal");
        } else {
            System.out.println("Months are not equal");
        }
    }
}