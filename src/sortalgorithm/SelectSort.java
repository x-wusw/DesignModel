package sortalgorithm;

import java.util.Arrays;

/**
 * 选择排序算法
 * 在未排序序列中找到最小元素，存放到排序序列的起始位置
 * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
 * 以此类推，直到所有元素均排序完毕。
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] n = {1,2,5,4,5,8,9,0,45,12,34,67,34,45,90,0,87,78,66,55,44,33,3,3,2,2};
        System.out.println("排序前："+ Arrays.toString(n));
        selectSort(n);
        System.out.println("选择排序后："+Arrays.toString(n));

    }

    static void selectSort(int[] n){
        int temp;//中间变量
        for (int i = 0; i < n.length-1; i++) {
            int k = i;
            for (int j = n.length-1; j > i ; j--) {//找到最小值放入第一个位置，依次循环。
                if (n[j]<n[k]){
                   k = j;
                }
            }
            //交换值
            temp = n[k];
            n[k] = n[i];
            n[i] = temp;
        }
    }
}
