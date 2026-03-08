package org.ln678090.webtesrt;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class web1Test {
    static String EMAIL;
    static String USERNAME;
    @BeforeAll
   static void setUp() {
        EMAIL = System.currentTimeMillis() + "dsddf@gmail.com";
        USERNAME = System.currentTimeMillis() + "dsddf";
    }

    @AfterEach
    void tearDown() {
    }
@Test
@Order(1)
    void web1Test1() {
    ChromeOptions options = new ChromeOptions();
    if(System.getenv("CI") != null){
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
    }


    WebDriver driver = new ChromeDriver(options);
    driver.get("https://loppytoon.com/dang-ky");
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
   try {
       driver.findElement(By.id("user_name")).sendKeys(USERNAME);
       driver.findElement(By.name("email")).sendKeys(EMAIL);
       driver.findElement(By.name("password")).sendKeys("328799eeeww");
       driver.findElement(By.name("password_confirmation")).sendKeys("328799eeeww");
       driver.findElement(By.xpath("//button[text()='Đăng ký']")).click();
       WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Đăng nhập']")));
       assertTrue(element.isDisplayed());
   } finally {
       driver.quit();
   }

    }
@Test
@Order(2)
    void web1Test2() {

    ChromeOptions options = new ChromeOptions();
    if(System.getenv("CI") != null){
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
    }


    WebDriver driver = new ChromeDriver(options);
    driver.get("https://loppytoon.com/dang-nhap");
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
   try {
       driver.findElement(By.name("email_or_username")).sendKeys(EMAIL);
       driver.findElement(By.name("password")).sendKeys("328799eeeww");
       driver.findElement(By.xpath("//button[text()='Đăng nhập']")).click();
       assertTrue(driver.getCurrentUrl().contains("loppytoon.com"));
   } finally {
       driver.quit();
   }

    }

}