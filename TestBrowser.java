package WebDriverArch;

public class TestBrowser {

	public static void main(String[] args) {
		
		//FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver driver= new EdgeDriver();
		
		driver.get("https://www.amazon.com");//NPE
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement("emailId");
		driver.findElement("password");
		driver.sendKeys("emailId", "admin@gmail.com");
		driver.sendKeys("password", "admin@123");
		driver.click("login button");
		
		driver.close();
		
	}

}
