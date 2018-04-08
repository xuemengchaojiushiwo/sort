package com.doublelink;

public interface SanJiaoTaInt {
		//构造三角形
		public void creatSanJiao(int hang);
		//打印三角形
		public void printSanJiao();
		//找最大路径值
		public int findMaxRouteValue(int i,int j,int[][] r);
		//找最大路径值
		public int findMaxRoute(int i,int j,int[][] r,int[][] m);
}
