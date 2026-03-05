
public class FullTime extends Employee{
	int Salary;
	
	FullTime(String StaffId, String Name,int Salary ) {
		super(StaffId, Name);
		this.Salary=Salary;
		
	}
	
@Override

public String toString() {
	   
	  return super.toString()+Salary;
 }
	void register() {
		   System.out.println(Name+" is Registered");

	   }
	   void attended() {
		   System.out.println(Name+" attended today");
	   }
		   
	
	void getSalary() {
		System.out.println("Got "+Salary+" as salary.");
	}
}
