package day34_methods;

public class GetCharacters {
    /*

    -make method that will print all the letters from A to Z

    -make method that will print all the letters from a to z

    -make method that will print all the letters from Z to A

    -make method that will print all the letters from z to a

    -make method that will print all the letters from 0 to 9


     */

    // Print all the uppercase letter from A to Z


    public static void printAtoZInUppercase(){
        for(int i = 'A'; i <= 'Z'; i++){
            System.out.print( (char)i + " ");
        }
        System.out.println();
    }

    // Print all the lowercase letter from a to z

    public static void printAtoZInLowercase(){
        for(int i = 'a'; i <= 'z'; i++){
            System.out.print( (char)i + " ");
        }
        System.out.println();
    }

    // Print all the number digits from 0 to 9

    public static void print0To9(){
        for(int i = '0'; i <= '9'; i++){
            System.out.print( (char)i + " ");
        }
        System.out.println();
    }

    // Print all the uppercase letters from Z to A

    public static void printZtoAInUppercase(){
        for(int i = 'Z'; i >= 'A'; i--){
            System.out.print( (char)i + " ");
        }
        System.out.println();
    }

    // Print all the lowercase letters from z to a

    public static void printZtoAInLowercase(){
        for(int i = 'z'; i >= 'a'; i--){
            System.out.print( (char)i + " ");
        }
        System.out.println();
    }
}