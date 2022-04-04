package day9_empWage;

public class DailyWageUC2 {

	 public static final int IS_PRESENT = 1;
		public static final int FULL_DAY = 8;
		public static final int WAGE_PER_HOUR = 20;
				
	    public static void main( String[] args )
	    {
	        System.out.println( "Welcome to Employee Wage Computation" );
	        int dailywage= 0;
	        double empCheck = Math.floor(Math.random() * 10 ) % 2;
	        
	        if (empCheck == IS_PRESENT)
	        {
	        	dailywage = FULL_DAY * WAGE_PER_HOUR;    
	         	System.out.println("Employee is Present ");
	         	System.out.println("Daily wage is :"+ dailywage);
	        }
	        else
	        {
	        	System.out.println("Employee is Absent");
	        }
	}

}
