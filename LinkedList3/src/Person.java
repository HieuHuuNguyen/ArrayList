public class Person {
    private int age;
    private String name, address;

    public Person(){

    }

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
