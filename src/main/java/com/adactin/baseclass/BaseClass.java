package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						".\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						".\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

			else {
				System.out.println("Invalid Browsername");

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	// getclose
	public static void browserClose(String close) {
		try {
			driver.get(close);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// getclick
	public static void browserClick(String click) {
		try {
			driver.get(click);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// getquit
	public static void Quit(String quit) {
		try {
			driver.get(quit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// browsernavigate
	public static void browserNavigate(String navigate) {
		try {
			driver.get(navigate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// navigate url
	public static void browserNavigateto(String navigateto) {
		try {
			driver.navigate().to("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// navigateback
	public static void browserNavigateback(String Navigateback) {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// navigateforward
	public static void navigateforward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// navigaterefresh
	public static void navigaterefresh() {
		driver.navigate().refresh();

	}

	// gettitle
	public static void Gettitle() {
		driver.getTitle();

	}

	// webelementenable
	public static void enable(WebElement element) {

		try {
			element.isEnabled();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// webelementdispaly
	public static void displayed(WebElement element) {

		try {
			element.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// webelementselected
	public static void selceted(WebElement element) {

		try {
			element.isSelected();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// webelementclear
	public static void clear(WebElement element) {

		try {
			element.clear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void text(WebElement element) {

		try {
			System.out.println(element.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// getcurrenturl
	public static void currenturl() {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// attributesvalue
	public static void attributes(WebElement element, String value) {
		try {
			String attributes = element.getAttribute(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}

	}

	// getoptions
	public static void options(WebElement element) {

		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement s1 : options) {
			System.out.println(s1.getText());

		}

	}

	// elementdoubleclick
	public static void doubleclick(WebElement elemnt) {
		Actions a = new Actions(driver);
		a.doubleClick(elemnt).build().perform();

	}
	public static  void implicitywait() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	// elementdoubleclick
	public static void rightclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();

	}

	// sendkeys
	public static void inputToElement(WebElement element,  String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// browserget
	public static void browserget(String get) {
		try {
			driver.get(get);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// browsergeturl
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// webelementclick
	public static void clickonewebelement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// mouseoveractions
	public static void movetoelement(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	// selectdropdown
	public static void Selectdropdown(WebElement element, String value, String option) {
		if (option.equalsIgnoreCase("value")) {
			Select s = new Select(element);
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("text")) {
			Select s1 = new Select(element);
			s1.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			Select s2 = new Select(element);
			s2.selectByIndex(Integer.parseInt(value));

		}

	}

	// alert
	public static void alertok() {
		try {
			Alert a1 = driver.switchTo().alert();
			a1.accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void alertcancel() {
		try {
			Alert con = driver.switchTo().alert();
			con.dismiss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void promptalert() {
		try {
			Alert prompt = driver.switchTo().alert();
			prompt.sendKeys("need to enter");
			prompt.accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void scrollup(WebElement elements) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", elements);
			js.executeScript("window.scrollBy(0,1000");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// frames
	public static void singleframe(String value) {
		try {
			driver.switchTo().frame(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void frames(String element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//by index
	public static  void framesindex() {
		try {
			driver.switchTo().frame(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// defaultcontent
	public static void defaultcontent() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// robotic class
	public static void robot() throws AWTException {

		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// radiobutton
	public static void radiobutton(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// windowshandle
	public static void windowHandles(char[] title, String value) {

		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		Set<String> allid = driver.getWindowHandles();
		for (String id : allid) {
			System.out.println(id);
			driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}
		String actualTitle = value;
		for (String id : allid) {
			if (driver.switchTo().window(id).equals(actualTitle)) {
				break;

			}

		}

	}

	// explitwait
	public static void explicitWait(long timeOutInSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	// fluentwait
	public static void Fluentwait(Class exceptionType) {
		try {
			Wait Wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(15, TimeUnit.SECONDS)
					.ignoring(exceptionType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static  void getScreenshot( String fileName) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourcefile = ts.getScreenshotAs(OutputType.FILE);
			File desFile = new File(System.getProperty("user.dir")+"\\Screenshot\\"+fileName+".png");
			FileUtils.copyFile(sourcefile, desFile);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	//get options

	public static void getoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
			
		}

	}

	// close
	public static void close() {
		driver.close();

	}

	// quit
	public static void quit() {
		driver.quit();

	}

}
