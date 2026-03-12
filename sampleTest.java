import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SampleTest extends TestBase {

    @Test
    public void testGoogleTitle() {
        WebDriver driver = getDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        assertTrue(title.contains("Google"));
    }

    @Test
    public void testExampleCom() {
        WebDriver driver = getDriver();
        driver.get("https://example.com");
        String heading = driver.findElement(By.tagName("h1")).getText();
        assertTrue(heading.contains("Example Domain"));
    }
}
