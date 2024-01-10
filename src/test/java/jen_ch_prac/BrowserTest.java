package jen_ch_prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTest {
	@Test
public void c1() {
	WebDriver driver = new ChromeDriver();

	System.out.println("browser launch");
}
}
