class Vehicle{
	void run() {
		System.out.println("vehicle is running");
	}
}
class Bike extends Vehicle{
	
}
public class Without_overriding {
public static void main(String args[]) {
	Bike obj=new Bike();
	obj.run();
}
}
