package day30_array;

public class ForEachLoop {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 5};

        for(int i = 0; i < nums.length; i++){
            int eachNumber = nums[i];
            System.out.println("number " + eachNumber);
        }

        System.out.println();

        for(int eachNumber : nums){
            System.out.println("number " + eachNumber); // eachNumber = nums[i]
        }

        String [] strs = {"java", "selenium", "db", "api"};

        for(int i = 0; i < strs.length; i++){
            System.out.println(strs[i]);
        }

        for(String word : strs){
            System.out.println(word);
        }
    }
}
