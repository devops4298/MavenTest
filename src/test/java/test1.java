import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class test1 {


    @Test
    @Step
    @Attachment
    public void openBrowser(){
        WebDriver driver = new SafariDriver();
        driver.navigate().to("https://mvnrepository.com");
    }
}
