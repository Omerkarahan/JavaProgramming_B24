package office_hours.practice_09_01_2021;

public class CatAndDogSub {

    public static void main(String[] args) {


        String word = "catanddogca";

        int cat = 0;
        int dog = 0;

        for(int i = 0; i < word.length() - 2; i++){

            String eachThreeLetters = word.substring(i, i + 3);

            if(eachThreeLetters.equals("cat")){
                cat++;
            }
               if(eachThreeLetters.equals("dog")){
                   dog++;
               }
        }
        System.out.println(cat == dog);
        /*
        word.substring(0,3) -> cat
        word.substring(1,4) -> ata
         */


    }
}
