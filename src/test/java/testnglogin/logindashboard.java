package testnglogin;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class logindashboard {
    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Set up ExtentReports
        String reportPath = "G:\\chaitanya\\ExtentReport.html"; // ✅ Set your path here
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Tester", "Chaitanya");
        extent.setSystemInfo("OS", System.getProperty("os.name"));
    }

    @Test(priority = 1)
    public void openWebsite() {
        test = extent.createTest("Open Website Test");

        driver.get("https://practicetestautomation.com/practice-test-login/");
        String title = driver.getTitle();
        test.info("Opened website: " + driver.getCurrentUrl());

        assertEquals(title, "Test Login | Practice Test Automation");
        test.pass("Title matched: " + title);
    }

    @Test(priority = 2)
    public void positiveLoginTest() {
        test = extent.createTest("Positive Login Test");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");
        test.info("Entered username: student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        test.info("Entered password");

        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();
        test.info("Clicked on login button");

        assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));
        test.pass("Successfully logged in and verified URL");

        driver.navigate().back();
        test.info("Navigated back to login page");
    }

    @Test(priority = 3)
    public void negativeUsernameTest() {
        test = extent.createTest("Negative Username Test");

        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("incorrectUser");
        test.info("Entered invalid username");

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Password123");
        test.info("Entered valid password");

        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();
        test.info("Submitted form");

        WebElement errorMessage = driver.findElement(By.id("error"));
        assertTrue(errorMessage.isDisplayed(), "Error message should be visible");
        assertEquals(errorMessage.getText(), "Your username is invalid!");
        test.pass("Error message displayed for invalid username");
    }

    @Test(priority = 4)
    public void negativePasswordTest() {
        test = extent.createTest("Negative Password Test");

        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("student");
        test.info("Entered valid username");

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("WrongPassword");
        test.info("Entered invalid password");

        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();
        test.info("Clicked submit");

        WebElement error = driver.findElement(By.id("error"));
        assertTrue(error.isDisplayed(), "Error message should be visible");
        test.pass("Proper error message displayed for invalid password");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        if (extent != null) {
            extent.flush(); // 💾 Write everything to the report file
        }
    }
}
   
