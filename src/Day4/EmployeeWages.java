package Day4;

public class EmployeeWages{

	public static void main(String[]args) {

		int IS_FULL_TIME=1;
		int IS_PART_TIME=0;
		int IS_ABSENT=2;

		double empcheck=Math.floor(Math.random()*10)%3;
		int Per_Hour_Salary=8;
		int Total_Working_Days=20;
		int Working_Hours=0;

		int salary;
		if (empcheck==IS_FULL_TIME) {
			Working_Hours=8;		
		}
		
		else if(empcheck==IS_PART_TIME) {
			Working_Hours=4;
			}
		else if(empcheck==IS_ABSENT) {
			System.out.println("Employee is absent");
			
		}
		salary=Per_Hour_Salary*Working_Hours;
	System.out.println("employee working "+salary);
	Total_Working_Days=Total_Working_Days+salary;


}
		
}

