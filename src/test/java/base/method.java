package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class method extends baseClass{
    public WebElement findElement(String path, String type){
        WebElement e= null;
        switch (type) {
            case "id":
                e = driver.findElement(By.id(path));
                break;
            case "xpath":
                e = driver.findElement(By.xpath(path));
                break;
            case "css":
                e = driver.findElement(By.cssSelector(path));
                break;
            case "name":
                e= driver.findElement(By.name(path));
        }
        return e;
    }
    public List<WebElement> findElements(String path, String type){
        List <WebElement> e= null;
        switch (type) {
            case "id":
                e = driver.findElements(By.id(path));
                break;
            case "xpath":
                e = driver.findElements(By.xpath(path));
                break;
            case "css":
                e = driver.findElements(By.cssSelector(path));
                break;
            case "name":
                e = driver.findElements(By.name(path));
        }
        return e;
    }
    public void clickElement(String path, String type){
        WebElement e = findElement(path,type);
        e.click();
    }
    public void setElement(String path, String type, String text){
        WebElement e = findElement(path,type);
        e.sendKeys(text);
    }

    public void hoverElement(String path,String type){
        WebElement x = findElement(path,"xpath");
        Actions action = new Actions(driver);
        action.moveToElement(x).perform();
    }
}
