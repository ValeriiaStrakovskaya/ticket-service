import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestsTicket {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        wd =  new ChromeDriver();
//wd.get("https://ticket-service-69443.firebaseapp.com/");
        wd.navigate().to("https://ticket-service-69443.firebaseapp.com/");
    }

    @Test
    public void testUrl(){


    }
}
