package Sel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tamilmatrimony.in/");
		WebElement profile = driver.findElement(By.id("REGISTERED_BY"));
		Select from=new Select(profile);
		from.selectByVisibleText("Myself");
		driver.findElement(By.id("NAME")).sendKeys("eranjith");
		driver.findElement(By.id("gendermale")).click();
		WebElement from1 = driver.findElement(By.id("DOBDAY"));
		Select down=new Select(from1);
		down.selectByVisibleText("31");
		WebElement drop = driver.findElement(By.id("DOBMONTH"));
		Select go=new Select(drop);
		go.selectByVisibleText("Oct");
		WebElement home = driver.findElement(By.id("DOBYEAR"));
		Select go1=new Select(home);
		go1.selectByVisibleText("2000");
		WebElement joke = driver.findElement(By.id("MOTHERTONGUE"));
		Select select=new Select(joke);
		select.selectByVisibleText("Tamil");
		WebElement real = driver.findElement(By.id("COUNTRY"));
		Select lake=new Select(real);
		lake.selectByVisibleText("India");
		driver.findElement(By.id("MOBILENO")).sendKeys("8015544743");
		driver.findElement(By.id("EMAIL")).sendKeys("eranjithsan");
		//driver.close();
		
	}

}
