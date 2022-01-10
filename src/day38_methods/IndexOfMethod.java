package day38_methods;

public class IndexOfMethod {

    /*

        Create a method that will accept an array and element return the index of first occurrence of the element

        if the element does not exist in our array, we will return - 1

        start with int array

        after: overload to work with String array

     */

    public static void main(String[] args) {

        String [] arr = {"a", "b", "c"};
        int index = indexOf(arr,  "b");
        System.out.println(index);

        System.out.println(indexOf(arr, "A"));

    }

    public static int indexOf(int [] nums, int element){

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String [] arr, String element){

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

}
