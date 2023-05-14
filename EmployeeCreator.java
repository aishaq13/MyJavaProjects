package Chapter10Assingment;

public class EmployeeCreator {
    public static void main(String[] args) {
        Person[] people = new Person[4];
    
        people[0] = new Person("Alice", "123-456-7890", "alice@example.com");
        people[1] = new Person("Bob", "987-654-3210", "bob@example.com");
        people[2] = new Employee("Charlie", "555-123-4567", "charlie@example.com", "1234-5678");
        people[3] = new Employee("David", "555-987-6543", "david@example.com", "5678-1234");
    
        for (Person person : people) {
            System.out.println(person.toString());
            System.out.println();
        }
    }   
}
