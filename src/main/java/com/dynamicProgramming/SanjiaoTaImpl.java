package com.dynamicProgramming;

public class SanjiaoTaImpl  implements SanjiaoTaInt{

	@Override
	public SanjiaoTaObj creatObj(int level) {
		// 生成随机数并填充三角塔
		SanjiaoTaObj sanjiaoTaObj = new SanjiaoTaObj(level);
		return sanjiaoTaObj;
	}

	@Override
	public void findMaxRoute(SanjiaoTaObj sanjiaoTaObj) {
		// TODO Auto-generated method stub
		int level = sanjiaoTaObj.getLevel();
		int [][] assistA = new int[level][level];
		int [][] assistB = new int[level][level];
		findMaxRouteRec(0, 0, sanjiaoTaObj, assistA, assistB);
		printMaxRoute(sanjiaoTaObj, assistB);
	}
	/**
	 * 
	* @Title: findMaxRouteRec
	* @Description: 递归获取最大路径
	* @param @param i	当前位置横坐标
	* @param @param j	当前位置纵坐标
	* @param @param sanjiaoTaObj	三角塔对象
	* @param @param assistA			辅助数组A 记录计算结果
	* @param @param assistB			辅助数组B 记录行走轨迹
	* @param @return    
	* @return int    
	* @throws
	 */
	private int findMaxRouteRec(int i ,int j,SanjiaoTaObj sanjiaoTaObj,int[][]assistA,int[][]assistB){
		//辅助数组避免重复路径计算
		//辅助数据记录路径轨迹
		int max = 0;
		//递归终止条件
		if (assistA[i][j]!=0) {
			return assistA[i][j];
		}
		if (i==sanjiaoTaObj.getLevel()-1) {
			max=0;
			return sanjiaoTaObj.getData()[i][j]+max;
		}else {
			//递归路径
			if (findMaxRouteRec(i+1, j, sanjiaoTaObj,assistA,assistB)>findMaxRouteRec(i+1, j+1, sanjiaoTaObj,assistA,assistB)) {
				max=findMaxRouteRec(i+1, j, sanjiaoTaObj,assistA,assistB);
				assistB[i][j]=-1;
			}else {
				max=findMaxRouteRec(i+1, j+1, sanjiaoTaObj,assistA,assistB);
				assistB[i][j]=1;
			}
			assistA[i][j]=max+sanjiaoTaObj.getData()[i][j];
			return max+sanjiaoTaObj.getData()[i][j];
		}
	}
	/**
	 * 
	* @Title: printMaxRoute
	* @Description: 打印最大路径
	* @param @param sanjiaoTaObj
	* @param @param assistB    
	* @return void    
	* @throws
	 */
	private void printMaxRoute(SanjiaoTaObj sanjiaoTaObj,int[][]assistB){
		
		for (int i = 0,j=0; i <assistB.length; i++) {
			int [][] data =sanjiaoTaObj.getData();
			//如果值为-1，打印三角塔下一行右移一位的数字;
			//如果值为1，打印三角塔下一行同列的数字;
			if (assistB[i][j]==1) {
				System.out.print(data[i][j]+"->");
				j++;
			}
			else if (assistB[i][j]==-1) {
				System.out.print(data[i][j]+"->");
			}else {
				System.out.print(data[i][j]);
			}
		}
	}
	@Override
	public int findMaxValue(SanjiaoTaObj sanjiaoTaObj) {
		// TODO Auto-generated method stub
		int level = sanjiaoTaObj.getLevel();
		int [][] assistA = new int[level][level];
		int [][] assistB = new int[level][level];
		int findMaxRouteRec = findMaxRouteRec(0, 0, sanjiaoTaObj, assistA, assistB);
		return findMaxRouteRec;
	}
	
	@Override
	public void printSanjiaoTa(SanjiaoTaObj sanjiaoTaObj) {
		// TODO Auto-generated method stub
		int[][] data = sanjiaoTaObj.getData();
		for (int i = 0; i <sanjiaoTaObj.getLevel(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(data[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
