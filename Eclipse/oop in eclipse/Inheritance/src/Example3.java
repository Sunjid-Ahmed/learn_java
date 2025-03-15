
class Person{
	protected String name;
	protected int age;
}
class Student extends Person{
	private int id;
	private double cgpa;
	
	public void display() {
		System.out.println(getId());	
		System.out.println(getCgpa());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
}
public class Example3 {

	public static void main(String[] args) {
	Student obj=new Student();
	obj.name="sunjid";
	obj.age=24;
	obj.setId (232) ;
	obj.setCgpa(3.8);
	System.out.println(obj.name);
	System.out.println(obj.age);
	obj.display();
	
	

	}

}
