package redoFoundation;

import org.junit.Assert;
import org.junit.Test;

public class CoinStaircase {
	@Test
	public void test1() {
		Assert.assertEquals(2, stackCoin(5));

	}
	@Test
	public void test2() {
		Assert.assertEquals(3, stackCoin(8));

	}

	@Test
	public void test4() {
		Assert.assertEquals(4, stackCoin(10));

	}
	@Test
	public void test3() {
		Assert.assertEquals(0, stackCoin(0));

	}

	public int stackCoin(int n) {
		int c = n;
		int count =0;
		if (n>0) {
			for (int i = 1; i <=n; i++) {
				if (c>=0) {
					c = c - i;
					count++;
				}
				else {
					break;
				}
			}
			return count-1;
		}
		return 0;
	}
	
	
}
