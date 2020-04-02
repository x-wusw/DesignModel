package sortalgorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */

public class BubbleSort {

    public static void main(String[] args)  {
      int[] n = {1,2,5,4,5,8,9,0,45,12,34,67,34,45};
      System.out.println("排序前："+ Arrays.toString(n));
        for (int i = 0; i < n.length; i++) {
            for (int j = 0;j < n.length-i-1;j++){
                if (n[j]>n[j+1]){
                    int temp = n[j];
                    n[j]  = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡排序后："+Arrays.toString(n));

    }
}
