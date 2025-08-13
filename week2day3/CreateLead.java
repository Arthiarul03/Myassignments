package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
     	driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		Thread.sleep(1000);
        driver.findElement(By.name("firstNameLocal")).sendKeys("arthi");
    	Thread.sleep(1000);
    	 driver.findElement(By.name("lastNameLocal")).sendKeys("a");
     	Thread.sleep(1000);
		driver.findElement(By.name("generalProfTitle")).sendKeys("Ms");
		Thread.sleep(1000);
        driver.findElement(By.className("smallSubmit")).click();
        String Title=driver.getTitle();
        System.out.println(Title);
		driver.close();
	}

}
