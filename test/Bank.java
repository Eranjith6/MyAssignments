package Sel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bank {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
	    driver.findElement(By.id("firstName")).sendKeys("Eranjith");
	    WebElement title = driver.findElement(By.id("title"));
	    Select go=new Select(title);
	    go.selectByVisibleText("Mr");
	    driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("S");
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kumar");
	    WebElement gender = driver.findElement(By.xpath("//select[@id='sex']"));
	    Select go1=new Select(gender);
        go1.selectByIndex(0);
        WebElement employ=driver.findElement(By.xpath("//select[@id='employmentStatus']"));
        Select go2=new Select(employ);
        go2.selectByVisibleText("Full-time");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Eranjith6");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("eranjithsanklar@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("kannan@159");
        //driver.close()
        
}}
