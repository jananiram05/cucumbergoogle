package cucumbergoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionForGmail {

	private final WebDriver driver = new ChromeDriver();

	@Given("User is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com/");
	}

	@When("User click the gmail button")
	public void user_click_the_gmail_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']")).click();
	}

	@When("User enters the signin button")
	public void user_enters_the_signin_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@data-action=\"sign in\"]")).click();
	}

	@Then("User should be in gmailpage")
	public void user_should_be_in_gmailpage() {
		// Write code here that turns the phrase above into concrete actions
		driver.get(
				"https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AYZoVhdUA6gPhw2Dm4l44vG2x86vjahYDOCMTCjIv7KwR_OrGTf-N_UU8FECgWkDXyQm2RgdyntopA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1494018509%3A1696457140739023&theme=glif");
		driver.quit();
	}

}
