package office_hours.practice_09_01_2021;

public class CatAndDogChar {
    public static void main(String[] args) {
        //same number of cat and dogs
        String str = "catanddogca";

        int cat = 0;
        int dog = 0;

        for(int i = 0; i < str.length() - 2; i++){

            if(str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't'){
                cat++;
            }

            if(str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g'){
                dog++;
            }

        }

        System.out.println(cat == dog);



    }
}
