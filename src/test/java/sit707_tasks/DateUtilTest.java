package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223995281";
		Assert.assertNotNull("Student ID is ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Siddhant Gupta";
		Assert.assertNotNull("Student name is ", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("january1ShouldIncrementToJanuary2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2, date.getDay());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("january1ShouldDecrementToDecember31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	
	/*
	 * Test cases for February
	 */
	

	// Writing non-leap year test cases for year 2023 and leap year 2024 test cases
    @Test
    public void testMaxFebruary28YearShouldIncrementToMarch1() {
        DateUtil date = new DateUtil(28, 2, 2023);
        System.out.println("february28YearShouldIncrementToMarch1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxFebruary28YearShouldDecrementToFebruary27() {
        DateUtil date = new DateUtil(28, 2, 2023);
        System.out.println("february28YearShouldDecrementToFebruary27 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(27, date.getDay());
    }
    
    @Test
	public void testMinFebruary1ShouldIncrementToFebruary2() {
		DateUtil date = new DateUtil(1, 2, 2023);
        System.out.println("february1ShouldIncrementToFebruary2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2, date.getDay());
	}
	
	@Test
	public void testMinFebruary1ShouldDecrementToJanuary31() {
		DateUtil date = new DateUtil(1, 2, 2023);
        System.out.println("february1ShouldDecrementToJanuary31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalFebruary() {
		int rand_day_1_to_29 = 1 + new Random().nextInt(29);
        DateUtil date = new DateUtil(rand_day_1_to_29, 2, 2024);
        System.out.println("testFebruaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}

    @Test
    public void testMaxFebruary29LeapYearShouldIncrementToMarch1() {
        DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("february29LeapYearShouldIncrementToMarch1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxFebruary29LeapYearShouldDecrementToFebruary28() {
        DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("february29LeapYearShouldDecrementToFebruary28 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(28, date.getDay());
    }
    
    /*
	 * Test cases for March
	 */
    
    @Test
    public void testMaxMarch31ShouldIncrementToApril1() {
        // March max boundary area: max+1
        DateUtil date = new DateUtil(31, 3, 2024);
        System.out.println("march31ShouldIncrementToApril1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxMarch31ShouldDecrementToMarch30() {
        // March max boundary area: max-1
        DateUtil date = new DateUtil(31, 3, 2024);
        System.out.println("march31ShouldDecrementToMarch30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }

    @Test
    public void testNominalMarch() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 3, 2024);
        System.out.println("testMarchNominal > " + date);
        date.increment();
        System.out.println(date);
    }

    @Test
    public void testMinMarch1ShouldIncrementToMarch2() {
        DateUtil date = new DateUtil(1, 3, 2024);
        System.out.println("march1ShouldIncrementToMarch2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2, date.getDay());
    }

    @Test
    public void testMinMarch1ShouldDecrementToFebruary29() {
        DateUtil date = new DateUtil(1, 3, 2024);
        System.out.println("march1ShouldDecrementToFebruary29 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    /*
	 * Test cases for April
	 */
    
    @Test
    public void testMaxApril30ShouldIncrementToMay1() {
        // April max boundary area: max+1
        DateUtil date = new DateUtil(30, 4, 2024);
        System.out.println("april30ShouldIncrementToMay1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(5, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxApril30ShouldDecrementToApril29() {
        // April max boundary area: max-1
        DateUtil date = new DateUtil(30, 4, 2024);
        System.out.println("april30ShouldDecrementToApril29 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(4, date.getMonth());
    }

    @Test
    public void testNominalApril() {
        int rand_day_1_to_30 = 1 + new Random().nextInt(30);
        DateUtil date = new DateUtil(rand_day_1_to_30, 4, 2024);
        System.out.println("testAprilNominal > " + date);
        date.increment();
        System.out.println(date);
    }

    @Test
    public void testMinApril1ShouldIncrementToApril2() {
        DateUtil date = new DateUtil(1, 4, 2024);
        System.out.println("april1ShouldIncrementToApril2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(2, date.getDay());
    }

    @Test
    public void testMinApril1ShouldDecrementToMarch31() {
        DateUtil date = new DateUtil(1, 4, 2024);
        System.out.println("april1ShouldDecrementToMarch31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }

    /*
	 * Test cases for May
	 */
    
    @Test
    public void testMaxMay31ShouldIncrementToJune1() {
        // May max boundary area: max+1
        DateUtil date = new DateUtil(31, 5, 2024);
        System.out.println("may31ShouldIncrementToJune1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxMay31ShouldDecrementToMay30() {
        // May max boundary area: max-1
        DateUtil date = new DateUtil(31, 5, 2024);
        System.out.println("may31ShouldDecrementToMay30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }

    @Test
    public void testNominalMay() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
        System.out.println("testMayNominal > " + date);
        date.increment();
        System.out.println(date);
    }

    @Test
    public void testMinMay1ShouldIncrementToMay2() {
        DateUtil date = new DateUtil(1, 5, 2024);
        System.out.println("may1ShouldIncrementToMay2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(5, date.getMonth());
        Assert.assertEquals(2, date.getDay());
    }

    @Test
    public void testMinMay1ShouldDecrementToApril30() {
        DateUtil date = new DateUtil(1, 5, 2024);
        System.out.println("may1ShouldDecrementToApril30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(4, date.getMonth());
    }

    		
    /*
	 * Test cases for June
	 */
    
    @Test
    public void testMaxJune30ShouldIncrementToJuly1() {
        // June max boundary area: max+1
        DateUtil date = new DateUtil(30, 6, 2024);
        System.out.println("june30ShouldIncrementToJuly1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxJune30ShouldDecrementToJune29() {
        // June max boundary area: max-1
        DateUtil date = new DateUtil(30, 6, 2024);
        System.out.println("june30ShouldDecrementToJune29 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }

    @Test
    public void testNominalJune() {
        int rand_day_1_to_30 = 1 + new Random().nextInt(30);
        DateUtil date = new DateUtil(rand_day_1_to_30, 6, 2024);
        System.out.println("testJuneNominal > " + date);
        date.increment();
        System.out.println(date);
    }

    @Test
    public void testMinJune1ShouldIncrementToJune2() {
        DateUtil date = new DateUtil(1, 6, 2024);
        System.out.println("june1ShouldIncrementToJune2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2, date.getDay());
    }

    @Test
    public void testMinJune1ShouldDecrementToMay31() {
        DateUtil date = new DateUtil(1, 6, 2024);
        System.out.println("june1ShouldDecrementToMay31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }

    
    /*
	 * Test cases for July
	 */
    
    @Test
    public void testMaxJuly31ShouldIncrementToAugust1() {
        // July max boundary area: max+1
        DateUtil date = new DateUtil(31, 7, 2024);
        System.out.println("july31ShouldIncrementToAugust1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(8, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxJuly31ShouldDecrementToJuly30() {
        // July max boundary area: max-1
        DateUtil date = new DateUtil(31, 7, 2024);
        System.out.println("july31ShouldDecrementToJuly30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(7, date.getMonth());
    }

    @Test
    public void testNominalJuly() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
        System.out.println("testJulyNominal > " + date);
        date.increment();
        System.out.println(date);
    }

    @Test
    public void testMinJuly1ShouldIncrementToJuly2() {
        DateUtil date = new DateUtil(1, 7, 2024);
        System.out.println("july1ShouldIncrementToJuly2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2, date.getDay());
    }

    @Test
    public void testMinJuly1ShouldDecrementToJune30() {
        DateUtil date = new DateUtil(1, 7, 2024);
        System.out.println("july1ShouldDecrementToJune30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }

    
    /*
	 * Test cases for August
	 */
    
    @Test
    public void testMaxAugust31ShouldIncrementToSeptember1() {
        // August max boundary area: max+1
        DateUtil date = new DateUtil(31, 8, 2024);
        System.out.println("august31ShouldIncrementToSeptember1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(9, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxAugust31ShouldDecrementToAugust30() {
        // August max boundary area: max-1
        DateUtil date = new DateUtil(31, 8, 2024);
        System.out.println("august31ShouldDecrementToAugust30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(8, date.getMonth());
    }

    @Test
    public void testNominalAugust() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
        System.out.println("testAugustNominal > " + date);
        date.increment();
        System.out.println(date);
    }

    @Test
    public void testMinAugust1ShouldIncrementToAugust2() {
        DateUtil date = new DateUtil(1, 8, 2024);
        System.out.println("august1ShouldIncrementToAugust2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(8, date.getMonth());
        Assert.assertEquals(2, date.getDay());
    }

    @Test
    public void testMinAugust1ShouldDecrementToJuly31() {
        DateUtil date = new DateUtil(1, 8, 2024);
        System.out.println("august1ShouldDecrementToJuly31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(7, date.getMonth());
    }

    
    /*
	 * Test cases for September
	 */
    
    @Test
    public void testMaxSeptember30ShouldIncrementToOctober1() {
        // September max boundary area: max+1
        DateUtil date = new DateUtil(30, 9, 2024);
        System.out.println("september30ShouldIncrementToOctober1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(10, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxSeptember30ShouldDecrementToSeptember29() {
        // September max boundary area: max-1
        DateUtil date = new DateUtil(30, 9, 2024);
        System.out.println("september30ShouldDecrementToSeptember29 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(9, date.getMonth());
    }

    @Test
    public void testNominalSeptember() {
        int rand_day_1_to_30 = 1 + new Random().nextInt(30);
        DateUtil date = new DateUtil(rand_day_1_to_30, 9, 2024);
        System.out.println("testSeptemberNominal > " + date);
        date.increment();
        System.out.println(date);
    }

    @Test
    public void testMinSeptember1ShouldIncrementToSeptember2() {
        DateUtil date = new DateUtil(1, 9, 2024);
        System.out.println("september1ShouldIncrementToSeptember2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(9, date.getMonth());
        Assert.assertEquals(2, date.getDay());
    }

    @Test
    public void testMinSeptember1ShouldDecrementToAugust31() {
        DateUtil date = new DateUtil(1, 9, 2024);
        System.out.println("september1ShouldDecrementToAugust31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(8, date.getMonth());
    }

    /*
	 * Test cases for October
	 */
    
    @Test
    public void testMaxOctober31ShouldIncrementToNovember1() {
        // October max boundary area: max+1
        DateUtil date = new DateUtil(31, 10, 2024);
        System.out.println("october31ShouldIncrementToNovember1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxOctober31ShouldDecrementToOctober30() {
        // October max boundary area: max-1
        DateUtil date = new DateUtil(31, 10, 2024);
        System.out.println("october31ShouldDecrementToOctober30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(10, date.getMonth());
    }

    @Test
    public void testNominalOctober() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 10, 2024);
        System.out.println("testOctoberNominal > " + date);
        date.increment();
        System.out.println(date);
    }

    @Test
    public void testMinOctober1ShouldIncrementToOctober2() {
        DateUtil date = new DateUtil(1, 10, 2024);
        System.out.println("october1ShouldIncrementToOctober2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(10, date.getMonth());
        Assert.assertEquals(2, date.getDay());
    }

    @Test
    public void testMinOctober1ShouldDecrementToSeptember30() {
        DateUtil date = new DateUtil(1, 10, 2024);
        System.out.println("october1ShouldDecrementToSeptember30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(9, date.getMonth());
    }

    
    /*
	 * Test cases for November
	 */
    
    @Test
    public void testMaxNovember30ShouldIncrementToDecember1() {
        // November max boundary area: max+1
        DateUtil date = new DateUtil(30, 11, 2024);
        System.out.println("november30ShouldIncrementToDecember1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxNovember30ShouldDecrementToNovember29() {
        // November max boundary area: max-1
        DateUtil date = new DateUtil(30, 11, 2024);
        System.out.println("november30ShouldDecrementToNovember29 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(11, date.getMonth());
    }

    @Test
    public void testNominalNovember() {
        int rand_day_1_to_30 = 1 + new Random().nextInt(30);
        DateUtil date = new DateUtil(rand_day_1_to_30, 11, 2024);
        System.out.println("testNovemberNominal > " + date);
        date.increment();
        System.out.println(date);
    }

    @Test
    public void testMinNovember1ShouldIncrementToNovember2() {
        DateUtil date = new DateUtil(1, 11, 2024);
        System.out.println("november1ShouldIncrementToNovember2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(2, date.getDay());
    }

    @Test
    public void testMinNovember1ShouldDecrementToOctober31() {
        DateUtil date = new DateUtil(1, 11, 2024);
        System.out.println("november1ShouldDecrementToOctober31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(10, date.getMonth());
    }
    
    /*
	 * Test cases for December
	 */

    @Test
    public void testMaxDecember31ShouldIncrementToJanuary1() {
        // December max boundary area: max+1
        DateUtil date = new DateUtil(31, 12, 2024);
        System.out.println("december31ShouldIncrementToJanuary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxDecember31ShouldDecrementToDecember30() {
        // December max boundary area: max-1
        DateUtil date = new DateUtil(31, 12, 2024);
        System.out.println("december31ShouldDecrementToDecember30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(12, date.getMonth());
    }

    @Test
    public void testNominalDecember() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 12, 2024);
        System.out.println("testDecemberNominal > " + date);
        date.increment();
        System.out.println(date);
    }

    @Test
    public void testMinDecember1ShouldIncrementToDecember2() {
        DateUtil date = new DateUtil(1, 12, 2024);
        System.out.println("december1ShouldIncrementToDecember2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2, date.getDay());
    }

    @Test
    public void testMinDecember1ShouldDecrementToNovember30() {
        DateUtil date = new DateUtil(1, 12, 2024);
        System.out.println("december1ShouldDecrementToNovember30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(11, date.getMonth());
    }
    
}
