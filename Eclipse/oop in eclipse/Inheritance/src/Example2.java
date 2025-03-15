class Teacher{
	String designation;
	String uniName;
	public void job() {
		System.out.println(designation);
		System.out.println(uniName);
	}
}
class CseTeacher extends Teacher{
	String mainSubject;
}
public class Example2 {
public static void main(String args[]) {
	CseTeacher obj=new CseTeacher();
	obj.designation="lecturer";
	obj.uniName="DIU";
	obj.mainSubject="OOP";
	obj.job(); 
	System.out.println(obj.mainSubject);
}
}
