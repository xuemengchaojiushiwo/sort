package com.struct;

public class Helper {
	public static void main(String[] args) 
    {
		QuickUnionBetter uf = new QuickUnionBetter(10);
        uf.union(4, 3);
        uf.union(3, 8);
        uf.union(6, 5);
        uf.union(9, 4);
        uf.union(2, 1);
        uf.union(5, 0);
        uf.union(7, 2);
        uf.union(6, 1);
        System.out.println(uf.connected(8, 9));
        System.out.println(uf.connected(1, 0));
        System.out.println(uf.connected(6, 7));
        //打印所有节点
        for (int i = 0; i < 10; i++) {
        	System.out.print(i+" ");
		}
        System.out.println();
        //所有节点find的结果
        for (int i = 0; i < 10; i++) 
        {
            System.out.print(uf.find(i)+" ");
        }
    }

}