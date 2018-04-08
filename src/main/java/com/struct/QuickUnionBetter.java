package com.struct;



public class QuickUnionBetter {
    private int[] mParents;
    
    //新加一个数组用来记录每一个节点,以它为根的元素的个数。
    //mSize[i]表示以i为根的树结构中的元素个数。
    private int[] mSize;
    private int mCount;
    public QuickUnionBetter(int capacity){
        mCount = capacity;
        mParents = new int[mCount];
        mSize = new int[mCount];
        for (int i = 0; i < mCount; i++) {
            mParents[i] = i;
            //默认每个都是1：独立的时候含有一个元素.
            mSize[i] = 1;
        }
    }
    boolean connected(int p,int q) //判断两点是否连通
    { return find(p) == find(q);}
  //为防止极端的情况，可以再在find的时候经行路径压缩有两种压缩方法：
    //   1)、一层层的跳着压缩(隔一层走一下):
    //      就是当前节点的父节点parent[i]指向它父节点的parent,此时当前节点的父节点的
    //      parent不用担心不存在,因为不存在时parent会指向自己！这也是我们退出循环的条件
    //   2)、压缩到深度只有两层
    //      利用递归实现，让最终只有树形集合中除了根意外其它节点都在第二层.
    // 理论上看第二种广度更大，应该时间更少，实测很多时候甚至比第一种多一点点。个人感觉可能是
    // 由于一是用了递归,而这种方式在quick-union这种情况下优化费的步骤过于多.
    public int find(int p){
        if(p < 0||p > mParents.length){
            //异常处理
        }
        while(p!=mParents[p]){
             //首先是拿到父节点的父节点指向，然后赋值给当前节点的父节点。
             //也就是parent[p]：当前节点的父节点;
             //mParents[mParents[p]]:当前节点的父节点的父节点指向。
             mParents[p] = mParents[mParents[p]];
             //然后是当前节点跳一下，直接指向新得到的mParents[p].
             p = mParents[p];
             //继续循环
        }
        /*//第二种:通过如下，递归调用本函数find,
        //mParents[p]为当前节点的父节点的索引,循环传入(递归)直到根节点
        //p == mParents[p] 返回当前节点的索引，然后就层层返回。
        if(p!=mParents[p]){
            //其实也不该考虑一层层的就，考虑这一层,当前节点的索引和父节点不同,
            //也就是说当前不是根节点，那么传入父节点的索引,递归调用把上个节点的父节点
            //传给当前节点的父节点。
            mParents[p] = find( mParents[p] );
        }
        //因为最终走到这的是根节点，根节点的parent是自己.
        return mParents[p];*/
        return p;
    }
    //联合的时候就需要用到mSize了.看看那个节点为根的树形集合中元素多，
    //然后把少的那个节点对应的根，指向多的那个节点对应的根。
    public void union(int p,int q){
        //前两步不变
        int pRoot= find(p);
        int qRoot = find(q);
        if(pRoot == qRoot){
            return;
        }
        int pSize = mSize[pRoot];//初始事都是根，为1
        int qSize = mSize[qRoot];
        //如果pRoot为根的树形集合含有的元素比qRoot的多
        if(pSize > qSize){
            //注意是少的索引的父节点指向多的
            mParents[qRoot] = pRoot;
            //注意此时mSize的改变,由于qRoot归并到了pRoot当中那么
            //需要加上相应数量的size，注意qRoot对应的size并没有改变
            mSize[pRoot] = pSize+qSize;
        }/*else if(pSize < qSize){//同理
            mParents[pRoot] = qRoot;
            mSize[qRoot] = pSize+qSize;
        }else{//如果两个相等那么就无所谓了，谁先合并到谁都可以.
            mParents[qRoot] = pRoot;
            mSize[pRoot] = pSize+qSize;
        }*/
        //然后就可以把等于的合入到大于或者小于的里面.
        else{//此处把小于和等于合到一块
            mParents[pRoot] = qRoot;
            mSize[qRoot] = pSize+qSize;
        }
    }
    
    public void show(){
    	for (int i = 0; i < mSize.length; i++) {
			System.out.print(mSize.toString());
		}
    }
}

