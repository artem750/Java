package laba2.Example4;

public class Person {
    private String name;
    private int age;
    private String gender;
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", gender='" + gender + "'}";
    }

    public static void main(String[] args) {
        Person person = new Person("Иван", 30, "Мужской");
        System.out.println(person);
        person.setName("Мария");
        person.setAge(25);
        person.setGender("Женский");
        System.out.println(person);
    }
}

