package sortalgorithm;

import java.util.Arrays;

public class  HeapSort {
    public static void main(String[] args) {
        int[] n = {1,2,5,4,5,8,9,0,45,12,34,67,34,45,90,0,87,78,66,55,44,33,3,3,2,2};
        System.out.println("排序前："+ Arrays.toString(n));
        for (int i = 0; i < n.length; i++) {
            //循环建堆
            buildheap(n,n.length-1-i);
            //交换堆顶和最后一个元素
            swap(n,0,n.length-1-i);
            //System.out.println("堆排序后："+Arrays.toString(n));
        }
        System.out.println("堆排序后："+Arrays.toString(n));


    }

    //建大顶堆
    static void buildheap(int[] n,int lastIndex){
        //从lastIndex的父节点开始
        for (int i = (lastIndex-1)/2; i >= 0 ; i--) {
                int k = i;//k保存正在判断的节点
            //如果当前的子节点存在
                while (2*k+1<lastIndex){
                    //k节点的左节点索引
                    int bigIndex = 2*k+1;
                    if(bigIndex<lastIndex){//k节点的右子节点存在
                        if(n[bigIndex]<n[bigIndex+1]){//右子节点大于左子节点
                            bigIndex++;//bigIndex总是记录较大节点
                        }
                    }
                    //如果k节点的子节点值大于k节点,交换他们
                    if(n[k]<n[bigIndex]){
                        swap(n,k,bigIndex);
                        //将bigIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
                        k = bigIndex;
                    }else {
                        break;
                    }
            }
        }

    }
    //交换函数
    static void swap(int[] n,int i,int j){
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }
}
