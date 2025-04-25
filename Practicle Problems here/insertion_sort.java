//package Practicle Problems here;

import java.util.Arrays;

public class insertion_sort {
        public static int[] sorting(int [] arr){
            int l= arr.length;
            for(int i=1;i<l;i++){
                int temp=arr[i];
                int j=i;
                int index=i;
                while(j>0){
                    if(arr[j-1]>temp){
                        arr[j]=arr[j-1];
                        index=j-1;
                    }
                    j--;
                }
                arr[index]=temp;
            }
            return arr;
        }
        public static void main(String[] args) {
            int arr[]={4,3,2,1,5};
            System.out.println(Arrays.toString(sorting(arr)));
        }
}
