import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

environments {

    chrome {
        driver = { new ChromeDriver() }
    }

    chromeHeadless {
        driver = {
            ChromeOptions o = new ChromeOptions()
            o.addArguments("headless")
            new ChromeDriver(o)
        }
    }

}