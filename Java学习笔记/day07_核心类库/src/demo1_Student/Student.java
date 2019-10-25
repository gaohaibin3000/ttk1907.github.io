package demo1_Student;

import java.util.Objects;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        super();
        setId(id);
        setName(name);
    }

    public Student() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0) this.id = id;
        else System.out.println("不合理");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student(10,"null");
        System.out.println(s1);
        Student s2 = new Student(11,"ttk");
        System.out.println(s1.equals(s2));
    }
}
