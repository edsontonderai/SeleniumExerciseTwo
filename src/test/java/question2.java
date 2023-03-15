import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class question2 {
    public static void main(String[] args){
        WebDriver driver;
        String baseurl;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseurl = "https:www.wikipedia.org/";

        driver.get(baseurl);
        driver.findElement(By.name("search")).sendKeys("Nelson Mandela");
        driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
        //Display names of starring in the console
        // locate element
        WebElement e = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[37]/td/div/ul/li[1]/a"));


       String expectedElementTitle = "Madiba";
       String actualElementTitle = e.getText();

        //Assert to verify nickname
       Assert.assertEquals(expectedElementTitle, actualElementTitle);


        System.out.println("***********************************");
       System.out.println(actualElementTitle);
        //System.out.println("***********************************");
        driver.close();


    }
}
