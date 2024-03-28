package sit707_tasks;

import java.util.Random;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args )
    {   
    	/*
    	 * January max boundary area: max-1, max+1
    	 */
    	System.out.println("January max: increment should go to February.");
    	DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("January max: decrement should be 30 January.");
    	date = new DateUtil(31, 1, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
         * January nominal (somewhere between min and max)
         */
        System.out.println("January random day between (1, 31): increment should be 1 day next.");
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        /*
         * January min boundary area: min+1, min-1
         */
        System.out.println("January min: increment should be 2nd January.");
    	date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("January min: decrement should be 31 December previous year.");
        date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);  
        
        // Outputs for the table
        System.out.println("------------------------------------------------------------");
        
        date = new DateUtil(1, 6, 1994);
        date.increment();
        System.out.println(date);
        
        date = new DateUtil(2, 6, 1994);
        date.increment();
        System.out.println(date);
        
        date = new DateUtil(15, 6, 1994);
        date.increment();
        System.out.println(date);
        
        date = new DateUtil(30, 6, 1994);
        date.increment();
        System.out.println(date);
        
        try {
            date = new DateUtil(31, 6, 1994);
            date.increment();
            System.out.println(date);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        date = new DateUtil(15, 1, 1994);
        date.increment();
        System.out.println(date);
        
        date = new DateUtil(15, 2, 1994);
        date.increment();
        System.out.println(date);
        
        date = new DateUtil(15, 11, 1994);
        date.increment();
        System.out.println(date);

        date = new DateUtil(15, 12, 1994);
        date.increment();
        System.out.println(date);
        
        date = new DateUtil(15, 6, 1700);
        date.increment();
        System.out.println(date);
        
        date = new DateUtil(15, 6, 1701);
        date.increment();
        System.out.println(date);
        
        date = new DateUtil(15, 6, 2023);
        date.increment();
        System.out.println(date);
        
        date = new DateUtil(15, 6, 2024);
        date.increment();
        System.out.println(date);
    }
}
