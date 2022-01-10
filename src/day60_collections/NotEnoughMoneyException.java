package day60_collections;

public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException(){
        super("Your balance is either negative or zero");
    }

}
/*
Exception class is the parent of all exceptions. All direct child classes of Exception lcass are checked exceptions
RuntimeException class is the child of Exception but it is also the parent of all unchecked exceptions
 */
