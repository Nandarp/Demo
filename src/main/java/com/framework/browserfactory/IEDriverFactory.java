package com.framework.browserfactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.framework.driver.DriverConfig;
import com.framework.util.OSUtility;

public class IEDriverFactory extends AbstractWebDriverFactory implements IWebDriverFactory {

    public IEDriverFactory(final DriverConfig webDriverConfig1) {
        super(webDriverConfig1);
    }
/* This method is used to quit the driver
 */
    @Override
    public void cleanUp() {
        try {
            if (driver != null) {
                try {
                    driver.quit();
                } catch (WebDriverException ex) {
                    ex.printStackTrace();
                }

                driver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/* This method is used to invoke IE driver with all the capabilities assigned.
 * @returns ---- driver 
 */
    @Override
    public WebDriver createWebDriver() throws IOException {

        // killProcess();
        if (!OSUtility.isWindows()) {
            throw new RuntimeException("With gods grace IE browser is only supported on windows, Imagine a "
                    + "situation when you have to fix IE bugs on Unix and Mac as well");
        }

        DriverConfig cfg = this.getWebDriverConfig();

        driver = new InternetExplorerDriver(new IECapabilitiesFactory().createCapabilities(cfg));

        // Implicit Waits to handle dynamic element. The default value is 5 seconds.
        setImplicitWaitTimeout(cfg.getImplicitWaitTimeout());
        if (cfg.getPageLoadTimeout() >= 0) {
            driver.manage().timeouts().pageLoadTimeout(cfg.getPageLoadTimeout(), TimeUnit.SECONDS);
        }

        this.setWebDriver(driver);
        return driver;
    }
/* This method is used to kill the ongoing process. 
 */
    private void killProcess() {
        if (OSUtility.isWindows()) {
            try {
                Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
                Runtime.getRuntime().exec("taskkill /F /IM Iexplore.exe");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}