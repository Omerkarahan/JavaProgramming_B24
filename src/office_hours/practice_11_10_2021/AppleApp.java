package office_hours.practice_11_10_2021;

public interface AppleApp extends Downloadable{

    String APP_STORE_NAME = "Apple Store";

    void facetime();

}

/*
    when inherit from interface to class
        implements
     when you inherit from interface to another interface
        extend
     when you inherit from class to class
        extend
Create an interface named AppleApps that can inherit from downloadable
    Interface variable: AppStoreName
    abstract method(): facetime();
 */
