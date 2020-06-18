import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivermanagertest {
    @BeforeClass
    public static void setup(){
        WebDriverManager.firefoxdriver().setup();
    }

    @Test
    public void launchApp(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://clubs.scholastic.com/home");
        driver.quit();
    }






}
