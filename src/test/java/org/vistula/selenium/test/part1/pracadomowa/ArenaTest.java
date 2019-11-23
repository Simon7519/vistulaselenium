package org.vistula.selenium.test.part1.pracadomowa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ArenaTest {

    private WebDriver driver;

    @BeforeClass
    public static void setDriver() {

        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setup () {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.testarena.pl/zaloguj");
    }
    @After
    public void quit () {

        driver.quit();

    }

    @Test
    public void loginTest() {

        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

        driver.findElement(By.name("email")).sendKeys("administrator@testarena.pl");
        driver.findElement(By.name("password")).sendKeys("sumXQQ72$L");
        driver.findElement(By.id("save")).click();

        driver.findElement(By.className("icon_tools")).click();

        driver.findElement(By.className("button_link")).click();

        driver.findElement(By.name("name")).sendKeys("nowy projekt1");
        driver.findElement(By.name("prefix")).sendKeys("100");
        driver.findElement(By.id("save")).click();

        driver.findElement(By.className("activeMenu")).click();

        driver.findElement(By.id("search")).sendKeys("nowy projekt1");
        driver.findElement(By.id("j_searchButton")).click();


    }


}
