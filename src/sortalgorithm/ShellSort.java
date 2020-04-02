package sortalgorithm;

import java.util.Arrays;

/**希尔排序的原理:根据需求，如果你想要结果从大到小排列，它会首先将数组进行分组，然后将较大值移到前面，较小值
 * 移到后面，最后将整个数组进行插入排序，这样比起一开始就用插入排序减少了数据交换和移动的次数，可以说希尔排序是加强
 * 版的插入排序
 * 拿数组5, 2, 8, 9, 1, 3，4来说，数组长度为7，当increment为3时，数组分为两个序列
 * 5，2，8和9，1，3，4，第一次排序，9和5比较，1和2比较，3和8比较，4和比其下标值小increment的数组值相比较
 * 此例子是按照从大到小排列，所以大的会排在前面，第一次排序后数组为9, 2, 8, 5, 1, 3，4
 * 第一次后increment的值变为3/2=1,此时对数组进行插入排序，
 *实现数组从大到小排
 */

public class ShellSort {
    public static void main(String[] args) {
        int[] n = {1,2,5,4,5,8,9,0,45,12,34,67,34,45,90,0,87,78,66,55,44,33,3,3,2,2};
        System.out.println("排序前："+ Arrays.toString(n));
        shellsort(n);
        System.out.println("希尔排序后："+Arrays.toString(n));


    }
    static void shellsort(int[] n){
        int i,j,temp;
        int increment;
        for (increment = n.length/2; increment > 0; increment/=2) {
            for (i = increment; i < n.length; i++) {
                temp = n[i];
                for (j = i; j >= increment; j-=increment) {
                    if(temp>n[j-increment]){//此处是从大排到小，改成<则是从小到大
                        n[j]=n[j-increment];//把大的值往前排
                    }else {
                        break;
                    }
                }
                n[j]=temp;
            }
        }
    }
}
