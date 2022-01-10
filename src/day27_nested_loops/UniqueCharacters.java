package day27_nested_loops;

public class UniqueCharacters {

    public static void main(String[] args) {

        String s = "lava";
        int count = 0;
        for(int i = 0; i < s.length(); i++){

             // resets count to 0 everytime the outer loop runs

            for(int j = 0; j < s.length(); j++){

                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(s.charAt(i));
            }

        }


    }
}
