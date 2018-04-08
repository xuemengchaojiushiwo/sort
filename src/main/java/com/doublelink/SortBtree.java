package com.doublelink;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SortBtree {
	private class Node {
		private Integer data;
		private Node left;
		private Node right;
		public Integer getData() {
			return data;
		}
		public void setData(Integer data) {
			this.data = data;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
		public Node(Integer data, Node left, Node right) {
			super();
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		
	}
	private Node root;
	private int maxLevel;
	private int count;
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	
	
	public SortBtree() {
		
	}
	public int size(){
		return count;
	}
	private void add(Node data,Node parent,int level){
		if (root==null) {
			root=data;
			maxLevel=1;
			count++;
			return;
		}
		if (data.data<parent.data) {
			if (parent.left!=null) {
				add(data,parent.left,level+1);
			}else {
				parent.left=data;
				if (level+1>maxLevel) {
					maxLevel+=1;
				}
				count++;
			}
			return;
		}
		if (data.data>parent.data) {
			if (parent.right!=null) {
				add(data,parent.right,level+1);
			}else {
				parent.right=data;
				if (level+1>maxLevel) {
					maxLevel+=1;
				}
				count++;
			}
			return;
		}
	}
	public void insert(int data){
		Node dataNode = new Node(data, null, null);
		add(dataNode, root, 1);
	}
	private void firstCheck(Node flag){
		if (flag!=null) {
				System.out.print(flag.data+"  ");			
				firstCheck(flag.left);
				firstCheck(flag.right);	
		}else {
			return;
		}
	}
	private void mediumCheck(Node flag){
		if (flag!=null) {				
				firstCheck(flag.left);
				System.out.print(flag.data+"  ");
				firstCheck(flag.right);	
		}else {
			return;
		}
	}
	private void lastCheck(Node flag){
		if (flag!=null) {						
				firstCheck(flag.left);
				firstCheck(flag.right);	
				System.out.print(flag.data+"  ");
		}else {
			return;
		}
	}
	private void exchangeLeftAndRight(Node flag){
		if (flag==null) {
			return;
		}else if (flag.left!=null||flag.right!=null) {
			Node temp = flag.left;
			flag.left=flag.right;
			flag.right=temp;
			exchangeLeftAndRight(flag.left);
			exchangeLeftAndRight(flag.right);
		}
	}
	private void checkLevel(Node flag,int initlevel,int aimLevel,List list){
		if (flag!=null) {
			if (initlevel==aimLevel) {
				list.add(flag.data.toString());
				//System.out.print(flag.data+" ");
				return;
			}
			checkLevel(flag.left,initlevel+1,aimLevel,list);
			checkLevel(flag.right,initlevel+1,aimLevel,list);	
		}else {
			if (initlevel<=aimLevel) {
				int reduce=(int)Math.pow(2, aimLevel-initlevel);
				//System.out.println("reduce"+reduce);
				for (int i = 0; i < reduce; i++) {
					list.add(" ");
				}
			}
			return ;
		}
		
	}
	public List<String> getLevel(int level){
		List<String> list = new ArrayList<>();
		checkLevel(root,1,level,list);
		//System.out.println("list:::::"+list.toString());
		//System.out.println(list.size());
		return list;
		
	}
	public double getLeftDistance(int level){
		return Math.pow(2, level-1);
		
	}
	private void printLine(int level){
		List<String> list = getLevel(level);
		int distance = (int)getLeftDistance(maxLevel-level+1);
		int everySpace =(int)getLeftDistance(maxLevel-level+2);
		for (int j = 0; j < list.size(); j++) {
			if (j==0) {
				for (int i = 0; i < distance-1; i++) {
					System.out.print(" ");		
				}	
				System.out.print(list.get(j));
				
			}else{
				for (int i = 0; i < everySpace-1; i++) {
					System.out.print(" ");
				}
				   System.out.print(list.get(j));
			}	
		   }
		//System.out.println();
		   
	}
	public void print(){
	    for (int i = 1; i <= maxLevel; i++) {
	    	printLine(i);
			System.out.println();
		}
}
	public static void main(String[] args) {	
		SortBtree sortBtree  = new SortBtree();
		sortBtree.insert(10);
		sortBtree.insert(2);
		sortBtree.insert(15);
		sortBtree.insert(4);
		sortBtree.insert(6);
		//sortBtree.insert(8);
		/*sortBtree.firstCheck(sortBtree.getRoot());
		System.out.println();
		//System.out.println(sortBtree.size());
		//System.out.println(sortBtree.maxLevel);
		//sortBtree.getLevel(1);
		for (int i = 1; i <= sortBtree.maxLevel; i++) {
			sortBtree.getLevel(i);
			System.out.println();
		}
		System.out.println();*/
		//System.out.println(sortBtree.maxLevel);
		//System.out.println(sortBtree.count);
		sortBtree.print();
		//System.out.println(sortBtree.getRoot());
		sortBtree.exchangeLeftAndRight(sortBtree.getRoot());
		sortBtree.print();
	}
}

 