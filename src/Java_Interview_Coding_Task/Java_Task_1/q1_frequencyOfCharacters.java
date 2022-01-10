package Java_Interview_Coding_Task.Java_Task_1;

public class q1_frequencyOfCharacters {
    /**
    (STRING)Write a return method that can find the frequency of characters
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        System.out.println(FrequencyOfChar("AAABBCDD"));
    }

public static String FrequencyOfChar(String str){
    
 String expectedResult="";
 int j=0;
 while (j<str.length()){
     int count=0;
     for (int i = 0; i < str.length(); i++) {
if(str.charAt(i)==str.charAt(j)){
    count++;
}
     }
     expectedResult+=str.charAt(j)+""+count;
     str=str.replace(""+str.charAt(j),"");

 }
    return expectedResult;
    
    }
            


    

    }
