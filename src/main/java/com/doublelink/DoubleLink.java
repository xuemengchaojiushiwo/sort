package com.doublelink;

import javax.xml.crypto.Data;


public class DoubleLink {
	private class Node{
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
	
	////////////////////////////
	private Node head;
	private Node tail;
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	@Override
	public String toString() {
		return "DoubleLink [head=" + head + ", tail=" + tail + "]";
	}
	public DoubleLink() {
		super();
		this.head = null;
		this.tail = null;
	}
	private void addFirst(Integer data){
		Node now= new Node(data, null, null);
		if (head==null) {
			head=now;
			tail=now;
		}else {
			now.right=head;
			head.left=now;
			head=now;
		}
	}
	private void addLast (Integer data){
		Node now= new Node(data, null, null);
		/*if (head.data==null) {
			head=now;
			head.right=tail;
			tail.left=head;
		}else {
			now.left=tail.left;
			now.right=tail.left.right;
			//倒数第二个no
			tail.left.right=now;
			tail.left=now;
			
		}*/
		if (head==null) {
			head=now;
			tail=now;
		}else {
			tail.right=now;
			now.left=tail;
			tail=now;
		}
	}
	public void remove(int index){
		int count=0;
		Node flag=head;
		while(flag!=null) {
			if (count==index) {
				if (flag.left==null) {
					head=flag.right;
					head.left=null;
					break;
				}
				if (flag.right==null) {
					//System.out.println(flag.data);
					tail=flag.left;
					tail.right=null;
					break;
				}
				///System.out.println(head.data);
				///System.out.println("11111");
				//head.left.right=head.right;
				flag.right.left=flag.left;
				flag.left.right=flag.right;
				//System.out.println(flag.left.right.data);
				//System.out.println(flag.right.left.data);
				break;
			}
			flag=flag.right;
			count++;
			
		}
		
	}
	public void add(int index,int data){
		int count=0;
		Node flag=head;
		while(flag!=null){
			if (count==index) {
				if(flag.left==null){
					addFirst(data);
					return ;
				}
				if(flag.right==null){
					addLast(data);
					return ;
					
				}
				Node now= new Node(data, null, null);
				//System.out.println(flag.left.data);
				
				now.left=flag.left;
				now.right=flag;
				flag.left.right=now;
				flag.left=now;
				//System.out.println(now.left.data);
				//System.out.println(now.right.data);
				return ;
			}
			flag=flag.right;
			count++;
		}
	}
	public void check(Node head){
		while(head!=null) {
			/*System.out.println(head);
			System.out.println(tail);
			System.out.println(head.left+"="+head.data+"="+head.right);
			System.out.println(tail.left+"="+tail.data+"="+tail.right);
			*/
			if (head.right!=null) {
				System.out.print(head.data+"=");
			}
			if (head.right==null) {
				System.out.print(head.data);
			}
			head=head.right;
		}
	}
	public static void main(String[] args) {
		DoubleLink aDoubleLink = new DoubleLink();
		aDoubleLink.addLast(1);
		aDoubleLink.addLast(3);
		aDoubleLink.addLast(5);
		aDoubleLink.addFirst(4);		
		//System.out.println(aDoubleLink);
		aDoubleLink.check(aDoubleLink.getHead());
		System.out.println();
		//aDoubleLink.remove(3);
		aDoubleLink.add(1,9);
		aDoubleLink.check(aDoubleLink.getHead());
		//aDoubleLink.check(aDoubleLink.getHead());
	}
	//头部添加
	//尾部添加
	//删除
	//遍历

}
