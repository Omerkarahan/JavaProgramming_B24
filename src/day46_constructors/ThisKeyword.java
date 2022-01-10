package day46_constructors;

public class ThisKeyword {

    int a = 100;

    public ThisKeyword(int a){
        a = 400;
    }

    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword(200);
        System.out.println(obj.a);

    }

}
