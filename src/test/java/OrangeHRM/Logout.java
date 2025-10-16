package OrangeHRM;

public class Logout extends BaseClass
{
	Elements ele;
	void logout()
	{
		ele= new Elements();
		driver.findElement(ele.profilepic).click();
}

}