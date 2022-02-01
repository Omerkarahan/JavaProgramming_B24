package interview;

public class ArrayMaxAndMin {

    public static int arrayMax(int [] arr){

        int min = arr[0];
        int max = arr[0];
        for (int each :arr){
            if(each > max){
                max = each;
            }
            if(each< min){
                min=each;
            }
        }
        return max;
    }
    public static int arrayMin(int [] arr){

        int min = arr[0];
        int max = arr[0];
        for (int each :arr){
            if(each< min){
                min=each;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr = {5,2,3,6,4};
        System.out.println("max = " + arrayMax(arr));
        System.out.println("min = " + arrayMin(arr));
    }
}
