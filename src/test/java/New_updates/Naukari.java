package New_updates;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukari {
public static void main(String[] args) throws Throwable {
	
	WebDriverManager.chromedriver().create();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	//click login
	driver.findElement(By.xpath("//a[@id='login_Layer']")).click();// sendKeys("admin");
	//enter username
	WebElement l = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("arguments[0].click();", l);
	driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("rahulkolambe@gmail.com");
	//enter password
	driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Naukri@456");
	//click on login btn
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(5000);
	//click on Update profile btn
	driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		Thread.sleep(5000);
		//click on Resume Headline Edit btn
	driver.findElement(By.xpath("(//span[text()='Edit'])[2]")).click();
	Thread.sleep(5000);
	//click on (Resume Headline Edit) Save btn (//button[@class='waves-effect waves-light btn-large blue-btn'])[4] //button[text()='Save']
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	Thread.sleep(3000);
	//click on Upload Resume btn
	driver.findElement(By.xpath("//a[text()='Upload']")).click();
	 // FILE UPLOADING USING SENDKEYS
		WebElement browse = driver.findElement(By.xpath("//input[@id='attachCV']"));
	//click on ‘Choose file’ to upload the desired file
		browse.sendKeys("C:\\Users\\Rahul\\Downloads\\Resume.pdf");	
	Thread.sleep(3000);
	driver.close();

}
}
