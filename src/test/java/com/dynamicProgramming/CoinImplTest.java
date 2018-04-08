package com.dynamicProgramming;

import org.junit.Test;

public class CoinImplTest {
	@Test
	public void  testFindMinValue() throws Exception{
		CoinImpl coinImpl = new CoinImpl();
		for (int i = 1; i < 19; i++) {
			int aim = i;
			int findMinValue = coinImpl.findMinValue(aim);
			System.out.println(aim+"元需要"+findMinValue+"个硬币");		
		}
		
		
	}
}
