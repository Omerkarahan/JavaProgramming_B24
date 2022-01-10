package practice.loops;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        String java = "java";
        String python = "python";
        int javaCounter = 0;
        int pythonCounter = 0;

        for (int n =0; n < sentence.length() - 3; n++){
            if (sentence.substring(n, n +4).equals("java")){
                javaCounter++;
            }
        }
        for (int i = 0; i < sentence.length() - 5; i++){
            if (sentence.substring(i, i + 6).equals("python")){
                pythonCounter++;
            }
        }
        System.out.println(pythonCounter == javaCounter);

    }
}
