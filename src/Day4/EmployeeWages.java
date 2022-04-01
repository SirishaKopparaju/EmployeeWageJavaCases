package Day4;

import java.util.EventObject;

public class EmployeeWages {

		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		String company;
		public static int EMP_RATE_PER_HOUR=20;
		public static int NUMBER_OF_WORKING_DAYS=2;
		public static int MAX_HOURS_IN_MONTH=10;
		public EmployeeWages(String company,int EMP_RATE_PER_HOUR,int NUMBER_OF_WORKING_DAYS,int MAX_HOURS_IN_MONTH) {
			this.company=company;
			this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
			this.NUMBER_OF_WORKING_DAYS=NUMBER_OF_WORKING_DAYS;
			this.MAX_HOURS_IN_MONTH=MAX_HOURS_IN_MONTH;
			}

		
			public void  computeEmpWage() {
			int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
			while(totalEmpHrs<=MAX_HOURS_IN_MONTH &&totalWorkingDays<NUMBER_OF_WORKING_DAYS) {
				totalWorkingDays++;
				int empcheck=(int) (Math.floor(Math.random()*10)%3);
switch(empcheck)
{
case IS_PART_TIME:
	empHrs=4;
	break;
case IS_FULL_TIME:
	empHrs=8;
	break;
	default:
		empHrs=0;
}
totalEmpHrs+=empHrs;
System.out.println("Day#:"+totalWorkingDays + "Emp Hr:"+empHrs);
			}
			
int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
			}
			@Override 
			public String toString() {
String totalEmpWage = null;
return " totalEmpWage for company:"+company +totalEmpWage;
			}
		public static void main(String[]args) {
				EmployeeWages dmart =new EmployeeWages("dmart",20,2,10);
				EmployeeWages relainace =new EmployeeWages("relainace",10,3,20);
dmart.computeEmpWage();
System.out.println(dmart);
relainace.computeEmpWage();
System.out.println(relainace);


				
			}
		


}

