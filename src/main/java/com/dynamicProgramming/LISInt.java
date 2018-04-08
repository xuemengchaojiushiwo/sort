package com.dynamicProgramming;
/**
 * 
* @ClassName: LISInt
* @Description: 最大递增子序列
* @author xuemengchao
* @date 2017年12月12日 上午10:17:19
*
 */
public interface LISInt {
	/**
	 * 
	* @Title: creatInfo
	* @Description: 根据长度新建一个1000以内数字的随机数组
	* @param @param length
	* @param @return    
	* @return int[]    
	* @throws
	 */
	public  int[] creatInfo(int length);
	/**
	 * 
	* @Title: findMaxLengthArray
	* @Description: 获取最大递增序列
	* @param @param aim    
	* @return void    
	* @throws
	 */
	public  void  findMaxLengthArray(int[] aim);
	/**
	 * 
	* @Title: printArray
	* @Description: 打印序列
	* @param @param aim    
	* @return void    
	* @throws
	 */
	public void printArray(int[] aim);
	
}
