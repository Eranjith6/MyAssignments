package Sel.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[text()='Create New Account'])")).click();
		
		
		
		

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("eranjith");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8015544743");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("kannan@123");
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select test=new Select(date);
		test.selectByVisibleText("31");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select test1=new Select(month);
		test1.selectByVisibleText("Oct");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select test2=new Select(year);
		test2.selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//driver.close();
		
		
		
		
		
	}

}
