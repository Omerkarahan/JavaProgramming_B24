package Java_Interview_Coding_Task.Java_Task_1;

public class q3_removeDuplicates {
    /**
    (String)Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC

     */


        public static void main(String[] args) {
            String word="aaabbccdddeeef";
            System.out.println(removeDub(word));
            System.out.println(frequency(word));

        }

        public static String removeDub(String word){
            String result="";
            for (int i = 0; i < word.length(); i++) {
                if(!result.contains(""+word.charAt(i))){
                    result+=word.charAt(i);
                }

            }

            return result;
        }
        public static String frequency(String word){
            String result="";
            String unique=removeDub(word); //abcdef


            for (int i = 0; i < unique.length(); i++) {

                int count=0;

                for (int j = 0; j < word.length(); j++) {
                    if(unique.charAt(i)==word.charAt(j)){
                        count++;
                    }

                }
                result+=""+unique.charAt(i)+count;
            }

            return result;
        }
    }