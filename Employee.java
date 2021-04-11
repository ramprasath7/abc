package constructor;

public class Employee {
	int empid;
	double salary;
	char grade;
Employee(int empid,double salary,char grade)
	{
		this.empid=empid;
		this.salary=salary;
		this.grade=grade;
	}
	void display()
	{
		System.out.println("*********");
		System.out.println("employee ID "+ empid);
		System.out.println(" salary "+ salary);
		System.out.println(" grade "+grade);
		System.out.println(" ********");
		
	}
	public static void main(String[] args) {
	   Employee e1=new Employee(567,4000,'a');
	   Employee e2=new Employee(555,8000,'c');
	      e1.display();
	      e2.display();
	}}