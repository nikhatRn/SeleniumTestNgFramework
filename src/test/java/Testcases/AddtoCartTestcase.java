package Testcases;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddtoCartTestcase {
	@Test
	public void verifycartAmount() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		String iphoneprice=driver.findElement(By.xpath("//p[@class='price']")).getText();
		System.out.println(iphoneprice);
		String []iphonearray=iphoneprice.split(" ");
		System.out.println(Arrays.toString(iphonearray));
		String iphonecost=iphonearray[0];
		System.out.println(iphonecost);
		String FinaliphonePrice=iphonecost.replaceAll("[^\\d.]", "");
		System.out.println(FinaliphonePrice);
		
		double iphonepricedoubleA = Double.parseDouble(FinaliphonePrice); 
		//Add to cart
		driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Samsung");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		String Samsungprice=driver.findElement(By.xpath("(//div[@class='caption']/p)[4]")).getText();
		System.out.println(Samsungprice);
		String []Samsungarray=Samsungprice.split(" ");
		System.out.println(Arrays.toString(Samsungarray));
		String Samsungcost=Samsungarray[0];
		System.out.println(Samsungcost);
		String FinalSamsungPrice=Samsungcost.replaceAll("[^\\d.]", "");
		System.out.println("****************");
		System.out.println(FinalSamsungPrice);
		double SamsungpricedoubleB=Double.parseDouble(FinalSamsungPrice);
		driver.findElement(By.xpath("(//div[@class='button-group']//button)[4]")).click();
		double AdditionOfboth= iphonepricedoubleA+SamsungpricedoubleB;
		System.out.println(AdditionOfboth);
		driver.findElement(By.xpath("(//button[@type='button']//i)[2]")).click();
		
		
		
		}
		
		
		}

