package redoFoundation;



import org.junit.Assert;
import org.junit.Test;

public class MajorityElement {
	@Test
	public void test1() {

		Assert.assertEquals(2, majorityEle(new int[] {2,2,1,1,1,2,2}));
	}

	
	public int majorityEle(int[] num) {
		int out =0;
		for (int i = 0; i < num.length; i++) {
			int count = 0;
			for (int j = 0; j < num.length; j++) {
				if (num[i]==num[j]) {
					count++;
					
				}
			}	
			if (count>num.length/2) {
				out=num[i];
			}
		}
		
		return out;
	}

}
