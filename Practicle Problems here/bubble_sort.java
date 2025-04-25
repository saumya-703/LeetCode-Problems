//package Practicle Problems here;

import java.util.Arrays;

public class bubble_sort {
    public static int[] sorting(int [] arr){
        int l= arr.length;
        for(int i=0;i<l;i++){
            for(int j=0; j<l-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1,5};
        System.out.println(Arrays.toString(sorting(arr)));
    }
}
