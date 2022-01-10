package day54_abstraction.mobile;

public class Discord extends MobileApp{

    public void chat(){
        System.out.println("Chatting on " + getName());
    }

    // chat method is like postPhoto method in Instagram - just an extra instance method unique to the child class

    @Override
    public void useApp(int minutes){
        super.useApp(minutes);
        chat();
    }

    // Override the useApp method to again call the super version - that will show us how many minutes the app is used for AND call our new action of chat every time we use the app

}