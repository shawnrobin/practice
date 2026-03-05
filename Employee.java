import java.util.Scanner;

public abstract class Employee {
	//Attributes
   String StaffId;
   String Name;
   
   Scanner scanner = new Scanner(System.in);
   //constructor
   Employee(String StaffId, String Name){
	   this.Name = Name;
	   this.StaffId = StaffId;
   }
   
   //method overriding
   public String toString() {
	   
	  return Name +"\n" + StaffId+"\n";
   }
   
  //methods 
   abstract void register();
	   
   
   abstract void attended();
   
	
	
	
	
	
}
