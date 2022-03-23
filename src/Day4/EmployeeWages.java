package Day4;

public class EmployeeWages {
	public static void main(String[]args) {
		int IS_FULL_TIME=1;
		double empcheck=Math.floor(Math.random()*10)%2;
		int Per_Hour_Salary=20;
		int Working_Hours=8;
		int salary;
		if (empcheck==IS_FULL_TIME) {
			salary=Per_Hour_Salary*Working_Hours;
			System.out.println("Employee is present"+salary);
			
		}
		else {
			System.out.println("Employee is absent");
			
		}
	}
		
}
