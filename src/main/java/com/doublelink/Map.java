package com.doublelink;

import java.util.ArrayList;
import java.util.List;

public class Map {
	//图的点
	private class Point{
		private int value;
		private int weight;
		private Point next;
	}
	//图的所有点
	private ArrayList<Point> points;
	//广度优先遍历
	//递归
	public void BFS(Point point){
		//遍历
		while (point!=null) {
			System.out.println(" "+point.value);
			while (point.next!=null) {
				BFS(point.next);
				point=point.next;
			}
		}
	}
	//深度优先遍历
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
