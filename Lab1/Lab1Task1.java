import java.util.Scanner;
class Office
{
	double salary;
	float hours;
	


	public void getInfo(double salary, float hours)
	{
		this.salary = salary;
		this.hours = hours;
	}
	  
    // if salary is greater than $500 add 10
	public void addSalary()
	{
		if(salary>500){
			salary = salary+10;
	}

	}
	// if hours are greater than 5 add 5 dollors more
	public void  addWork()
	{
		if(hours>5)
		{
			salary+=5;
		}
	}
	public void print(){
		System.out.println("Salary = $" + salary);
	}
}
public class Lab1Task1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Office off = new Office();
		
		System.out.println("Enter the Salary");
		double s = sc.nextDouble();
		System.out.println("Enter the Hours");
		float h = sc.nextFloat();
		off.getInfo(s,h);
		off.addSalary();
		off.addWork();
		off.print();

	}
}