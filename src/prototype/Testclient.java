package prototype;

public class Testclient 
{
public static void main(String[] args) throws CloneNotSupportedException
{
	Employee employee = new Employee(123,"Fariba","Rabbani","117E broadway","FF","IA","52556");	
	
	Employee employee2 = (Employee)employee.clone();
			
	System.out.println(employee);
	System.out.println(employee2);
}
}
