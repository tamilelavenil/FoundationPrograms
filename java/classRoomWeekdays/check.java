package classRoomWeekdays;

import org.junit.Assert;
import org.junit.Test;

public class check {
	/*
	 * Test data
	 * 4 , 8, 10, 0
	 */
/*
 * The input is integer and output is integer
 * iterate till the length of the number and multiply the numbers
 * eg: if input is 4 then 4*3*2*1
 * return the product
 */
	@Test
	public void test1() {
		Assert.assertEquals(24,Fact(4));	
	}
	@Test
	public void test2() {
		System.out.println(Fact(99999999));	
	}
	
	public long Fact(int inp) {
		long prod=1;
		for (int i = 1; i <= inp; i++) {
			prod*=i;
			
		}
		
		return prod;
		
	}
}
