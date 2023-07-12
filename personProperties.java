class Person {
    private String name;
    private int age;
    private String address;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        // Set values using setter methods
        person.setName("John Doe");
        person.setAge(25);
        person.setAddress("123 Main Street");

        // Get values using getter methods
        String name = person.getName();
        int age = person.getAge();
        String address = person.getAddress();

        // Display values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
