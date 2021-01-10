package newwPackage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class MyyClass {
	
	private WebDriver driver;
	public MyyClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PERSONAL\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	

    @Test
    public void test01() throws InterruptedException {
        driver.get("http://localhost/new/booksell/login1.php");
        driver.manage().window().maximize();
        
        WebElement username=driver.findElement(By.name("email"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement login= driver.findElement(By.name("submitbtn"));
        username.sendKeys("ami@gmail.com");
        password.sendKeys("123456");
        login.click();
        driver.get("http://localhost/new/booksell/indexuser.php"); 
        Thread.sleep(3000);
        //driver.getWindowHandle();for(String winHandle : driver.getWindowHandles()){driver.switchTo().window(winHandle);}
        
        String engineer=driver.findElement(By.xpath("//a[@href='engineering.php']")).getAttribute("href");
        driver.get(engineer);
        String actualUrl="http://localhost/new/booksell/engineering.php";
        Thread.sleep(3000);
        //String expectedUrl= driver.getCurrentUrl();
        //assertEquals(expectedUrl,actualUrl);
        
        driver.get(actualUrl);
        driver.findElement(By.xpath("//img[@src='img/C Sharpe.jpg']"));
        WebElement inputElement = driver.findElement(By.name("quantity"));
        inputElement.clear();
        inputElement.sendKeys("100");
        WebElement cart= driver.findElement(By.name("add_to_cart"));
        cart.click();
        Thread.sleep(3000);

        
        driver.get("http://localhost/new/booksell/cart.php");
        WebElement checkout=driver.findElement(By.xpath("//a[@href='shippingpage.php']"));
        checkout.click();
        driver.get("http://localhost/new/booksell/shippingpage.php");
        WebElement shipping = driver.findElement(By.id("confirm_order"));
        shipping.click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();

        
        driver.get("http://localhost/new/booksell/indexuser.php");      
        WebElement logout=driver.findElement(By.xpath("//a[@href='user.php']"));
        logout.click();
        Thread.sleep(5000);
        WebElement out=driver.findElement(By.xpath("//a[@href='logout.php']"));
        out.click();
        driver.get("http://localhost/new/booksell/index.php");      
        Thread.sleep(3000);
        driver.close();       
    }

    
}
