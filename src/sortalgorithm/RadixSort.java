package sortalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类似于创建一个二维的链表（第一层链表为0-9号），首先看每个数的个位，如果为0放入0号链表，为1放入1号链表……再对十位，
 * 百位排……。每躺排序后吧链表遍历一遍放入传入的arr中，经过几轮之后就排序完成。
 * 简单来说就是先对个位排序，在对十位排序，再对百位排序，以此类推
 */
public class RadixSort {


    public static void main(String[] args) {
        int[] n = {1,2,5,4,5,8,9,0,45,12,34,67,34,45,90,0,87,78,66,55,44,33,3,3,2,2};
        System.out.println("排序前："+ Arrays.toString(n));
        radixsort(n);
        System.out.println("堆排序后："+Arrays.toString(n));
    }

     static void radixsort(int[] array) {
        //首先确定排序的趟数;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int time = 0;
        //判断位数;
        while (max > 0) {
            max /= 10;
            time++;
        }

        //建立10个队列;
        List<ArrayList> queue = new ArrayList<ArrayList>();
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> queue1 = new ArrayList<Integer>();
            queue.add(queue1);
        }

        //进行time次分配和收集;
        for (int i = 0; i < time; i++) {
            //分配数组元素;
            for (int j = 0; j < array.length; j++) {
                //得到数字的第time+1位数;
                int x = array[j] % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);
                ArrayList<Integer> queue2 = queue.get(x);
                queue2.add(array[j]);
                queue.set(x, queue2);
            }

            int count = 0;//元素计数器;
            //收集队列元素;
            for (int k = 0; k < 10; k++) {
                while (queue.get(k).size() > 0) {
                    ArrayList<Integer> queue3 = queue.get(k);
                    array[count] = queue3.get(0);
                    queue3.remove(0);
                    count++;

                }

            }

        }


    }


}