package com.doublelink;

public class Node {
	private Integer data;
	private Node left;
	private Node right;
	private int color; //0红1黑
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
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
