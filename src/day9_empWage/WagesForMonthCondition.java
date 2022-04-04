package day9_empWage;

public class WagesForMonthCondition {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int PART_TIME = 4;
	public static final int FULL_DAY = 8;
	public static final int WAGE_PER_HOUR = 20;
	public static final int TOTAL_WORKING_DAYS = 20;
	public static final int TOTAL_WORKING_HOURS = 100;
			
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Employee Wage Computation" );
        int TotalWage = 0;
        int dailywage= 0;
        int WorkingHrs=0;
        int Workingdays=0;
        
       while (WorkingHrs < TOTAL_WORKING_HOURS && Workingdays < TOTAL_WORKING_DAYS )
       {
        double empCheck = Math.floor(Math.random() * 10 ) % 3;
        
        switch ((int)empCheck) {
        
        case IS_FULL_TIME : {
		dailywage = FULL_DAY * WAGE_PER_HOUR;    
       	System.out.println("Employee is Present for Full Time ");
       	System.out.println("Daily wage is :"+ dailywage);
       	WorkingHrs=WorkingHrs+FULL_DAY;
       	
       	break;			
        }
        
		case IS_PART_TIME: {
		dailywage = PART_TIME * WAGE_PER_HOUR;    
       	System.out.println("Employee is Present for Part Time ");	
       	System.out.println("Daily wage is :"+ dailywage);
       	WorkingHrs=WorkingHrs+PART_TIME;
       	
       	break;
		}
		
		default:
			dailywage=0;
			System.out.println("Employee is Absent");
		}
        Workingdays++;
        TotalWage = TotalWage + dailywage;
       }
       
       System.out.println("Total salary :"+ TotalWage);

	}

}
