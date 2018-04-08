package com.dynamicProgramming;

import com.util.MyArrayUtil;

public class CoinImpl implements CoinInt {

	@Override
	public int findMinValue(int aimData) {
		// TODO Auto-generated method stub
		int [] base = {1,2,5};
		int[] assistA = new int[aimData];
		int[] assistB = new int[aimData];
		int findMinWayRec = findMinWayRec(aimData, base,assistA,assistB);
		System.out.print(aimData+"元组合方式：");
		for (int i = assistB.length-1; i >= 0;) {
			if (i!=0&&i-assistB[i]>=0) {
				System.out.print(assistB[i]+"+");
			}else{
				System.out.print(assistB[i]);
			}
				
			
			i-=assistB[i];
		}
		System.out.println();
		MyArrayUtil.printArray(assistB);
		return findMinWayRec;
	}
	/**
	 * 
	* @Title: findMinWayRec
	* @Description: 递归找最下组合方式方法
	* @param @param data
	* @param @param base
	* @param @return    
	* @return int    
	* @throws
	 */
	public int findMinWayRec(int data,int base[],int[] assistA,int[] assistB){
		//循环终止条件
		if (data>0&&assistA[data-1]!=0) {
			return assistA[data-1];
		}
		if (data==0) {
			return 0;
		}
		if (data==1) {
			assistB[data-1]=1;
			return 1;
		}else{
			//比较几种不同路径结果，找出最小的组合,
			int min=(int)Double.POSITIVE_INFINITY;
			int coin =0;
			int a =0;
			for (int i = 0; i < base.length&&data-base[i]>=0; i++) {
				int  current = findMinWayRec(data-base[i], base,assistA,assistB);
				if (min>=current) {
					min=current;
					coin=base[i];
					a=data-base[i];
				}	 
			}
			assistB[data-1]=coin;
			assistA[data-1]=min+1;
			return min+1;
		}
		
		
	}
	@Override
	public void findMinWay(int aimData) {
		// TODO Auto-generated method stub
		
	}

}
