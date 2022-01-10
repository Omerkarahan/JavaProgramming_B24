package day19_string;

public class MultipleIndexes {

    public static void main(String[] args) {

                    // 0123456789
        String word = "definition";

        System.out.println("first i pos: " + word.indexOf('i'));
        System.out.println("Last i pos: " + word.lastIndexOf('i'));

//        int secondIHardCoded = word.indexOf('i', 3) -> 3
//        int secondIHardCoded = word.indexOf('i', 6) -> 7
//        int secondIHardCoded = word.indexOf('i', 8) -> -1

        int secondIHardCoded = word.indexOf('i', 8);
        System.out.println(secondIHardCoded);

        int firstPos = word.indexOf('i');  //3
        int secondPos = word.indexOf('i', firstPos + 1); // in this example is starts to look from position 4
        int thirdPos = word.indexOf('i',secondPos+1);

        System.out.println("First pos:" + firstPos);
        System.out.println("Second pos: " + secondPos);
        System.out.println("Third pos: " + thirdPos);

        String a = "aaba";
        System.out.println(a.indexOf('a'));
        System.out.println(a.indexOf('a',a.indexOf('a'+ 1)));




    }
}
