package Chapter10Assingment;

public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Person() {
        this.name = "";
        this.phoneNumber = "";
        this.emailAddress = "";
    }

    public Person(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone: " + phoneNumber + "\nEmail: " + emailAddress;
    }
}
