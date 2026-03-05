

public class PartTime extends Employee {
	int Wage;
	int Hours;
	
	
	
	PartTime(String StaffId, String Name, int Wage,int Hours) {
		super(StaffId, Name);
		this.Wage=Wage;
		this.Hours=Hours;
		
		
	}
	
@Override

public String toString() {
	   
	  return super.toString()+Hours+"\n"+getPay();
 }
	void register() {
		   System.out.println(Name+" is Registered");
		   
	   }
	   void attended() {
		   System.out.println(Name+" attended today");
	   }
	
	int getPay() {
		return Wage*Hours;
	}

	
}

