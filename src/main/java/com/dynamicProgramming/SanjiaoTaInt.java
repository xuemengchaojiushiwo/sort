package com.dynamicProgramming;
/**
 * 
* @ClassName: SanjiaoTaInt
* @Description: 三角塔接口
* @author xuemengchao
* @date 2017年12月11日 上午10:17:39
*
 */
public interface SanjiaoTaInt {
	/**
	 * 
	* @Title: creatObj
	* @Description: TODO
	* @param @param level 生成的三角塔的层数
	* @param @return    
	* @return SanjiaoTaObj    
	* @throws
	 */
	public SanjiaoTaObj creatObj(int level);
	/**
	 * 
	* @Title: findMaxRoute
	* @Description: 找到三角塔最大的路径
	* @param @param sanjiaoTaObj    
	* @return void    
	* @throws
	 */
	public void findMaxRoute(SanjiaoTaObj sanjiaoTaObj);
	/**
	 * 
	* @Title: findMaxValue
	* @Description: 找到三角塔最大的路径的总和
	* @param @param sanjiaoTaObj
	* @param @return    
	* @return int    
	* @throws
	 */
	public int findMaxValue(SanjiaoTaObj sanjiaoTaObj);
	/**
	 * 
	* @Title: printSanjiaoTa
	* @Description: 打印三角塔对象
	* @param @param sanjiaoTaObj    
	* @return void    
	* @throws
	 */
	public void printSanjiaoTa(SanjiaoTaObj sanjiaoTaObj);
}
