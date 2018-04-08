package com.struct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
public class PicImpl implements PicInt {
	private int[] points= {1,3,5,7,9};
	private int[][] route={{0,1,1,0,1},{1,0,1,1,0},{1,1,0,0,1},
			{0,1,0,0,1},{1,0,1,1,0}};
	/* 临时保存路径节点的栈 */  
    public static Stack<Integer> stack = new Stack<Integer>();  
    /* 存储路径的集合 */  
    public static ArrayList<Object[]> sers = new ArrayList<Object[]>(); 
	public PicImpl() {	
	}

	public int[] getPoints() {
		return points;
	}

	public void setPoints(int[] points) {
		this.points = points;
	}

	public int[][] getRoute() {
		return route;
	}

	public void setRoute(int[][] route) {
		this.route = route;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("  "+Arrays.toString(points));
		for (int i = 0; i < route.length; i++) {
			System.out.print(points[i]+" ");
			System.out.println(Arrays.toString(route[i]));
		}
	}

	@Override
	public void Deep() {
		// TODO Auto-generated method stub
		boolean[] status = new boolean[points.length];
		DeepRec(1, status);
	}
	/**
	 * 
	* @Title: DeepRec
	* @Description: 深度优先搜索递归
	* @param     
	* @return void    
	* @throws
	 */
	public void DeepRec(int i,boolean[] status){
		//结束条件	
		//循环体
		status[i]=true;
		System.out.print(points[i]+" ");
		for (int j = 0; j < route[i].length; j++) {
			if (status[j]==false) {
				DeepRec(j, status);
			}
		}
	}

	@Override
	public void findRoute(int start, int end) {
		// TODO Auto-generated method stub
		findRouteRec(start, end, route);
		
	}
	public boolean findRouteRec(int start,int end ,int [][]route){
			return false;
	}
	public static void showAndSavePath()  
    {  
        Object[] o = stack.toArray();  
        for (int i = 0; i < o.length; i++) {  
            int nNode = (int) o[i];  
              
            if(i < (o.length - 1))  
                System.out.print(nNode + "->");  
            else  
                System.out.print(nNode);  
        }  
        sers.add(o); /* 转储 */  
        System.out.println("\n");  
    }  
}
