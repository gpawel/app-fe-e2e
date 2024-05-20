package com.learnfromscratch.app_fe.e2e;

import com.learnfromscratch.app_fe.e2e.pages.InitialPage;
import com.qamission.example.driver.ChromeDriverFactory;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;
import org.testng.annotations.*;

public class GetMessagePageTest {
    private WebDriver driver;
    private InitialPage initialPage;

    private final Logger logger = LoggerFactory.getLogger(GetMessagePageTest.class);

    @BeforeTest
    public void setUpClass() {
        logger.info("running BeforeTest");
        driver = ChromeDriverFactory.createDefaultChromeDriver();
        driver.get("http://localhost:3000");
        initialPage = new InitialPage(driver);
    }

    @AfterTest
    public void tearDownClass() {
        logger.info("running AfterTest");
        initialPage = null;
        driver.close();
        driver.quit();
    }

    @Test
    public void checkBackendHeaderValue() {
        logger.info("running checkBackendHeaderValue");
        assertEquals(initialPage.getBackEndHeaderValue(),"Hi from backend!!");
        Reporter.log("checkBackendHeaderValue is completed");
    }
    @Test
    public void checkFunctionHeaderValue() {
        logger.info("running checkFunctionHeaderValue");
        assertEquals(initialPage.getFunctionHeaderValue(),"Hello World from Function Component!");
        Reporter.log("checkFunctionHeaderValue is completed");
    }
    @Test
    public void checkComponentHeaderValue() {
        logger.info("running checkComponentHeaderValue");
        assertEquals(initialPage.getComponentHeaderValue(),"Hello World from Class Component!");
        Reporter.log("checkComponentHeaderValue is completed");
    }
}
