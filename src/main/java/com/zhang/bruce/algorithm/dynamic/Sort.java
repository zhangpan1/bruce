package com.zhang.bruce.algorithm.dynamic;

/**
 * @description: some desc
 * @author: bruce
 * @email: zhangpan380@gmail.com
 * @date: 2021/12/24 10:17 下午
 */
public class Sort {
    public static void main(String[] args) {

    }
}
class QuickSort {

    public int Partition(int[] a,int low,int high){
        //选取基准元素
        int pivot=a[low];
        while(low < high){
            while(low < high && a[high] >= pivot) --high;//先从右往左，找到第一个比基准元素小的，将该元素填入左哨兵的位置
            a[low]=a[high];
            while(low < high && a[low] <= pivot) ++low;//再从左往右，找到第一个比基准元素大的，将该元素填入右哨兵的位置
            a[high]=a[low];//右哨兵继续走，直到遇见左哨兵，循环结束
        }
        a[low]=pivot;//将基准元素放到相遇的位置
        return low;
    }

    public void QuickSort(int[] a,int low,int high){
        if(low < high){
            int pivotpos=Partition(a,low,high);
            QuickSort(a,low,pivotpos-1);
            QuickSort(a,pivotpos+1,high);
        }
    }

    public static void main(String[] args) {
        int[] a={2,1,3,5,4,7,6};
        QuickSort quickSort=new QuickSort();
        quickSort.QuickSort(a,0,6);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
