package day9_empWage;

public class WagesForMultipleCompaniesUC8 {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int PART_TIME = 4;
	public static final int FULL_DAY = 8;

	public static void main( String[] args )
	{
		System.out.println( "Welcome to Employee Wage Computation" );
		 calculateEmployeeSalary(20,20,100,"D-mart");
		 calculateEmployeeSalary(30,25,120,"Jio");
	}

	private static void calculateEmployeeSalary(int wagePerHour ,int numberOfWorkingDays,int workHrsPerMonth,String company)
	{
		int totalWage = 0;
		int workingHrs=0;
		int workingdays=0;
		int dailyWage = 0;
		while (workingHrs < workHrsPerMonth && workingdays < numberOfWorkingDays )
		{
			double empCheck = Math.floor(Math.random() * 10 ) % 3;
			switch ((int)empCheck) {
			case IS_FULL_TIME : {
				dailyWage = FULL_DAY * wagePerHour;    
				workingHrs=workingHrs+FULL_DAY;
				break;			
			}
			case IS_PART_TIME: {
				dailyWage = PART_TIME * wagePerHour;    
				workingHrs=workingHrs+PART_TIME;
				break;
			}
			default:
				dailyWage=0;
			}
			workingdays++;
			totalWage = totalWage + dailyWage;
		}
		System.out.println("Total salary for Company "+ company +" : "+ totalWage);
	}

	

}
