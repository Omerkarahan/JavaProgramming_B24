package day54_abstraction.mobile;

public class Phone {
    public static void main(String[] args) {

        MobileApp app1 = new MobileApp();
        app1.setName("Generic");
        app1.setVersion(0.1);
        app1.useApp(10);

        System.out.println();

        Instagram instagram = new Instagram();
       // instagram.name = "instagram";
        instagram.setName("instagram");
        instagram.setVersion(1.1);
        instagram.download();
        instagram.useApp(15);

    }
}
