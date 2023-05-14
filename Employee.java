package Chapter10Assingment;

public class Employee extends Person {
    private String employeeNumber;

    public Employee() {
        super();
        this.employeeNumber = "";
    }

    public Employee(String name, String phoneNumber, String emailAddress, String employeeNumber) {
        super(name, phoneNumber, emailAddress);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee Number: " + employeeNumber;
    }
}
