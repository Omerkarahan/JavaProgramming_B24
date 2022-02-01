package practice.homework;

import java.util.Arrays;

public class SortAscending{
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(Ascending(arr)));

    }


    public static int [] Ascending(int [] arr){

        int min = arr[0];
        for( int i =0; i < arr.length; i++){
            for ( int j = i+ 1; j < arr.length; j++){
                if ( arr[i] > arr[j] ){
                    min = arr[j];
                    arr[j]= arr[i];
                    arr [i] = min;
                }
            }
        }
        return arr;
    }
}
/*
1. Array -- Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
int[] arr = {10, 9, 8, 7};
arr = Sort(arr);==>{ 7, 8, 9, 10};

 */