package pl.b2b.eurobank.pages.savingsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodSavingsPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public MethodSavingsPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = DataSavingsPage.START_ASSERT)
    private WebElement startAssert;

    public WebElement getStartAssert() {
        return startAssert;
    }
}
