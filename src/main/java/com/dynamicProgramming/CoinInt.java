package com.dynamicProgramming;

public interface CoinInt {
	/**
	 * 
	* @Title: findMinValue
	* @Description: 找到组合指定的值需要的硬币数
	* @param @param aimData
	* @param @return    
	* @return int    
	* @throws
	 */
	public int findMinValue(int aimData);
	/**
	 * 
	* @Title: findMinWay
	* @Description: 找到组合指定值的硬币组合方式
	* @param @param aimData    
	* @return void    
	* @throws
	 */
	public void findMinWay(int aimData);

}
