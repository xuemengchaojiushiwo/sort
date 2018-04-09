package com.util;

import java.util.Arrays;

public class MyArrayUtil {
	/**
	 * 
	* @Title: printArray
	* @Description: 打印一维数组
	* @param @param aim    
	* @return void    
	* @throws
	 */
//ffffffffffffffffffffffffffffffffffffffffffff
//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
	//hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
//ooooooooooooooooooooooooooooooooooooooooo
//hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
	
	
	
	
	//xmcxcm
//hhhxmcxcmcxsak
	public static void  printArray(int[] aim){
		System.out.println(Arrays.toString(aim));
	}
	/**
	 * 
	* @Title: printBinaryArray
	* @Description: 打印二维数组
	* @param @param aim    
	* @return void    
	* @throws
	 */
	public static void  printBinaryArray(int[][] aim){
		for (int i = 0; i < aim.length; i++) {
			System.out.println(Arrays.toString(aim[i]));
		}
	}
	/**
	 * 
	* @Title: findMax
	* @Description: 一维数组找最大值
	* @param @param aim
	* @param @return    
	* @return int    
	* @throws
	 */
	public static int findMax(int[] aim){
		int max=0;
		for (int i = 0; i < aim.length; i++) {
			if (aim[i]>max) {
				max=aim[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("mm");
	}
}
