package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//initialization	
@FindBy(id="")
private WebElement username;

@FindBy(id="")
private WebElement password;

@FindBy(xpath="")
private WebElement nextBtn;

@FindBy(xpath="")
private WebElement loginBtn;

//declaration
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void setUsername(String un) {
	username.sendKeys(un);
}

public void clickNext() {
	nextBtn.click();
}

public void setPassword(String pw) {
	password.sendKeys(pw);
}

public void clickLogin() {
	loginBtn.click();
}

}
