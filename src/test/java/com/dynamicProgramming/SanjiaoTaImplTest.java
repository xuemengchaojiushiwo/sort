package com.dynamicProgramming;

import org.junit.Test;
public class SanjiaoTaImplTest  {

	@Test
    public void testCreatObj() throws Exception {
		SanjiaoTaImpl sanjiaoTaImpl = new SanjiaoTaImpl();
		SanjiaoTaObj creatObj = sanjiaoTaImpl.creatObj(5);
		sanjiaoTaImpl.printSanjiaoTa(creatObj);
    }
	@Test
	public void testFindMaxRoute()throws Exception{
		SanjiaoTaImpl sanjiaoTaImpl = new SanjiaoTaImpl();
		SanjiaoTaObj creatObj = sanjiaoTaImpl.creatObj(5);
		sanjiaoTaImpl.printSanjiaoTa(creatObj);	
		sanjiaoTaImpl.findMaxRoute(creatObj);
		System.out.println();
		int findMaxValue = sanjiaoTaImpl.findMaxValue(creatObj);
		System.out.println(findMaxValue);
	}


}
