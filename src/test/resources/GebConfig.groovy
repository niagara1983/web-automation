/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

waiting {
	timeout = 30
	retryInterval = 0.5
	includeCauseInMessage = true
}

reportsDir = "geb-reports"
atCheckWaiting = true
baseNavigatorWaiting = true

environments {

	chrome {
		driver = { new ChromeDriver() }
	}
	

	firefox {
		driver = { new FirefoxDriver() }
	}

    phantomJs {
        driver = { new PhantomJSDriver() }
    }

}

// To run the tests with all browsers just run “./gradlew test”

