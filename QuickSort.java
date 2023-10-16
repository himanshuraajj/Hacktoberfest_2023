import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        int [] arr={6,3,5,2,8,9};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int pivot_index=partition(arr,low,high);
            quickSort(arr, low, pivot_index-1);
            quickSort(arr, pivot_index+1, high);
        }
    }
    static int partition(int[] arr,int low ,int high){
        int pivot=arr[high];
        int i=low -1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivot index
    }
}
