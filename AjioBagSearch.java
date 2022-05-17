package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioBagSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		WebElement bagCounts = driver.findElement(By.xpath("//div[@class=\"length\"]"));
		String bags = bagCounts.getText();
		System.out.println(bags);
		//driver.findElement(By.xpath("//div[@class='facet-head ']/span[text()='brands']")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\"facets\"]/div[2]/ul/li[4]/div/div/div[2]/ul//label"));
		for( WebElement e : findElements)
		{
			String text3 = e.getText();
			System.out.println(" The brand names are " +text3);
		}
		
		
		System.out.println("=======================================");
		List<WebElement>Listofbagnames = driver.findElements(By.id("products"));
		for (WebElement bagnamess : Listofbagnames) {
			
			String text2 = bagnamess.getText();
			System.out.println(text2);
			
		}

	}

}
