package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
    	int februaryDays = 0;
    	if (year > 0) {
    		if (year%4==0) {
    			// if the year is leap
    			februaryDays = 29;
    			if (year%100==0) {
    				if (year%400==0) {
    					// the year is leap
    					februaryDays = 29;
    				} else {
    					// the year is not leap
    					februaryDays = 28;
    				}
    			} else {
    				// the year is leap
					februaryDays = 29;
    			}
    			   			
    		} else {
    			// the year is not leap
    			februaryDays = 28;
    		}
    		
    		switch (month) {
    			case 1: System.out.println(31); break;
    			case 2: System.out.println(februaryDays); break;
    			case 3: System.out.println(31); break;
    			case 4: System.out.println(30); break;
    			case 5: System.out.println(31); break;
    			case 6: System.out.println(30); break;
    			case 7: System.out.println(31); break;
    			case 8: System.out.println(31); break;
    			case 9: System.out.println(30); break;
    			case 10: System.out.println(31); break;
    			case 11: System.out.println(30); break;
    			case 12: System.out.println(31); break;
    			default: System.out.println("invalid date"); break;
    		}
   	
    	} else 
    		System.out.println("invalid date");
    }
}


