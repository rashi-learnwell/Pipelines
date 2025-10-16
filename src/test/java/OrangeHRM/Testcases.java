package OrangeHRM;

import java.io.IOException;

import org.testng.annotations.Test;

public class Testcases extends BaseClass
{
  Login LG;
  Logout Log;
  @Test
  (priority=1)
  void Logintest() throws IOException, InterruptedException
  {
	  LG=new Login();
	  
	  LG.validlogin();
  }
  
 @Test
 (priority=2)
 void Logout()
 {
	 Log= new Logout();
	 
	 Log.logout();

	 }
 
}
