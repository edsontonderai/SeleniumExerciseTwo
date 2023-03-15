package q1POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contactPage {
    public static WebElement element = null;
    public static WebElement enterName(WebDriver driver){element= driver.findElement(By.name("name"));
        return element;
    }
    public static WebElement enterEmail (WebDriver driver){
        element=driver.findElement(By.name("email"));
        return element;
    }
    public static WebElement enterTelephone(WebDriver driver){
        element=driver.findElement(By.name("telephone"));
        return element;
    }
    public static WebElement enterCompany (WebDriver driver){
        element=driver.findElement(By.name("company"));
        return element;
    }
    public static WebElement enterMessage(WebDriver driver){
        element=driver.findElement(By.name("message"));
        return element;
    }
    public static WebElement clickSubmit(WebDriver driver){
        element=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/form/p/a"));
        return element;
    }

}
