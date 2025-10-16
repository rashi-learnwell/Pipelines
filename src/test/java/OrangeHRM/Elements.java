package OrangeHRM;

import java.time.LocalDate;

import org.openqa.selenium.By;

public class Elements 
{
	//Login web element

	By username=By.name("username");
	By password=By.name("password");
	By login=By.xpath("//button[@type='submit']");
	
	
	// logout
	
	By profilepic=By.xpath("//img[@class='oxd-userdropdown-img']");
	

}
