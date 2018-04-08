package com.dynamicProgramming;
/**
 * 
* @ClassName: SanjiaoTaObj
* @Description: 三角塔对象
* @author xuemengchao
* @date 2017年12月11日 上午10:28:15
*
 */
public class SanjiaoTaObj {
	//三角塔的层数
	private int level;
	//三角塔数据
	private int[][] data;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int[][] getData() {
		return data;
	}
	public void setData(int[][] data) {
		this.data = data;
	}
	/**
	 * 用1000以内的整数生成一个三角塔对象
	 * @param level
	 */
	public SanjiaoTaObj(int level) {
		super();
		//初始化数据
		this.level = level;
		this.data= new int[level][level];
		//生成1000以内的随机数，并根据层数填充到三角塔二维数组
		for (int i = 0; i <level; i++) {
			for (int j = 0; j <= i; j++) {
				int value=(int)(1000*Math.random());
				data[i][j]=value;
			}
		}
		
	}
	
	
}
