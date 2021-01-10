package newwPackage;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class login {
	
	private WebDriver driver;
	public login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PERSONAL\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/new/booksell/login1.php");
        driver.manage().window().maximize();
	}
	
	
	@Test
    public void test01() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("email")); 
        WebElement password=driver.findElement(By.name("password"));
        username.sendKeys("ami@gmail.com"); 
        password.sendKeys("123456");
        String val = username.getAttribute("value");
        String vall = password.getAttribute("value");

        WebElement login= driver.findElement(By.name("submitbtn")); login.click();  Thread.sleep(2000);
        String act=driver.getCurrentUrl();String exp="http://localhost/new/booksell/indexuser.php"; 
        assertEquals(act,exp);

        assertEquals("ami@gmail.com",val);
        assertEquals("123456",vall);
    }
    
	@Test
    public void test02() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("email")); 
        WebElement password=driver.findElement(By.name("password"));
        username.sendKeys("ami@gmail.com");  
        password.sendKeys("");
        String val = username.getAttribute("value");
        String vall = password.getAttribute("value");
        
        WebElement login= driver.findElement(By.name("submitbtn")); login.click();  Thread.sleep(2000);
        String act=driver.getCurrentUrl();String exp="http://localhost/new/booksell/indexuser.php"; 
        assertNotEquals(act,exp);
        assertEquals("ami@gmail.com",val);
        assertEquals("",vall);
    }

	@Test
    public void test03() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("email")); 
        WebElement password=driver.findElement(By.name("password"));
        username.sendKeys("");  
        String val = username.getAttribute("value");
        password.sendKeys("123456");
        String vall = password.getAttribute("value");
        
        WebElement login= driver.findElement(By.name("submitbtn")); login.click();  Thread.sleep(2000);
        String act=driver.getCurrentUrl();String exp="http://localhost/new/booksell/indexuser.php"; 
        assertNotEquals(act,exp);
        assertEquals("",val);
        assertEquals("123456",vall);
    }

	@Test    
    public void test04() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("email")); 
        WebElement password=driver.findElement(By.name("password"));
        username.sendKeys("");  
        String val = username.getAttribute("value");
        password.sendKeys("");
        String vall = password.getAttribute("value");
        
        WebElement login= driver.findElement(By.name("submitbtn")); login.click();  Thread.sleep(2000);
        String act=driver.getCurrentUrl();String exp="http://localhost/new/booksell/indexuser.php"; 
        assertNotEquals(act,exp);
        assertEquals("",val);
        assertEquals("",vall);
    }
    
	@Test
    public void test05() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("email")); 
        WebElement password=driver.findElement(By.name("password"));
        username.sendKeys("amigmail.com");  
        String val = username.getAttribute("value");
        password.sendKeys("123456");
        String vall = password.getAttribute("value");
        
        WebElement login= driver.findElement(By.name("submitbtn")); login.click();  Thread.sleep(2000);
        String act=driver.getCurrentUrl();String exp="http://localhost/new/booksell/indexuser.php"; 
        assertNotEquals(act,exp);
        assertEquals("amigmail.com",val);
        assertEquals("123456",vall);
    }
    
}