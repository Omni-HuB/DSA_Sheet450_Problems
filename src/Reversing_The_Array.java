import java.util.*;

public class Reversing_The_Array {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8};
//      //  reverse(arr);
        System.out.println(Arrays.toString(reverseTwoPointer(arr)));
    }

//    public static void reverse(int[] arr ){
//
//            for(int i=arr.length-1; i>=0;i--){
//                System.out.println(arr[i]);
//            }
//    }

    public static int[] reverseTwoPointer(int[] arr){
        int i =0;
        int j =arr.length-1;
        while(i<j){

            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
