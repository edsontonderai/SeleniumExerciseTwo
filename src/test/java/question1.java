import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import q1POMPages.contactPage;

public class question1 {

        WebDriver driver;
        String baseurl;

        @Before
        public void setup(){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            baseurl = "https://datamateinc.com/contact";
            driver.manage().window().maximize();
        }

        @Test
            public void Test1() throws InterruptedException{

            //locate website
            driver.get(baseurl);
            contactPage.enterName(driver).sendKeys("Edson Mukandabvute");
            contactPage.enterEmail(driver).sendKeys("emk@google.com");
            contactPage.enterTelephone(driver).sendKeys("0876358423");
            contactPage.enterCompany(driver).sendKeys("ECODEX");
            contactPage.enterMessage(driver).sendKeys("selenium practice exercise 2 question 1");
            contactPage.clickSubmit(driver).click();
            Thread.sleep(4000);
        }

        @After
        public void teardown(){
            driver.quit();

        }
}
