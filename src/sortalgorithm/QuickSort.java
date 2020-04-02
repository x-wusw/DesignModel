package sortalgorithm;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * 快速排序
 * 在要排的数（比如数组A）中选择一个中心值key（比如A[0]），通过一趟排序将数组A分成两部分，
 * 其中以key为中心，key右边都比key大，key左边的都key小，然后对这两部分分别重复这个过程，直到整个有序。
 * 整个快排的过程就简化为了一趟排序的过程，然后递归调用就行了。
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] n = {1,2,5,4,5,8,9,0,45,12,34,67,34,45,90,0,87,78,66,55,44,33,3,3,2,2};
        System.out.println("排序前："+ Arrays.toString(n));
        long start = System.currentTimeMillis();
        if (n.length>0){
           quicksort(n,0,n.length-1);
        }
       /* for (int i = 0; i < 100; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }*/
        long end = System.currentTimeMillis();
        System.out.println("快速排序后:"+Arrays.toString(n));
        System.out.println("花费时间："+(end-start));

    }
    static void quicksort(int[] n,int low,int high){
        //找到递归入口
        if(low>high){
            return;
        }
        int i,j;
        i = low;
        j = high;
        int key = n[low];//以第一个值为关键字
        while(i<j){
            while (i<j&&n[j]>key){j--;}//从右向左找到第一个比key小的值，没找到就high--，依次循环
            while (i<j&&n[i]<=key){i++;}//从左向右找到第一个比key大的值，没找到就low++，依次循环
            //交换
            int temp = n[i];
            n[i] = n[j];
            n[j] = temp;
        }
        //调整key的位置
        int temp1 = n[i];
        n[i] = n[low];
        n[low] = temp1;
        //递归
        quicksort(n,low,i-1);//key左边排序
        quicksort(n,i+1,high);//key右边排序
    }
}
