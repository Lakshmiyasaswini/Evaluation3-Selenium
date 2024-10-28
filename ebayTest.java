package Assessment3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		// Click on the Advanced link beside the main search bar
		WebElement advancedlink = driver.findElement(By.linkText("Advanced"));
		advancedlink.click();
		
		// Fill in the Advanced Search fields
		driver.findElement(By.id("_nkw")).sendKeys("shoes adidas");
		
		driver.findElement(By.name("_in_kw")).sendKeys("Exact words, exact order");
		
		driver.findElement(By.id("_ex_kw")).sendKeys("adidas, S, L, M");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		

	}

}
