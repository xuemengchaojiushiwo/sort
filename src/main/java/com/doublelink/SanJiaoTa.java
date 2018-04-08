package com.doublelink;

import java.util.Scanner;

public class SanJiaoTa implements SanJiaoTaInt {
	private class SanJiaoXing{
		private int Line;
		private int[][] detail;
		public SanJiaoXing(int hang) {
			super();
			Line = hang;
			this.detail = new int[hang][hang];
		}
		
	}
	public SanJiaoXing sanJiaoXing;
	/*@Override
	public void creatSanJiao(int hang) {
		// TODO Auto-generated method stub
		sanJiaoXing = new SanJiaoXing(hang);
		Scanner scanner = new Scanner(System.in);
		//用户输入创建参数
		for (int i = 0; i <sanJiaoXing.Line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println("请输入第"+(i+1)+"行第"+(j+1)+"个数：");	
				sanJiaoXing.detail[i][j]=scanner.nextInt();
			}
		}
		//构造
	}*/
	@Override
	public void creatSanJiao(int hang) {
		// TODO Auto-generated method stub
		sanJiaoXing = new SanJiaoXing(hang);
		//用户输入创建参数
		for (int i = 0; i <sanJiaoXing.Line; i++) {
			for (int j = 0; j <= i; j++) {
				sanJiaoXing.detail[i][j]=i+j+1;
			}
		}
		//构造
	}

	@Override
	public void printSanJiao() {
		// TODO Auto-generated method stub
		for (int i = 0; i < sanJiaoXing.Line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(sanJiaoXing.detail[i][j]+" ");	
			}
			System.out.println();
		}
	}

	@Override
	public int findMaxRouteValue(int i ,int j,int [][] r) {
		// TODO Auto-generated method stub
		int max;
		if (r[i][j]!=0) {
			return r[i][j];
		}
		if(i==sanJiaoXing.Line-1) {
			 max=sanJiaoXing.detail[i][j]+0;
			r[i][j]=max;
			return max;
		}else {
			max=Math.max(findMaxRouteValue(i+1,j,r), findMaxRouteValue(i+1,j+1,r));
			r[i][j]=max;
			System.out.println(max);
			//System.out.println(max);
			return sanJiaoXing.detail[i][j]+max;
		}
		
		
	}
	@Override
	public int findMaxRoute(int i, int j,int [][] r,int[][] m) {
		//找到路径
		//打印路径
		int max;
		if (r[i][j]!=0) {
			return r[i][j];
		}
		if(i==sanJiaoXing.Line-1) {
			 max=sanJiaoXing.detail[i][j]+0;
			r[i][j]=max;
			return max;
		}else {
			if (findMaxRoute(i+1,j,r,m)>findMaxRoute(i+1,j+1,r,m)) {
				max=findMaxRoute(i+1,j,r,m);
				m[i][j]=-1;
			}else {
				max=findMaxRoute(i+1,j+1,r,m);
				m[i][j]=1;
			}
			r[i][j]=max;
			//System.out.println(max);
			return sanJiaoXing.detail[i][j]+max;
		}
	}
	public static void main(String[] args) {
		SanJiaoTa aJiaoTa = new SanJiaoTa();
		System.out.println("请输入三角塔的行数：");
		Scanner scanner = new Scanner(System.in);
		int hang =  scanner.nextInt();
		aJiaoTa.creatSanJiao(hang);
		int [][] r=  new int[hang][hang];
		int[][] m = new int[hang][hang];
		System.out.println("打印三角形");
		aJiaoTa.printSanJiao();
		System.out.println("最长路径：");
		System.out.println(aJiaoTa.findMaxRoute(0,0,r,m));
		System.out.println("记录值");
		for (int i = 0; i < hang; i++) {
			for (int j = 0; j < hang ; j++) {
				System.out.print(r[i][j]+" ");	
			}
			System.out.println();
		}
		System.out.println("路径：");
		int j =0;
		for (int i = 0; i < hang; i++) {
			System.out.print(aJiaoTa.sanJiaoXing.detail[i][j]);
			if (m[i][j]==-1) {
				System.out.print("->");
				j-=1;
			}
			if (m[i][j]==1) {
				System.out.print("->");
				j+=1;
			}
		}
	}

	
	
}
