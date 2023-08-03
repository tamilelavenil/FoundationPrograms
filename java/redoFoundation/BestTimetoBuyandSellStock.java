package redoFoundation;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class BestTimetoBuyandSellStock {
	@Test
	public void test1() {
		Assert.assertEquals(5, maxProfit(new int[] {7,1,5,3,6,4}));	
	}


	@Test
	public void test2() {
		Assert.assertEquals(0, maxProfit(new int[] {7,6,4,3,1}));	
	}
	
	public int maxProfit(int[] arr) {
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]-arr[i]>max) {
					max = arr[j]-arr[i];
				}
			}
		}
		
		return max;
		
	}
}
