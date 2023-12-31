package ru.netology;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;


class CardOrderTest {
            private WebDriver driver;

            @BeforeAll
            public static void setupAll() {

                WebDriverManager.chromedriver().setup();
            }

            @BeforeEach
            void setUp() {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--no-sandbox");
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
                driver.get("http://localhost:9999");
            }

            @AfterEach
            void tearDown() {
                driver.quit();
                driver = null;
            }

            @Test
            void shouldOraerCardTestV1() {
            List<WebElement> elements = driver.findElements(By.className("input__control"));
//        elements.get(0).sendKeys("Василий");
//        elements.get(1).sendKeys("+79270000000");
//        driver.findElement(By.className("checkbox__box")).click();
//        driver.findElement(By.className("button")).click();
//            String text = driver.findElement(By.className("alert-success")).getText();
//            assertEquals("Ваша заявка успешно отправлена!", text.trim());
        }
        }
