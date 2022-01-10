package day12_if_statements;

import java.util.Scanner;

public class ChooseLanguage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose your language. Pick the number you want");
        System.out.println("\t1)English\n\t2)Spanish\n\t3)Turkish\n\t4)Russian\n\t5)French");
        int selection = input.nextInt();
        String message = "";

        if(selection == 1){
            message = "hello, thanks for your call";
        }else if(selection == 2){
          message = "hola, gracias para llamar";
        }else if(selection==3){
           message = "merhaba, aradiginiz icin tesekkurler";
        }else if(selection == 4){
           message ="privet, spasibo za yash zvonok";
        }else if(selection == 5){
          message = "merci, pour votre appel";
        }else{
            message = "lets talk in english, hello";
        }
        System.out.println(message);
    }
}
