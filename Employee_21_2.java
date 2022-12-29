//S21_Q2
import java.util.*;
class employee
{
	int id;
	String name;
	String deptname;
	double salary;
	static int cnt=0;
	employee()
	{
		//Default Constructor
	}
	employee(int id, String name, String deptname, double salary)
	{
		this.id = id;
		this.name = name;
		this.deptname = deptname;
		this.salary = salary;
		cnt++;
	}
	static void objnum()
	{
		System.out.println("Count Of Object:"+cnt);
	}
	void display()
	{
		System.out.println(this.id+"\t"+this.name+"\t\t"+this.deptname+"\t\t"+this.salary);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Employees:");
		int n = sc.nextInt();
		employee e[] = new employee[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter"+(i+1)+"employee data");
			
			System.out.println("Enter Employee ID");
			int id = sc.nextInt();
			
			System.out.println("Enter Employee Name");
			String en = sc.next();

			System.out.println("Enter DeptName");
			String dn = sc.next();

			System.out.println("Enter Employee Salary");
			double salary = sc.nextDouble();

			e[i] = new employee(id,en,dn,salary);
			employee.objnum();
		}
		System.out.println("Employees Record Are:");
		System.out.println("ID\tEmployee Name\tDept Name\tSalary");
		for(int i=0; i<n; i++)
		{
			e[i].display();
		}
		sc.close();	
	}
} 