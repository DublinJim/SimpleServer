public class Student {
    int age;
    String Name;


    public Student(int age, String name) {
        this.age = age;
        Name = name;
    }

    public void getAge() {
        System.out.println("age is "+age);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("age is set at "+age);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
