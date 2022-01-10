package day48_static;

public class MoreChaining {
    public MoreChaining(){
        System.out.println("First");
    }
    public MoreChaining(int i){
        //MoreChaining(); we can not use the name to call another constructor, we could use this()
        this();

    }
    public MoreChaining(String s){
        System.out.println("String one");
        // this(5); any this() call needs to be the first line always
    }
//    public MoreChaining(double d){
//        this(10);
//        this("java");
//    }
    // we can only call one constructor

//    public MoreChaining(char c){
//        this('d');
//    }

    // it is not possible to call itself

  /*
       public MoreChaining(float f){
   this(true);
    }
    public MoreChaining(boolean b){
        this(4.5f);
    }

   */
 // above is invalid because the float constructor called the boolean constructor, which calls the float constructor, etc



}
