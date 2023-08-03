package foundation;

import org.junit.Assert;
import org.junit.Test;

public class primeNumber {

	@Test
	public void test1() {
		Assert.assertEquals(true, prime(7));
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, prime(4));
	}
	public boolean prime(int input) {
		if(input<=1) {
			return false;
		}
		if (input%2==0) {
			return false;
		}
		
		else {
			return true;
		}
	}
}
