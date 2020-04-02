package sortalgorithm;

import java.util.Arrays;

/**
 * 插入排序
 *
 * 从第一个元素开始，该元素可以认为已经被排序
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 * 将新元素插入到该位置中
 * 重复步骤2
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] n = {1,2,5,4,5,8,9,0,45,12,34,67,34,45,90,0,87,78,66,55,44,33,3,3,2,2};
        System.out.println("排序前："+ Arrays.toString(n));
        insertSort(n);
        System.out.println("插入排序后："+Arrays.toString(n));

    }
    static void insertSort(int[] n){
        int temp,j;
        for (int i = 0; i < n.length; i++) {
            temp=n[i];
            for (j = i; j > 0 && temp<n[j-1]; j--) {
                    n[j]=n[j-1];//把大的值放后面
            }
            n[j]=temp;
        }
    }
}




