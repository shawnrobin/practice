import java.util.ArrayList;
import java.util.Scanner;

public class Inheritance {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
		//initialising an array
		ArrayList<Employee> staff= new ArrayList<>();
		
		//want to get the number of employees 
		System.out.println("Enter number of Employees");
		int count = scanner.nextInt();
		scanner.nextLine();
		
		//Loop for employees
		for(int i =0; i<count; i++ ) {
			
			
System.out.println("\n Staff Member#"+(i+1));
			System.out.println("Enter StaffId");
			String StaffId = scanner.nextLine();
			
			System.out.println("Enter Name");
			String Name =scanner.nextLine();
			
			int type;
			//Looping to ask for valid type
			while(true) {
				System.out.println("Enter Type(1=FullTime,2=PartTime)");
				
				//input is String to prevent crashing 
				 String input = scanner.nextLine();
				 
				//prevent crashing when string is input
				 try {
					 type = Integer.parseInt(input);
				 
				 //requesting for only 2 or 1 as the types only
				   if(type==2|| type ==1) {
					break;
				    }
				else {
					System.out.println("Invalid Type. Please enter 1 or 2:");
				}
			//when string is input prevents crashing
			}catch(NumberFormatException e){
				System.out.println("Invalid input");
				}
			}
			
			//Checking if the employee is PartTime OR FullTime
			if(type ==1) {
				System.out.println("Enter Salary");
			int Salary =scanner.nextInt();
			scanner.nextLine();
			staff.add(new FullTime(StaffId, Name, Salary));}
				
			  else  {
				  System.out.println("Enter the wage");
					int Wage = scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("Enter Hours Worked for");
					int Hours = scanner.nextInt();
					scanner.nextLine();
					
					staff.add(new PartTime(StaffId, Name, Wage,Hours));
				}
				
			
			
		System.out.println("---Employee List---");
		
		//Printing Employees
		for(Employee e: staff) {
			System.out.println(e);
		}
		
		}
		scanner.close();
		
		
		
		
		
		

	}

	}
	