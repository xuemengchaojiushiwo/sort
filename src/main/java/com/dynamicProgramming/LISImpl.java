package com.dynamicProgramming;

import java.util.Arrays;

import com.util.MyArrayUtil;

public class LISImpl implements LISInt {

	@Override
	public int[] creatInfo(int length) {
		// TODO Auto-generated method stub
		int [] result = {9,5,7,1,2,8} ;
		/*for (int i = 0; i < length; i++) {
			int value=(int)(10*Math.random()+1);
			result[i]=value;
		}*/
		return result;
	}

	@Override
	public void findMaxLengthArray(int[] aim) {
		// TODO Auto-generated method stub
		int [] assistA = new int [aim.length];	
		int [] assistB = new int[aim.length];
		findMaxLengthArrayRec(aim, aim.length-1, assistA, assistB);
		MyArrayUtil.printArray(assistA);
		MyArrayUtil.printArray(assistB);
		System.out.println(Arrays.toString(aim)+"最大递增序列长度为:"+MyArrayUtil.findMax(assistB));

	}
	/**
	 * 
	* @Title: findMaxLengthArrayRec
	* @Description: 递归调用找最大递增子数组
	* @param @param aim
	* @param @param currentPoint
	* @param @param assistA
	* @param @param assistB		缓存数组。
	* @param @return    
	* @return int    
	* @throws
	 */
	private void findMaxLengthArrayRec(int [] aim ,int currentPoint,int []assistA,int[] assistB){
		//缓存
		if (assistB[currentPoint]!=0) {
			return;
		}
		//结束条件
		if (currentPoint==0) {
			assistB[currentPoint]=1;
			assistA[currentPoint]=1;
		}else {
			//递归体
			int max = 1;
			int currentValue=0;
			//最大时的位置
			int maxPoint = 0;
			//TODO 要么递增序列+1
			for (int i = 0; i <currentPoint; i++) {
				if (aim[currentPoint]-aim[i]>0) {
					findMaxLengthArrayRec(aim, currentPoint-1, assistA, assistB);
					 currentValue=assistB[i]+1;
					if (currentValue-max>0) {
						max=currentValue;
						maxPoint=currentPoint+1;
					}
			//TODO 要么递增序列归最大值不增
				}else if (aim[currentPoint]-aim[i]==0) {
					findMaxLengthArrayRec(aim, currentPoint-1, assistA, assistB);
					currentValue=assistB[i];
					if (currentValue-max>0) {
						max=currentValue;
						maxPoint=currentPoint+1;
					}
				} else{			
					findMaxLengthArrayRec(aim, currentPoint-1, assistA, assistB);
				}
			}
			int[] copyOf = Arrays.copyOf(assistB, currentPoint);
			assistB[currentPoint]=max;
		}	
	}
	
	@Override
	public void printArray(int[] aim) {
		// TODO Auto-generated method stub
		for (int i = 0; i < aim.length; i++) {
			System.out.print(aim[i]+" ");
		}
	}

}
