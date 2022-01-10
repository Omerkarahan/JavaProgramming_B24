package day54_abstraction.mobile;

public class Instagram extends MobileApp{

    public void postPhoto(){
        System.out.println("Posting phone");

}

@Override
    public void useApp(int minutes){
        super.useApp(minutes);
        postPhoto();
}
}



/*
   ? What do we inherit
    the variables are not inherited


            all the public methods getters and setters
 */
