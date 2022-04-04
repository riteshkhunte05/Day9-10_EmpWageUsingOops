package day9_empWage;

public class PartTimeWagesUC3 {

	 public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int PART_TIME = 4;
		public static final int FULL_DAY = 8;
		public static final int WAGE_PER_HOUR = 20;
				
	    public static void main( String[] args )
	    {
	        System.out.println( "Welcome to Employee Wage Computation" );
	        int dailywage= 0;
	        double empCheck = Math.floor(Math.random() * 10 ) % 3;
	        
	        if (empCheck == IS_FULL_TIME)
	        {
	        	dailywage = FULL_DAY * WAGE_PER_HOUR;    
	         	System.out.println("Employee is Present for Full Time ");
	         	System.out.println("Daily wage is :"+ dailywage);
	        }
	        else if ( empCheck == IS_PART_TIME )
	        {
	        	dailywage = PART_TIME * WAGE_PER_HOUR;    
	         	System.out.println("Employee is Present for Part Time");
	         	System.out.println("Daily wage is :"+ dailywage);
	        }
	        else
	        {
	        	System.out.println("Employee is Absent");
	        }

	}

}
