package practice.with_eduardo.abstraction2;

public interface RemoteControl {

     void sendSignal();

     default void something() {

     }
}
