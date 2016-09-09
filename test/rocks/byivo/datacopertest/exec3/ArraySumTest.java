package rocks.byivo.datacopertest.exec3;

import static org.junit.Assert.*;

import org.junit.Test;

import rocks.byivo.datacopertest.exec2.ArraySum;
import rocks.byivo.datacopertest.exec2.InvalidInput;
import rocks.byivo.datacopertest.exec2.OutOfRange;

public class ArraySumTest {

	@Test(expected=InvalidInput.class)
	public void not10MultipleLowerTest() {
		new ArraySum(11);
	}
	
	@Test(expected=InvalidInput.class)
	public void not10MultipleBiggerTest() {
		new ArraySum(999);
	}
	
	@Test()
	public void all10MultiplesTest() {
		new ArraySum(10);
		new ArraySum(100);
		new ArraySum(1000);
		new ArraySum(90);
		new ArraySum(230);
		new ArraySum(240);
	}
	
	@Test(expected=OutOfRange.class)
	public void outOfRangeLowerTest() {
		new ArraySum(9);
	}
	
	@Test(expected=OutOfRange.class)
	public void outOfRangeLower10MultipleTest() {
		new ArraySum(0);
	}
	
	@Test(expected=OutOfRange.class)
	public void outOfRangeBiggerTest() {
		new ArraySum(1001);
	}
	
	@Test(expected=OutOfRange.class)
	public void outOfRangeBigger10MultipleTest() {
		new ArraySum(1010);
	}
	
	@Test()
	public void worksAllGoodRandomTest() {
		ArraySum arraySum = new ArraySum(200);
		
		Integer[] filledArray = new Integer[]{20,40,180,80,100,360,140,160,540,200};
		assertArrayEquals(filledArray, arraySum.getFilledArray());
		
		int oddSum = arraySum.sumOdds();
		int evenSum = arraySum.sumEvens();
		
		assertEquals(980, oddSum);
		assertEquals(840, evenSum);
	}
	
	@Test()
	public void worksAllGoodLowerTest() {
		ArraySum arraySum = new ArraySum(10);
		
		Integer[] filledArray = new Integer[]{1, 2, 9, 4,5,18,7,8,27,10};
		assertArrayEquals(filledArray, arraySum.getFilledArray());
		
		int oddSum = arraySum.sumOdds();
		int evenSum = arraySum.sumEvens();
		
		assertEquals(49, oddSum);
		assertEquals(42, evenSum);
	}
	
	@Test()
	public void worksAllGoodBiggerTest() {
		ArraySum arraySum = new ArraySum(1000);
		
		Integer[] filledArray = new Integer[]{100, 200, 900, 400,500,1800,700,800,2700,1000};
		assertArrayEquals(filledArray, arraySum.getFilledArray());
		
		int oddSum = arraySum.sumOdds();
		int evenSum = arraySum.sumEvens();
		
		assertEquals(4900, oddSum);
		assertEquals(4200, evenSum);
	}

}
