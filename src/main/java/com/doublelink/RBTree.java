package com.doublelink;


import java.util.logging.Level;



public class RBTree {
	private Node root;
	private int maxLevel;
	private int count; 
	
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public int getMaxLevel() {
		return maxLevel;
	}
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	//左旋
	public void leftXuan(){
		
	}
	//右旋
	public void rightXuan(){
		
	}
	//调整红黑树
	public void adjust(){
		
	}
	//获取子树高度 	direct 0 左 1右
	public int SonTreeLevel(Node node,int direct){
		
		return 0;
	}
	//判断是否需要变形
	public String isAdust(){
		//如果左子树level大于右子树level超过1，return “left”
		//如果右子树大于左子树level超过1，return "right"
		//否则返回no
		return "";	
	}
	//判断此level颜色
	public int levelColor(int level){
		if (level%2==1) {
			return 1;
		}else {
			return 0;
		}
		
	}
	//直接插入数据
	public void insertData(Node node,Node flag,int level){
		//搜索二叉树的插入方法
		//root不存在，添加root，增加level，增加count
		if (root==null) {
			root=node;
			count+=1;
			maxLevel=1;
		}
		//root存在，判断往root左边插入还是右边插入，插入成功count+1，如果进入下一层，level+1
		if (flag!=null) {
			if (flag.getData()>node.getData()) {
				if (flag.getLeft()==null) {
					flag.setLeft(node);
					count+=1;
					if (level+1>maxLevel) {
						maxLevel+=1;
					}
				}else {
					insertData(node, flag.getLeft(),level+1);
				}
			}
			if (flag.getData()<node.getData()) {
				if (flag.getRight()==null) {
					flag.setRight(node);
					count+=1;
					if (level+1>maxLevel) {
						maxLevel+=1;
					}
				}else {
					insertData(node, flag.getRight(),level+1);
				}			
			}
		}
	}
	//添加并调整结构
	public void add(Node node){
		//插入数据
		insertData(node, root, 1);
		//判断是否需要变形
		
		//变形
		
	}
	//移除数据
	public void remove(){
			
	}
	//先序遍历
	public void firstCheck(Node flag){
		if (flag!=null) {
			System.out.println(flag.getData()+" ");
			firstCheck(flag.getLeft());
			firstCheck(flag.getRight());
		}
	}
	
	public static void main(String[] args) {
		RBTree aRbTree = new RBTree();
		Node node = new Node(10, null, null);
		Node node1 = new Node(2, null, null);
		Node node2 = new Node(12, null, null);
		Node node3 = new Node(4, null, null);
		Node node4 = new Node(6, null, null);
		aRbTree.insertData(node, aRbTree.root, 1);
		aRbTree.insertData(node1, aRbTree.root, 1);
		aRbTree.insertData(node2, aRbTree.root, 1);
		aRbTree.insertData(node3, aRbTree.root, 1);
		aRbTree.insertData(node4, aRbTree.root, 1);
		aRbTree.firstCheck(aRbTree.root);
	}
	
}
