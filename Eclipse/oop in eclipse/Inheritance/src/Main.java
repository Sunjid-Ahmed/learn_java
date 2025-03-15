class Employee{
	float salary;
}
class Programmer extends Employee{
	float bonus;
	void print_info() {
		float sum = bonus+salary;
		System.out.println("Total salary:" + sum);
	}
}
public class Main{
	public static void main(String args[]) {
		Programmer obj=new Programmer();
		obj.bonus=10000;
		obj.salary=50000;
		System.out.println(obj.bonus);
		System.out.println(obj.salary);
		obj.print_info();
		
	}
}