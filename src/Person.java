import java.util.Scanner;

class Person {
    protected String surname;
    protected String firstName;
    protected String street;
    protected String zipCode;
    protected String city;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Surname:");
        surname = scanner.nextLine();

        System.out.println("Enter First Name:");
        firstName = scanner.nextLine();

        System.out.println("Enter Street:");
        street = scanner.nextLine();

        System.out.println("Enter Zip Code:");
        zipCode = scanner.nextLine();

        System.out.println("Enter City:");
        city = scanner.nextLine();
    }

    public void print() {
        System.out.println("Surname: " + surname);
        System.out.println("First Name: " + firstName);
        System.out.println("Street: " + street);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("City: " + city);
    }
}
class Staff extends Person {
    private String education;
    private String position;

    public void initialize1() {
        initialize(); // Calling initialize method from the Person class

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Education:");
        education = scanner.nextLine();

        System.out.println("Enter Position:");
        position = scanner.nextLine();
    }

    public void print1() {
        print(); // Calling print method from the Person class

        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}
