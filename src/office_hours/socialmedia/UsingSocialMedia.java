package office_hours.socialmedia;

public class UsingSocialMedia {
    public static void main(String[] args) {

        FacebookUser fatma = new FacebookUser("FatmaJava", "asasdsdsa", "Fatima O");
        System.out.println(fatma);

        System.out.println(FacebookUser.platform);

        fatma.post("Oh today we had a good office hours");
        System.out.println("I am regretting more java");

        System.out.println(fatma.getAllPost());

        FacebookUser malika = new FacebookUser("MalikaSDET", "asddfdsfsdf", "Malika Z", 21, 5000);
        System.out.println(malika);
        malika.DirectMessage(fatma, "hello!");

    }
}
