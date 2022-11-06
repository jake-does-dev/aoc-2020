package day02;

public class Person {
    private final String firstName;
    private final String middleName;
    private final String lastName;

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public static Person noMiddleName(String firstName, String lastName) {
        return new Person(firstName, null, lastName);
    }

    public static void main(String[] args) {
        Person personTwo = new Person("Jake", "Joshua", "Allan");
        Person personOne = Person.noMiddleName("Jake", "Allan");
    }
}
