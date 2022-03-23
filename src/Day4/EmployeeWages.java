package Day4;

public class EmployeeWages {

	public static void main(String[]args) {
		int empcheck=(int) (Math.floor(Math.random()*10)%3);
		int Working_Hours = 0;
	int salary;
  int Per_Hour_Salary = 20;
  int Total_Working_Days=100;
  int day = 0;
  
		
		switch(empcheck)
		{
		case 0:
			Working_Hours=8;
			salary=Per_Hour_Salary*Working_Hours;
			System.out.println("Employee is full time"+salary);


			break;
		case 1: 
			Working_Hours=4;
			salary=Per_Hour_Salary*Working_Hours;
			System.out.println("Employee is part time"+salary);
			
			break;
		case 2:
				Working_Hours=0;
				salary=Per_Hour_Salary*Working_Hours;
				System.out.println("Employee is absent"+salary);
				break;
		}
	
			while (day <= 20 && Total_Working_Days <= 100 )
		{
				        
			salary=Per_Hour_Salary*Working_Hours;
				        if ( Total_Working_Days >= 100){
				        		{
				        	Total_Working_Days=Total_Working_Days+salary;
				                break;
	}	
		
				        }
		}
	}
}
		
