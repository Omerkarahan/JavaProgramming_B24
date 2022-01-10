package day57_ploymorphism.driver;

public interface WebElement {

    void sendKeys(String txt);
    void click();
    String getText();
}

/*
create an interface WebElement

    abstract methods:
        get();
        click();
        getText();
 */
