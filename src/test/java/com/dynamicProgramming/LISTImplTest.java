package com.dynamicProgramming;

import java.util.Arrays;

import org.junit.Test;

import com.util.MyArrayUtil;

public class LISTImplTest {
	@Test
	public void testPrintArray() throws Exception{
		LISImpl lisImpl = new LISImpl();
		int[] result = lisImpl.creatInfo(10);
		//MyArrayUtil.printArray(result);
		System.out.println();
		lisImpl.findMaxLengthArray(result);
	}
	/*@Test
	public void defau (){
		int[] a = {2,3,6,1,10};
		Arrays.sort(a);
		Arrays.toString(a);
		System.out.println(Arrays.toString(a));
	}*/
}
