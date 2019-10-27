package cn.itxdl.day13;

public class Student {
	private int id;
	private String name;
	private int age;
	
	public Student() {
		super();
	}
	public Student(int id, String name, int age) {
		super();
		setId(id);
		setName(name);
		setAge(age);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id > 0) {
			this.id = id;
		} else {
			System.out.println("ѧ�Ų���������");
		}
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
		if(age >= 4 && age <= 60) {
			this.age = age;
		} else {
			System.out.println("���䲻��������");
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
