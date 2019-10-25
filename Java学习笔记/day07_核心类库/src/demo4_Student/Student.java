package demo4_Student;

public class Student {
    private String id;
    private String name;
    private String age;

    public Student(String a) {
        String[] brr = a.split(",",3);
        id = brr[0];
        name = brr[1];
        age = brr[2];
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                '}';
    }

    public void setAge(String age) {
        this.age = age;
    }
}
