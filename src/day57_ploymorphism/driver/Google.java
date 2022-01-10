package day57_ploymorphism.driver;

public class Google {
    public static void main(String[] args) {

        WebElement elm1 = new Link();

        WebElement elm2 = new Input();

        WebDriverUtil.clickElement(elm1);

        WebDriverUtil.clickElement(elm2);
    }
}
