package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args) {
		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		// open url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// To maximize the screen
		driver.manage().window().maximize();
		// Find element and enter username 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhargavi");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("6785");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Srinivas");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("60");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Working as a Tester");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("experienced in testing");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("Ramapuram");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aparnabalakrishnan25@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Rampuram,Chennai");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");

	}

}



  