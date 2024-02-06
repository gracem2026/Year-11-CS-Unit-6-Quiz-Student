public class Student {
    // properties
    private int age;
    private String firstName;
    private String lastName;
    private int year;
    private Address address;

    // constructor
    public Student(int a, String fN, String lN, int y, Address ad) {
        age = a;
        firstName = fN;
        lastName = lN;
        year = y;
        address = ad;
    }

    // methods
    // getters
    public int getAge() {
        return age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getYear() {
        return year;
    }
    public Address getAddress() {
        return address;
    }
    // setters
    public void setAge(int age1) {
        age = age1;
    }
    public void setFirstName(String firstName1) {
        firstName = firstName1;
    }
    public void setLastName(String lastName1) {
        lastName = lastName1;
    }
    public void setYear(int year1) {
        year = year1;
    }
    public void setAddress(Address address1) {
        address = address1;
    }
    // age manipulation
    public void addOneAge() {
        age ++;
    }
    public int birthday() {
        addOneAge();
        return age;
    }
    // toString
    public String toString() {
        return firstName + " " + lastName + ", age " + age + ", year " + year + ", " + address;
    }
}
