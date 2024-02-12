package org.step;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefnition extends Baseclass {
	@Given("To validate performance of main page")
	public void to_validate_performance_of_main_page() throws IOException {
		launchTheBrowser();
		launchUrl("https://www.conqt.com/");
		driver.manage().window().maximize();
		WebElement findVendor = driver.findElement(By.xpath("//button[text()='Find Vendor']"));
		findVendor.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File img1 = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Testid01\\Main Page\\fv.png");
		FileUtils.copyFile(img1, f);
		driver.navigate().back();
		WebElement findCustomer = driver.findElement(By.xpath(" //button[text()='Find Customer']"));
		findCustomer.click();
		File img2 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Testid01\\Main Page\\Fc.png");
		FileUtils.copyFile(img2, f2);
		driver.navigate().back();
		WebElement CallXpert = driver.findElement(By.xpath("//span[text()='Call Expert']"));
		CallXpert.click();
		File img3 = ts.getScreenshotAs(OutputType.FILE);
		File f3 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Testid01\\Main Page\\CallXpert.png");
		FileUtils.copyFile(img3, f3);
		WebElement closebtn = driver.findElement(By.xpath("//button[@class='popup-close-btn']"));
		closebtn.click();
		WebElement menu = driver.findElement(By.xpath("(//img[@src='/static/media/signIcon.ee762690aadd6296a6fafa4ad14cfc0c.svg'])[1]"));
		menu.click();
		WebElement login = driver.findElement(By.xpath("(//a[@class='sign-card'])[1]"));
		login.click();
		File img4 = ts.getScreenshotAs(OutputType.FILE);
		File f4 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Testid01\\Main Page\\loginpage.png");
		FileUtils.copyFile(img4, f4);
		driver.navigate().back();
		WebElement m = driver.findElement(By.xpath("(//img[@src='/static/media/signIcon.ee762690aadd6296a6fafa4ad14cfc0c.svg'])[1]"));
		m.click();
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		signup.click();
		File img5 = ts.getScreenshotAs(OutputType.FILE);
		File f5 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Testid01\\Main Page\\signup.png");
		FileUtils.copyFile(img5, f5);
		driver.navigate().back();
		WebElement allcata = driver.findElement(By.id("dropdown-category"));
		allcata.click();
		WebElement sft = driver.findElement(By.xpath("//div[text()='Software']"));
		sft.click();
		System.out.println("Software Dropdowns are :");
		List<WebElement> elements = driver.findElements(By.xpath("//a[@class='submenuitem dropdown-item']"));
		for (WebElement j : elements) {
			String name = j.getText();
			System.out.println(name);
		}
		WebElement byindustry = driver.findElement(By.id("dropdown-industry"));
		byindustry.click();
		System.out.println("");
		System.out.println("By Industry options are:");
		List<WebElement> indus = driver.findElements(By.xpath("//a[@class='dropdown-item']"));
		for (WebElement j : indus) {
			String text = j.getText();
			System.out.println(text);
			
		}
		WebElement dept = driver.findElement(By.id("dropdown-department"));
		dept.click();
		List<WebElement> deptoptions = driver.findElements(By.xpath("//a[@class='dropdown-item']"));
		for (WebElement i : deptoptions) {
			String text = i.getText();
			System.out.println(text);
			
		}
		
		
		String s = "C:\\Users\\ADMIN\\eclipse-workspace\\Testid01\\Main Page\\img.png";
		String x = "(//p[@class='header-links px-3'])[xx]";
		for (int i = 1; i < 4; i++) {
			String y = Integer.toString(i);
			WebElement ele = driver.findElement(By.xpath(x.replace("xx", y)));
			ele.click();
			
			File image = ts.getScreenshotAs(OutputType.FILE);
			File fs = new File(s.replace("img", y));
			FileUtils.copyFile(image, fs);
			
			
		}
		closebrowser();
		


	}

	@When("To check the product page")
	public void to_check_the_product_page() throws IOException {
		launchTheBrowser();
		launchUrl("https://www.conqt.com/view-all-product");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String s = "(//h5[text()='Get Pricing'])[xx]";
		//for (int i = 1; i < 17; i++) {
		//	String y = Integer.toString(i);
		//	WebElement allproduct = driver.findElement(By.xpath(s.replace("xx", y)));
		//	allproduct.click();
		//	String name = allproduct.getText();
		//	System.out.println(name);
			
		//}
		TakesScreenshot t = (TakesScreenshot) driver;
		File img = t.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Testid01\\Product\\allproducts.png");
		FileUtils.copyFile(img, f);
	

		closebrowser();


	}

	@When("To analyze user experience in AWS Cloud page")
	public void to_analyze_user_experience_in_AWS_Cloud_page() throws IOException {
		launchTheBrowser();
		driver.get("https://www.conqt.com/AWS-Cloud-Storage");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement getdemo = driver.findElement(By.xpath("(//button[text()='Get Free Demo'])[1]"));
		a.moveToElement(getdemo).doubleClick().perform();
		TakesScreenshot t = (TakesScreenshot) driver;
		File img = t.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Testid01\\AWS Cloud\\demo.png");
		FileUtils.copyFile(img, f);
		WebElement close = driver.findElement(By.xpath("//div[@class='closebtn']"));
		close.click();

		 String xp = "(//p[@class='tag-names'])[xx]";
		 String path = "C:\\Users\\ADMIN\\eclipse-workspace\\Testid01\\AWS Cloud\\demo.png";
		 for (int i = 1; i < 6; i++) {
			 String y = Integer.toString(i);
			 WebElement details = driver.findElement(By.xpath(xp.replace("xx", y)));
			 String text = details.getText();
			
			 a.moveToElement(details).doubleClick().perform();
			 File image = t.getScreenshotAs(OutputType.FILE);
			 File fs = new File(path.replace("demo", text));
			 FileUtils.copyFile(image, fs);
			 
			 
			
		}
		 closebrowser();

	}

	@When("To analyze user experience FAQs page")
	public void to_analyze_user_experience_FAQs_page() throws IOException {
		launchTheBrowser();
		driver.get("https://www.conqt.com/faqs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement cs = driver.findElement(By.xpath("//h2[@class='faq-about-registration-heading ']"));
		js.executeScript("arguments[0].scrollIntoView(false)", cs);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image1 = ts.getScreenshotAs(OutputType.FILE);
		File f1 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Testid01\\FAQs\\firstpage.png");
		FileUtils.copyFile(image1, f1);
		Actions a = new Actions(driver);
		String x = "(//button[@class='accordion-button faq-button collapsed'])[xx]";
		for (int i = 1; i < 18; i++) {
			String y = Integer.toString(i);
			WebElement querys = driver.findElement(By.xpath(x.replace("xx", y)));
			a.moveToElement(querys).doubleClick().perform();
			
			
		}
		closebrowser();

	}

	@When("To check Conqt University page")
	public void to_check_Conqt_University_page() {
		launchTheBrowser();
		driver.get("https://www.conqt.com/conqt-university");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String header = "(//div[@class='individual-card'])[xx]";
		for (int i = 1; i < 4; i++) {
			String y = Integer.toString(i);
			WebElement head = driver.findElement(By.xpath(header.replace("xx", y)));
			String text = head.getText();
			System.out.println(text);
			
		}
		Actions a = new Actions(driver);
		String footer = "(//button[@type='button'])[xx]";
		for (int i = 1; i < 10; i++) {
			String y = Integer.toString(i);
			WebElement foot = driver.findElement(By.xpath(footer.replace("xx", y)));
			a.moveToElement(foot).doubleClick().perform();
			
		}

	}

	@Then("Quit Browser")
	public void quit_Browser() {
		driver.quit();

	}

}
