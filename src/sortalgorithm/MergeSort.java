package sortalgorithm;

import java.util.Arrays;

/**
 * 归并排序
 * 简介:将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，每个子序列是有序的。
 * 然后再把有序子序列合并为整体有序序列
 * 时间复杂度为O(nlogn)
 * 稳定排序方式
 * @return 输出有序数组
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] n = {1,2,5,4,5,8,9,0,45,12,34,67,34,45,90,0,87,78,66,55,44,33,3,3,2,2};
        System.out.println("排序前："+ Arrays.toString(n));
        sort(n,0,n.length-1);
        System.out.println("归并排序后："+Arrays.toString(n));


    }
    static int[] sort(int[] n,int low,int high){
        int mid = (high+low)/2;
        if(low<high){
            sort(n,low,mid);
            sort(n,mid+1,high);
            mergesort(n,low,mid,high);
        }
        return n;
    }
    static void mergesort(int[] n,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i = low;//左边数组起始下标
        int j = mid+1;//右边数组起始下标
        int k = 0;
        while (i<=mid&&j<=high){
            if(n[i]<n[j]){//左边小于右边，把左边的加入新数组temp中
                temp[k++] = n[i++];
            }else {//右边小于左边，把右边的加入新数组temp中
                temp[k++] = n[j++];
            }
        }
        while (i<=mid){//把左边剩余的加入新数组temp中
            temp[k++] = n[i++];
        }
        while (j<=high){//把右边剩余的加入新数组temp中
            temp[k++] = n[j++];
        }
        for (int l = 0; l < temp.length; l++) {//把新数组覆盖原数组
            n[l+low]=temp[l];
        }
     }

}
