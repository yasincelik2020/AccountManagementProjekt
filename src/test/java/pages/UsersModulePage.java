package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersModulePage {
    @FindBy(xpath = "//a[.='Login']")
    public WebElement LoginButton;
}
