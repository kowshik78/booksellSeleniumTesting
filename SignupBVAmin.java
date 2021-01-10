package newwPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class SignupBVAmin {
	
	private WebDriver driver;
	public SignupBVAmin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PERSONAL\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/new/booksell/signup1.php");
        driver.manage().window().maximize();
	}
	
	@Test
    public void userbelow3() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("name")); 
        WebElement email=driver.findElement(By.name("email"));
        WebElement number=driver.findElement(By.name("phonenumber")); 
        WebElement password=driver.findElement(By.name("password"));
        WebElement verify=driver.findElement(By.id("conpassword"));

        username.sendKeys("qw");  
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
        assertNotEquals("qw",val1);
        assertNotEquals("ami@mail.com",val2);
        assertNotEquals("01625547789",val3);
        assertNotEquals("123456",val4);
        assertNotEquals("123456",val5);
        driver.close();
    }
	
	@Test
    public void phonebelow10() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("name")); 
        WebElement email=driver.findElement(By.name("email"));
        WebElement number=driver.findElement(By.name("phonenumber")); 
        WebElement password=driver.findElement(By.name("password"));
        WebElement verify=driver.findElement(By.id("conpassword"));

        username.sendKeys("elas");  
        email.sendKeys("ami@mail.com");
        number.sendKeys("0162554779");  
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
        assertNotEquals("elas",val1);
        assertNotEquals("ami@mail.com",val2);
        assertNotEquals("0162554779",val3);
        assertNotEquals("123456",val4);
        assertNotEquals("123456",val5);
        driver.close();
    }
	
	@Test
    public void passbelow6() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("name")); 
        WebElement email=driver.findElement(By.name("email"));
        WebElement number=driver.findElement(By.name("phonenumber")); 
        WebElement password=driver.findElement(By.name("password"));
        WebElement verify=driver.findElement(By.id("conpassword"));

        username.sendKeys("elas");  
        email.sendKeys("ami@mail.com");
        number.sendKeys("01625547792");  
        password.sendKeys("156");
        verify.sendKeys("156");  
        
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
        assertNotEquals("elas",val1);
        assertNotEquals("ami@mail.com",val2);
        assertNotEquals("01625547792",val3);
        assertNotEquals("156",val4);
        assertNotEquals("156",val5);
        driver.close();
    }
	
	@Test
    public void mailspecial() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("name")); 
        WebElement email=driver.findElement(By.name("email"));
        WebElement number=driver.findElement(By.name("phonenumber")); 
        WebElement password=driver.findElement(By.name("password"));
        WebElement verify=driver.findElement(By.id("conpassword"));

        username.sendKeys("elas");  
        email.sendKeys("ami.com");
        number.sendKeys("01625547079");  
        password.sendKeys("156222");
        verify.sendKeys("156222"); 
        
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
        assertNotEquals("elas",val1);
        assertNotEquals("ami.com",val2);
        assertNotEquals("01625547079",val3);
        assertNotEquals("156222",val4);
        assertNotEquals("156222",val5);
        driver.close();
    }
	
	@Test
    public void usernamebelow3() throws InterruptedException {   
        WebElement username=driver.findElement(By.name("name")); 
        WebElement email=driver.findElement(By.name("email"));
        WebElement number=driver.findElement(By.name("phonenumber")); 
        WebElement password=driver.findElement(By.name("password"));
        WebElement verify=driver.findElement(By.id("conpassword"));

        username.sendKeys("el");  
        email.sendKeys("ami@mail.com");
        number.sendKeys("01625547792");  
        password.sendKeys("156234");
        verify.sendKeys("156234");  
        
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
        assertNotEquals("el",val1);
        assertNotEquals("ami@mail.com",val2);
        assertNotEquals("",val3);
        assertNotEquals("",val4);
        assertNotEquals("",val5);
        driver.close();
    }
	
	
}