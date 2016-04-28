package prototype;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
	private int id;
	private String Lastname;
	private String Firstname;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	private Employee supervisor;
	private Employee staff[];
	     
	public   Employee(int id,String Lastname,String Firstname,String streetAddress,String city,String state,
			String zipcode) throws CloneNotSupportedException
	{
		this.id=id;
		this.Lastname=Lastname;
		this.Firstname=Firstname;
		this.streetAddress=streetAddress;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;	
		supervisor=(Employee)super.clone();
		staff = new Employee[10];
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		
		Employee employee = new Employee(id, Firstname, Lastname, streetAddress, city, state, zipcode);
		Employee  tempStaff[] = employee.getStaff();
		employee.setStaff(new Employee[employee.getStaff().length]);
		for(int i=0;i<employee.getStaff().length ;i++){
			employee.getStaff()[i]=tempStaff[i];
		}
		return employee;
	}
	public int getId() {
		return id;
		
	}

	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public Employee[] getStaff() {
		return staff;
	}

	public void setStaff(Employee[] staff) {
		this.staff = staff;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getStreetAddress() {
		return streetAddress;
	}


	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
    public String toString() {
        return "Employee{" + "firstName=" + Firstname + ", supervisor=" + supervisor + ",";
    }
}






