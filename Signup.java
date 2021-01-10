package newwPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class Signup {
	
	private WebDriver driver;
	public Signup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PERSONAL\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/new/booksell/signup1.php");
        driver.manage().window().maximize();
	}
	
	
    @Test
    public void validtest() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("name")); 
        WebElement email=driver.findElement(By.name("email"));
        WebElement number=driver.findElement(By.name("phonenumber")); 
        WebElement password=driver.findElement(By.name("password"));
        WebElement verify=driver.findElement(By.id("conpassword"));

        username.sendKeys("am55i");  
        email.sendKeys("ami@mail.com");
        number.sendKeys("11111111111");  
        password.sendKeys("123456");
        verify.sendKeys("123456");  
        
        String val1 = username.getAttribute("value");
        String val2 = email.getAttribute("value");
        String val3 = number.getAttribute("value");
        String val4 = password.getAttribute("value");
        String val5 = verify.getAttribute("value");
   
        WebElement signup= driver.findElement(By.name("submitbtn")); 
        signup.click();  
        Thread.sleep(2000);
        String act=driver.getCurrentUrl();
        String exp="http://localhost/new/booksell/login1.php"; 
        assertEquals(act,exp);
        assertNotEquals(act,exp);
        assertNotEquals("am55i",val1);
        assertNotEquals("ami@mail.com",val2);
        assertNotEquals("11111111111",val3);
        assertNotEquals("123456",val4);
        assertNotEquals("123456",val5);
        driver.close();
    }
    
    @Test
    public void nulluser() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("name")); 
        WebElement email=driver.findElement(By.name("email"));
        WebElement number=driver.findElement(By.name("phonenumber")); 
        WebElement password=driver.findElement(By.name("password"));
        WebElement verify=driver.findElement(By.id("conpassword"));

        username.sendKeys("");  
        email.sendKeys("ami@mail.com");
        number.sendKeys("01625547789");  
        password.sendKeys("123456");
        verify.sendKeys("123456");  
        
        String val1 = username.getAttribute("value");
        String val2 = email.getAttribute("value");
        String val3 = number.getAttribute("value");
        String val4 = password.getAttribute("value");
        String val5 = verify.getAttribute("value");
   
        WebElement signup= driver.findElement(By.name("submitbtn")); 
        signup.click();  
        Thread.sleep(2000);
        String act=driver.getCurrentUrl();
        String exp="http://localhost/new/booksell/login1.php"; 
        assertNotEquals(act,exp);
        assertNotEquals(act,exp);
        assertNotEquals("",val1);
        assertNotEquals("ami@mail.com",val2);
        assertNotEquals("01625547789",val3);
        assertNotEquals("123456",val4);
        assertNotEquals("123456",val5);
        driver.close();
    }
    
    @Test
    public void nullmemail() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("name")); 
        WebElement email=driver.findElement(By.name("email"));
        WebElement number=driver.findElement(By.name("phonenumber")); 
        WebElement password=driver.findElement(By.name("password"));
        WebElement verify=driver.findElement(By.id("conpassword"));

        username.sendKeys("am55gfi");  
        email.sendKeys("");
        number.sendKeys("01625547789");  
        password.sendKeys("123456");
        verify.sendKeys("123456");  
        
        String val1 = username.getAttribute("value");
        String val2 = email.getAttribute("value");
        String val3 = number.getAttribute("value");
        String val4 = password.getAttribute("value");
        String val5 = verify.getAttribute("value");
   
        WebElement signup= driver.findElement(By.name("submitbtn")); 
        signup.click();  
        Thread.sleep(2000);
        String act=driver.getCurrentUrl();
        String exp="http://localhost/new/booksell/login1.php"; 
        assertNotEquals(act,exp);
        assertNotEquals(act,exp);
        assertNotEquals("am55gfi",val1);
        assertNotEquals("",val2);
        assertNotEquals("01625547789",val3);
        assertNotEquals("123456",val4);
        assertNotEquals("123456",val5);
        driver.close();
    }
    
    @Test
    public void nullphone() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("name")); 
        WebElement email=driver.findElement(By.name("email"));
        WebElement number=driver.findElement(By.name("phonenumber")); 
        WebElement password=driver.findElement(By.name("password"));
        WebElement verify=driver.findElement(By.id("conpassword"));

        username.sendKeys("am55i");  
        email.sendKeys("ami@mail.com");
        number.sendKeys("");  
        password.sendKeys("123456");
        verify.sendKeys("123456");  
        
        String val1 = username.getAttribute("value");
        String val2 = email.getAttribute("value");
        String val3 = number.getAttribute("value");
        String val4 = password.getAttribute("value");
        String val5 = verify.getAttribute("value");


   
        WebElement signup= driver.findElement(By.name("submitbtn")); 
        signup.click();  
        Thread.sleep(2000);
        String act=driver.getCurrentUrl();
        String exp="http://localhost/new/booksell/login1.php"; 
        assertNotEquals(act,exp);
        assertNotEquals("am55i",val1);
        assertNotEquals("ami@mail.com",val2);
        assertNotEquals("",val3);
        assertNotEquals("123456",val4);
        assertNotEquals("123456",val5);
        
        driver.close();
    }
    
    @Test
    public void nullpass() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("name")); 
        WebElement email=driver.findElement(By.name("email"));
        WebElement number=driver.findElement(By.name("phonenumber")); 
        WebElement password=driver.findElement(By.name("password"));
        WebElement verify=driver.findElement(By.id("conpassword"));

        username.sendKeys("am55i");  
        email.sendKeys("ami@mail.com");
        number.sendKeys("01625547789");  
        password.sendKeys("");
        verify.sendKeys("");  
        
        String val1 = username.getAttribute("value");
        String val2 = email.getAttribute("value");
        String val3 = number.getAttribute("value");
        String val4 = password.getAttribute("value");
        String val5 = verify.getAttribute("value");
   
        WebElement signup= driver.findElement(By.name("submitbtn")); 
        signup.click();  
        Thread.sleep(2000);
        String act=driver.getCurrentUrl();
        String exp="http://localhost/new/booksell/login1.php"; 
        assertNotEquals(act,exp);
        assertNotEquals(act,exp);
        assertNotEquals("am55i",val1);
        assertNotEquals("ami@mail.com",val2);
        assertNotEquals("01625547789",val3);
        assertNotEquals("",val4);
        assertNotEquals("",val5);
        driver.close();
    }
   
}